// Two sum
// Runtime: 19 ms, faster than 30.73% of Java online submissions for Two Sum.
// Memory Usage: 37.4 MB, less than 98.95% of Java online submissions for Two Sum.
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
             if (nums[i] + nums[j] == target)
                 return new int[] {i, j};
            }
        }
        return null;
    }
}
