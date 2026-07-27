class Solution {
    public boolean searchMatrix(int[][] m, int target) {
        int row=m.length, col=m[0].length;
        int low=0, high=row*col-1;
        while( low <= high){
            int mid= low+ (high-low)/2;
            int value= m[mid / col][mid % col];
            if(value == target){
                return true;
            }else if(value > target){
                high=mid-1;
            }else{
                low= mid+1;
            }
        }
        return false;
    }
}
