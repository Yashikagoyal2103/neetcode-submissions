class Solution {
    public int climbStairs(int n) {
        if(n<=2) return n;

        int prev=1, curr=2;
        int i=3;
        while(i<= n){
            int next= prev + curr;
            prev= curr;
            curr= next;
            i++;
        }
         return curr;        
    }
}
