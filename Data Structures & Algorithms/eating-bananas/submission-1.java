class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int ans=1;
        // // Maximum pile
        int high= Arrays.stream(piles).max().getAsInt();

        // if piles.length == h 
        if(piles.length == h) return high;

        // if(piles.length > h)
        while(low<=high){
            int mid=low+ (high - low)/2;
            long thours=0;
            for(int i: piles){
                thours+= (i+ mid -1)/ mid;
            }
            if(thours <= h){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}