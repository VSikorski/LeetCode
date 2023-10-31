class Solution {
    public boolean isPalindrome(int x) {
        int tempX = x, rev = 0;
        while (tempX > 0) {
            rev = rev * 10 + tempX % 10;
            tempX /= 10;
        }
        if (rev == x) return true;
        return false;
    }
}

/*
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
*/
