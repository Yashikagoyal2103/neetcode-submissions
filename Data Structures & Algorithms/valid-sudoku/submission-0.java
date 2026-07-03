class Solution {
    public boolean isValidSudoku(char[][] b) {
        int[] row= new int[9];
        int[] col= new int[9];
        int[] squ= new int[9];
        // Checking rows 
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                // Checking rows
                if(b[i][j] != '.' ){
                    if(row[b[i][j] - '1'] == i+1){
                        return false;
                    }else{
                        row[b[i][j] - '1']=i+1;
                    }
                }
                // Checking columns
                if(b[j][i] != '.' ){
                    if(col[b[j][i] - '1'] == i+1){
                        return false;
                    }else{
                        col[b[j][i] - '1']=i+1;
                    }
                }                
            }
            int rs= (i/3)*3;
            int cs= (i%3)*3;
            // Checking squares
            for(int k=0;k<3;k++){
                for(int j=0;j<3;j++){

                    if(b[rs+k][cs+j] != '.' ){
                    if(squ[b[rs+k][cs+j] - '1'] == i+1){
                        return false;
                    }else{
                        squ[b[rs+k][cs+j] - '1']=i+1;
                    }
                }
                }
            }

        }
        return true;
    }
}
