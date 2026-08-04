class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp= new int[cost.length];
        Arrays.fill(dp,-1);
        int l=cost.length;
        return Math.min(minCost(dp, cost, l-1),minCost(dp, cost, l-2) );
    }
    public int minCost(int[] dp, int[] c, int i){
        if(i==0) return c[i];
        else if(i==1) return c[i];

        if(dp[i] != -1) return dp[i];

        int jump1= minCost(dp, c,i-1) + c[i];
        int jump2= minCost(dp, c,i-2) + c[i];
        dp[i]= Math.min(jump1, jump2);
        return dp[i];
    }
}
