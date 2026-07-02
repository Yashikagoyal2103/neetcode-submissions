class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0 || nums.length==1){
            return nums.length;
        }
        Arrays.sort(nums);
        int max=1;
        int c=1;
        for(int i=1;i<nums.length; i++){
            if(nums[i] == nums[i-1]+1){
                c++;
                max=Math.max(max,c);
            }else if(nums[i] == nums[i-1]){
                continue;
            }else{
                c=1;
            }
        }
        return max;
        
    }
}
