class Solution {
    public boolean isPowerOfTwo(int n) {
        for (int i = 0; i <= n / 2 + 1; i++) {
            double pow = Math.pow(2,i);
            if (pow == n) return true;
            if (pow > n) return false; 
        }
        return false;
    }
}
/*
Input: n = 16
Output: true
Explanation: 24 = 16
*/
