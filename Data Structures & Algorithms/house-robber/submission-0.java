class Solution {
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp, -1);
        return maxAmt(nums,dp, nums.length-1);
    }
    public int maxAmt(int[] nums, int[] dp ,int i){
        if(i == 0) return nums[i];
        else if (i <0) return 0;

        if(dp[i] != -1) return dp[i];
        int pick= nums[i] + maxAmt(nums,dp, i-2);
        int notpick= 0+ maxAmt(nums, dp,i-1);
        dp[i]=Math.max(pick, notpick);
        return dp[i];        
    }
}