class Solution {
    public int lengthOfLastWord(String s) {
        int counter = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (counter == 0 && s.charAt(i) == ' ') {
                continue;
            }
            else if (s.charAt(i) == ' ') {
                break;
            }
            else {
                counter++;
            }
        }
        return counter;
    }
}
/*
Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
*/
