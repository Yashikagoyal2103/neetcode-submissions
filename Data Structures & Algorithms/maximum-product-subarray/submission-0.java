class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int n=nums.length;
        int max= Integer.MIN_VALUE;
        int pre=1, suff=1 ;
        for(int i=0; i< n; i++){
            pre *= nums[i];
            suff *= nums[n-i-1];
            max = Math.max(max, Math.max(pre, suff));
            
            pre= pre == 0 ? 1:pre;
            suff= suff==0?1:suff;
        }
        return max;
    }
}