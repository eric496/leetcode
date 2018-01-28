/*
Given numRows, generate the first numRows of Pascal's triangle.

For example, given numRows = 5,
    Return
    [
         [1],
        [1,1],
       [1,2,1],
      [1,3,3,1],
     [1,4,6,4,1]
    ]
*/

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (numRows <= 0) return result;
        result.add(new ArrayList<>(Arrays.asList(1)));
        result.add(new ArrayList<>(Arrays.asList(1,1)));
        if (numRows == 1) {
            result.remove(1);
            return result;
        }
        if (numRows == 2) return result;
        for (int i = 2; i < numRows; i++) {
            List<Integer> currentLevel = new ArrayList<>();
            currentLevel.add(1);
            int prevLevelSize = result.get(i-1).size();
            for (int j = 0; j < prevLevelSize-1; j++) {
                currentLevel.add(result.get(i-1).get(j)+result.get(i-1).get(j+1));
            }
            currentLevel.add(1);
            result.add(currentLevel);
        }
        return result;
    }
}
