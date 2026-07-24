class Solution {
    public void rotate(int[][] m) {
        int n=m.length;

        // Take Transpose of matrix
        for(int i=0; i<n;i++){
            for(int j=i+1;j<n;j++){
                int a=m[j][i];
                m[j][i]=m[i][j];
                m[i][j]=a;
            }
        }

        // Reverse every row of matrix
        for(int i=0; i<n;i++){
            int s=0, e=n-1;
            while(s<e){
                int a=m[i][e];
                m[i][e]=m[i][s];
                m[i][s]=a;
                s++;
                e--;
            }
        }

    }
}
