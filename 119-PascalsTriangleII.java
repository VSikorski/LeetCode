/*
Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.

Example 1:
Input: rowIndex = 3
Output: [1,3,3,1]

Example 2:
Input: rowIndex = 0
Output: [1]

Example 3:
Input: rowIndex = 1
Output: [1,1]
*/

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> oldArr = new ArrayList<>();
        List<Integer> newArr = new ArrayList<>();
        oldArr.add(1);
        
        if (rowIndex == 0) {
            return oldArr;
        }
        oldArr.add(1);
        if (rowIndex == 1) {
            return oldArr;
        }

        for (int i=2; i <= rowIndex; i++) {
            newArr = new ArrayList<>();
            newArr.add(1);
            for (int j = 1; j < i; j++) {
                newArr.add(oldArr.get(j-1) + oldArr.get(j));
            }
            newArr.add(1);
            oldArr = new ArrayList<>(newArr);
        }

        return oldArr;
    }
}
