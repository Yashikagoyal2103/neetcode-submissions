class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n=nums.length;
        HashMap<Integer, Integer> hash= new HashMap<>();
        for(int i=0; i<n ;i++){
            hash.put(nums[i], hash.getOrDefault(nums[i], 0) +1);
        }

        for(int i=0 ;i<n; i++){
            if(hash.get(nums[i]) >= 2){
                return true;
            }
        }
        return false;
    }
}