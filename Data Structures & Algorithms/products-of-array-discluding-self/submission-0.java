class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr= new int[nums.length];
        int a=1, b=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                b++;
            }else{
                a*=nums[i];
            }
        }
        if(b>1){
            return arr;
        }
        for(int i=0; i<nums.length; i++){
            if(b==1 ){
                if(nums[i] !=0){
                    arr[i]=0;
                }else{
                    arr[i]=a;
                }
            }else{
                arr[i]= a/nums[i];
            } 
        }
        return arr;
    }
}  
