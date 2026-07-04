class Solution {

    public String encode(List<String> strs) {
        StringBuilder str= new StringBuilder();
        for(String i:strs){
            str.append(i.length()).append('#').append(i);
        }
        return str.toString();
    }

    public List<String> decode(String str) {
        List<String> l=new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j=str.indexOf("#", i);
            int k=Integer.parseInt(str.substring(i, j));
            l.add(str.substring(j+1,j+k+1 ));
            i=j+k+1;
        }
        return l;
    }
}
