class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] hash=  new int[256];
        Arrays.fill(hash, -1);
        int maxlen=0,l=0;
        for(int r=0; r<s.length(); r++){
            if(hash[s.charAt(r)] >= 0){
                l=Math.max(hash[s.charAt(r)]+1, l);
            }
            hash[s.charAt(r)]=r;
            maxlen= Math.max(maxlen, r-l+1);
        }
        return maxlen;
    }
}
