class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == 0) {
                k++;
            }
            else if (nums[i-1] == nums[i]) {
                nums[i] = 999999;
            } else {
                k++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i+1] < nums[i]) {
                    int temp = nums[i+1];
                    nums[i+1] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        return k;
    }
}

/*
Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
*/
