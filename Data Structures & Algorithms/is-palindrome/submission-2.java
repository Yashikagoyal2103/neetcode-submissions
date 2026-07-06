class Solution {
    private boolean check(char c){
        return(
            c >= 'A' &&  c<= 'Z' ||
            c >= 'a' &&  c<= 'z' ||
            c >= '0' &&  c<= '9'
        );
    }
    public boolean isPalindrome(String s) {
        int i=0, j=s.length()-1;
        while(i<j){
            while(i<j && !check(s.charAt(i)) ){
                i++;
            }
            while(i<j && !check(s.charAt(j)) ){
                j--;
            }
            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
