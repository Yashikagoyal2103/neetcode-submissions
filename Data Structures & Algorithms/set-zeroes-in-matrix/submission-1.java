class Solution {
    public void setZeroes(int[][] m) {
        int rowFlag=0, colFlag=0; // value 1--->0 is present
        int r=m.length, c=m[0].length;
        // check if first row has any zero
        for (int j = 0; j < c; j++) {
            if (m[0][j] == 0) {
                rowFlag = 1;
                break;
            }
        }

        // Check if first column has any zero
        for (int i = 0; i < r; i++) {
            if (m[i][0] == 0) {
                colFlag = 1;
                break;
            }
        }

        for(int i=0;i<r ;i++){
            for(int j=0; j<c;j++){
                if(m[i][j] == 0){
                    m[i][0]=0;
                    m[0][j]=0;
                }
            }
        }

        for(int i=1;i<r ;i++){
            for(int j=1; j<c ;j++){
                if(m[i][0] ==0 || m[0][j]==0){
                    m[i][j] =0;
                }
            }
        }

        if(rowFlag == 1){
            for(int i=0; i<c; i++){
                m[0][i]=0;
            }
        }
        if(colFlag == 1){
            for(int i=0; i<r; i++){
                m[i][0]=0;
            }
        }
    }
}
