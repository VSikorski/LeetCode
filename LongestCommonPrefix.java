class Solution {
    public String longestCommonPrefix(String[] strs) {
       String result = "";
       // Identifying the min word length
       int min = 100, minIndexAt = 0;
       for (int i = 0; i < strs.length; i++) {
           if (strs[i].length() < min) {
               min = strs[i].length();
               minIndexAt = i;
           }
       }
       // Checking the i character of each word
       for (int i = 0; i < min; i++) {
           for (int j = 0; j < strs.length; j++) {
               if (strs[j].charAt(i) != strs[minIndexAt].charAt(i)) {
                   return result;
               }
           }
           result += strs[minIndexAt].charAt(i);
       }
       return result;
    }
}
