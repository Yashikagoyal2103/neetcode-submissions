class Solution {
    public int trap(int[] h) {
        if(h.length == 0 || h == null){
            return 0;
        }
        int i=0, j=h.length-1;        
        int lm=h[i], rm=h[j];
        int water=0;
        while(i<j){
            if(lm<rm){
                i++;
                lm=Math.max(lm, h[i]);
                water+= lm-h[i];
            }else{
                j--;
                rm=Math.max(rm, h[j]);
                water+= rm-h[j];
            }
        }   
        return water;
    }
}
