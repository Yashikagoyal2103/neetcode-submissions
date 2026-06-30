class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr=new int[nums.length];
        int l=1, r=1;
        // Storing Prefix in arr first that is product of elements left to i
        for(int i=0;i<nums.length;i++){
            arr[i]=l;
            l*=nums[i];
        }
        //Multipying prefix with suffix 
        for(int i=nums.length-1; i>=0;i--){
            arr[i]*=r;
            r*=nums[i];
        }
        return arr;
    }
}  
