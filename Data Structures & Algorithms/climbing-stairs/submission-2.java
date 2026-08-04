class Solution {
    public int climbStairs(int n) {
        if(n<=2) return n;
        int[] dp= new int[n+1];
        return ways(dp, n);        
    }
    public int ways(int[] dp,int n){
        if(n<=2) return n;
        if(dp[n] != 0) return dp[n];
        dp[n]=ways(dp, n-1)+ ways(dp, n-2);
        return dp[n];
    }
}
