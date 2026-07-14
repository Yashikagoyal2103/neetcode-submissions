class Solution {
    public int romanToInt(String s) {
        if(s.length() == 0) return 0;
        Map<Character, Integer> m=new HashMap<>();
        m.put('I',1);
        m.put('V',5);
        m.put('X',10);
        m.put('L',50);
        m.put('C',100);
        m.put('D',500);
        m.put('M',1000);
        
        int total= m.get(s.charAt(s.length()-1));
        int prev=total;
        for(int i=s.length()-2 ; i>=0 ;i--){
            int a=m.get(s.charAt(i));
            if(a < prev){
                total -= a;
            }else{
                total += a;
            }
            prev=a;
        }
        return total;
    }
}