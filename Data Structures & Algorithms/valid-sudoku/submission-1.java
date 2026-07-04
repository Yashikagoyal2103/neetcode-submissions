class Solution {
    public boolean isValidSudoku(char[][] b) {
        boolean[][] r=new boolean[9][9];
        boolean[][] c=new boolean[9][9];
        boolean[][] s=new boolean[9][9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(b[i][j]== '.') continue;
                int val=b[i][j] - '1';
                int box=(j/3)*3+(i/3);
                if(r[i][val] || c[j][val] || s[box][val]) return false;
                r[i][val]=true;
                c[j][val]=true;
                s[box][val]=true;
            }
        }
        return true;
    }
}
