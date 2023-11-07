class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> nums_set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums_set.contains(nums[i])) return true;
            nums_set.add(nums[i]);
        }
        return false;
    }
}
/*
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
*/
