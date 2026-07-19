class Solution {
    public List<Integer> spiralOrder(int[][] m) {
        List<Integer> list =new ArrayList<>();
        int sr=0, er=m.length-1, sc=0, ec=m[0].length-1;
        while(sr<= er && sc<=ec){
            for(int i=sc; i<=ec; i++){
                list.add(m[sr][i]);
            }
            sr++;
            for(int i=sr; i<=er; i++){
                list.add(m[i][ec]);
            }
            ec--;
            if(sr <= er){
                for(int i=ec; i>=sc; i--){
                    list.add(m[er][i]);
                }
                er--;
            }
            if(sc <= ec){
                for(int i=er; i>=sr; i--){
                    list.add(m[i][sc]);
                }
                sc++;
            }
        }
        return list;
        
    }
}
