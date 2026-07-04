class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map< String,List<String> > m= new HashMap<>();
        for(String str:strs){
            int[] count = new int[26];
            for (char c : str.toCharArray()) {
                count[c - 'a']++;
            }
            String s=Arrays.toString(count);
            m.putIfAbsent(s, new ArrayList<>());
            m.get(s).add(str);
        }
        return new ArrayList<>(m.values());
    }
}
