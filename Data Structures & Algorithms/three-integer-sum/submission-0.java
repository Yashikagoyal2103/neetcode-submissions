class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        for(int k=0;k<nums.length;k++){
            if(nums[k] > 0) break;
            if(k>0 && nums[k] == nums[k-1]) continue;
            int i=k+1;
            int j=nums.length-1;
            while(i<j){
                if(nums[j] <0) break;
                if(nums[i]+ nums[j] + nums[k] == 0){
                    ans.add(new ArrayList<>(List.of(nums[i], nums[j], nums[k])));
                    i++;
                    j--;
                    while (i < j && nums[i] == nums[i - 1]) {
                        i++;
                    }
                }else if(nums[i]+ nums[j] + nums[k] < 0){
                    i++;
                }else{
                    j--;
                }
            }
        }
        return ans;
    }
}
