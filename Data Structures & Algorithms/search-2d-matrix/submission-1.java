class Solution {
    public boolean searchMatrix(int[][] m, int target) {
        int row=0, col=m[0].length-1;
        while( row < m.length && col >=0){
            if(m[row][col] == target ){
                return true;
            }else if(target > m[row][col] ){
                row++;
            }else{
                col--;
            }
        }
        return false;
    }
}
