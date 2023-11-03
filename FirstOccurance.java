class Solution {
    public int strStr(String haystack, String needle) {
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            String tempStr = "";
            for (int j = i; j < i + needle.length(); j++) {
                tempStr += haystack.charAt(j);
            }
            if (tempStr.equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
/*
Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
*/
