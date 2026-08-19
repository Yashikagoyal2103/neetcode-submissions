class Solution {
    public int maxProduct(int[] nums) {
        int min=1, max=1;
        int ans=nums[0];
        for(int num:nums){
            int temp=max*num;
            max=Math.max(num, Math.max(num*min, temp));
            min=Math.min(num, Math.min(num*min, temp));
            ans=Math.max(ans, max);
        }
        return ans;
    }
}