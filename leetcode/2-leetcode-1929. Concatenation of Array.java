// 1929. Concatenation of Array
//link - https://leetcode.com/problems/concatenation-of-array/




class Solution {
    public int[] getConcatenation(int[] nums) {
        int ans[] = new int[2 * nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
        }

        int index = nums.length;
        for (int i = 0; i < nums.length; i++) {
            ans[index] = nums[i];
            index++;
        }

        return ans;
    }
}
// Time Complexity: O(n)
// Space Complexity: O(n)   
