class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n== 1) return nums[0];
        int pick= nums[0];
        int notpick= Math.max(nums[0], nums[1]); 
        for(int i=2; i<n; i++){
            int amt=Math.max(nums[i]+ pick, notpick);
            pick=notpick;
            notpick=amt;
        }
        return Math.max(pick , notpick);
    }
}
