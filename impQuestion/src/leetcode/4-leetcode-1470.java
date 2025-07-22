// leetcode.com/problems/shuffle-the-array/description/


class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] ans= new int [nums.length];
        
        int index = 0;
        for(int i = 0; i< nums.length ; i++){
            ans[index] = nums[i];
            ans[index+1] = nums[n+i];
            index+=2;
        }
        return ans;
        
    }
}