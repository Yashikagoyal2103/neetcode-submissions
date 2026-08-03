class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 1){
            if(nums[0] == target){
                return 0;
            }
            return -1;
        }
        if(nums[0] == target ){
            return 0;
        }else if(nums[nums.length-1] == target){
            return nums.length-1;
        }

        int low=0, high =nums.length-1;
        while(low <= high){
            int mid= low + (high-low)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[low] <= nums[mid]){   //left half is sorted
                if(nums[mid] >= target && nums[low] <= target){
                    high=mid-1;
                }else{
                low=mid+1;
                }
            }else{                              //right half is sorted
                if(nums[mid] <= target && nums[high] >= target){
                    low=mid+1;
                }else{
                high=mid-1;
                }
            }
        }
        return -1;
    }
}
