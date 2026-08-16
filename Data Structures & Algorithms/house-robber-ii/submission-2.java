class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n ==1) return nums[0];
        return Math.max(maxAmt(nums,0, n-1),maxAmt(nums,1, n));
    }
    public int maxAmt(int[] nums,int l,int r){
        if (r-l == 1) return nums[l];
        int pick= nums[l];
        int notpick= Math.max(nums[l], nums[l+1]); 
        for(int i=l+2; i<r; i++){
            int amt=Math.max(nums[i]+ pick, notpick);
            pick=notpick;
            notpick=amt;
        }
        return Math.max(pick, notpick);     
    }
}
