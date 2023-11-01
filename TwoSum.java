class Solution {
    public int[] twoSum(int[] nums, int target) {
        int tempArr[] = {0, 0};
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    tempArr[0] = i;
                    tempArr[1] = j;
                    return tempArr;
                }
            }
        }
        return tempArr;
    }
}

/*
Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
*/
