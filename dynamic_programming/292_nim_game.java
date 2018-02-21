/*
 You are playing the following Nim Game with your friend: There is a heap of stones on the table, each time one of you take turns to remove 1 to 3 stones. The one who removes the last stone will be the winner. You will take the first turn to remove the stones.

Both of you are very clever and have optimal strategies for the game. Write a function to determine whether you can win the game given the number of stones in the heap.

For example, if there are 4 stones in the heap, then you will never win the game: no matter 1, 2, or 3 stones you remove, the last stone will always be removed by your friend. 
*/

// method 1: DP
class Solution {
    public boolean canWinNim(int n) {
        if (n <= 0) throw new IllegalArgumentException();
        if (n <= 3) return true;
        boolean[] result = new boolean[n+1];
        result[0] = true;
        result[1] = true;
        result[2] = true;
        result[3] = true;
        for (int i = 4; i <= n; i++) {
            result[i] = !(result[i-1] && result[i-2] && result[i-3]);
        }
        return result[n];
    }
}

// method 2: math
class Solution {
    public boolean canWinNim(int n) {
        if (n <= 0) throw new IllegalArgumentException();
        if (n <= 3) return true;
        return n % 4 != 0;
    }
}
