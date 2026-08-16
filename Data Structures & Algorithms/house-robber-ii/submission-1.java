class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n ==1) return nums[0];
        return Math.max(maxAmt(nums,0, n-1),maxAmt(nums,1, n));
    }
    public int maxAmt(int[] nums,int l,int r){
        int len=r-l;
        if (len == 1) return nums[l];
        int[] dp=new int[len];
        dp[0]= nums[l];
        dp[1]= Math.max(nums[l], nums[l+1]); 
        for(int i=2; i< len; i++){
            dp[i]=Math.max(nums[l+i]+ dp[i-2], dp[i-1]);
        }
        return dp[len-1];     
    }
}
