class Solution {
    public int maxArea(int[] h) {
        int max=0;
        int c=h.length-1;
        int i=0, j=h.length-1;
        while(i<j){
            max=Math.max(max, c*(Math.min(h[i], h[j])));
            c--;
            if(h[i]<h[j]){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
}
