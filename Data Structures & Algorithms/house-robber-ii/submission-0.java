class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int[] dp=new int[nums.length];
        Arrays.fill(dp, -1);
        int pickFirst=maxAmt(nums,dp,0, nums.length-2);
        Arrays.fill(dp,-1);
        int notPickFirst=maxAmt(nums,dp,1, nums.length-1);
        return Math.max(pickFirst,notPickFirst);
    }
    public int maxAmt(int[] nums, int[] dp ,int l,int r){
        if(r==l) return nums[r];
        else if (r <l) return 0;

        if(dp[r] != -1) return dp[r];
        int pick= nums[r] + maxAmt(nums,dp,l, r-2);
        int notpick= 0+ maxAmt(nums, dp,l,r-1);
        dp[r]=Math.max(pick, notpick);
        return dp[r];        
    }
}
