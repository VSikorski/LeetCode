class Solution {
    public int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I':
                    if (i != s.length() - 1 && (s.charAt(i+1) == 'V' || s.charAt(i+1) == 'X')) {
                        result--;
                    } else {
                        result++;
                    }
                    break;
                case 'V':
                    result += 5;
                    break;
                case 'X':
                    if (i != s.length() - 1 && (s.charAt(i+1) == 'L' || s.charAt(i+1) == 'C')) {
                        result -= 10;
                    } else {
                        result += 10;
                    }
                    break;
                case 'L':
                    result += 50;
                    break;
                case 'C':
                    if (i != s.length() - 1 && (s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M')) {
                        result -= 100;
                    } else {
                        result += 100;
                    }
                    break;
                case 'M':
                    result += 500;
                case 'D':
                    result += 500;
                    break;
            }
        }
        return result;
    }
}

/*
Example 3:
Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
*/
