class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int low=0, high =nums.length-1;
        int ans=Integer.MAX_VALUE;
        // If array is rotated n times or not rotated
        if(nums[high] > nums[low]){
            return nums[0];
        }

        while(low <= high){
            int mid= low + (high-low)/2;
            if(nums[mid] >= nums[low]){
                ans = Math.min(ans, nums[low]);
                low=mid+1;
            }else{
                ans = Math.min(ans, nums[mid]);
                high=mid-1;   //To check if there's any smaller number in left part
            }
        }
        return ans;
    }
}
