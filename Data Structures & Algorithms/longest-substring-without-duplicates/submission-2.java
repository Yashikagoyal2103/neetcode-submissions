class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> hash=  new HashMap<>();
        int maxlen=0,l=0;
        for(int i=0; i<s.length(); i++){
            if(hash.containsKey(s.charAt(i))){
                l=Math.max(hash.get(s.charAt(i))+1, l);
            }
            hash.put(s.charAt(i), i);
            maxlen= Math.max(maxlen, i-l+1);
        }
        return maxlen;
    }
}
