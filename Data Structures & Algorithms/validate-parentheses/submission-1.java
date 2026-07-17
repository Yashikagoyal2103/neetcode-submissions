class Solution {
    public boolean isValid(String s) {
        Stack<Character> b= new Stack<>();
        int l=s.length();
        if(l == 1)return false;
        for(int i=0;i<l; i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{'||s.charAt(i) =='['){
                b.push(s.charAt(i));
            }else {
                if(b.isEmpty()) return false;
                if(s.charAt(i) == ')' && b.peek()== '('){
                    b.pop();
                }else if(s.charAt(i) == ']' && b.peek()== '['){
                    b.pop();
                }else if(s.charAt(i) == '}' && b.peek()== '{'){
                    b.pop();
                }else{
                    return false;
                }
            }
        }
        if(!b.isEmpty()) return false;
        return true;
        
    }
}
