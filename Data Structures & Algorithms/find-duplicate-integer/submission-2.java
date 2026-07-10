class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> hash= new HashMap<>();
        for(int i=0; i<nums.length;i++){
            hash.put(nums[i], hash.getOrDefault(nums[i], 0) +1);
            if(hash.get(nums[i]) > 1){
                return nums[i];
            }
        }
        return 0;
    }
}
