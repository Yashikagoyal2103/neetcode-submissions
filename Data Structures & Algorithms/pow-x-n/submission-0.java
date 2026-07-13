class Solution {
    public double myPow(double x, int n) {
        if(n == 0){
            return 1;
        }
        long N=n;
        if(N<0){
            x=1/x;
            N=-N;    
        }
        return power(x,N);
    }
    private double power(double x, long N){
         if(N == 0){
            return 1;
        }
        double p= power(x, N/2);
        if(N%2 == 0){
            return p*p;
        }else{
            return p*p*x;
        }

    }
}
