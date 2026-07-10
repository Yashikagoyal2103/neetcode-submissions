class Solution {
    public int findDuplicate(int[] nums) {
        boolean seen[] = new boolean[nums.length+1];
        for(int i=0; i<nums.length; i++){
            if(!seen[nums[i]]){
                seen[nums[i]] = true;
            }else{
                return nums[i];
            }
        }
        return -1;
    }
}
