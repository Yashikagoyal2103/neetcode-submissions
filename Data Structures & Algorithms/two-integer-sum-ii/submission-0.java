class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n= numbers.length;
        int left= 0;
        int right= n-1;
        while(left <= right){
            int r= numbers[left] + numbers[right];
            if(r == target){
                return new int[]{left+1,right+1};
            }else if(r<target){
                    left++;
            }else{
                    right--;
            }
        }
        return null;
        
    }
}
