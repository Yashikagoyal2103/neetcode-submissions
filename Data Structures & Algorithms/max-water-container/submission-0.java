class Solution {
    public int maxArea(int[] h) {
        int max=0;
        for(int i=0;i<h.length;i++){
            int c=0;
            for(int j=i+1;j<h.length;j++){
                c++;
                int area=c*(Math.min(h[i], h[j]));
                max=Math.max(area, max);
            }
        }
        return max;
    }
}
