class Solution {
    private int value(char c){
        int n=1;
        if(c == 'V') n=5;
        else if(c == 'X') n=10;
        else if(c == 'L') n=50;
        else if(c == 'C') n=100;
        else if(c == 'D') n=500;
        else if(c == 'M') n=1000;
        return n;
    }
    public int romanToInt(String s) {
        if(s.length() == 0) return 0;
        
        int total= value(s.charAt(s.length()-1));
        int prev=total;
        for(int i=s.length()-2 ; i>=0 ;i--){
            int a=value(s.charAt(i));
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