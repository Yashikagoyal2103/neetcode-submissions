class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int speed=1;
        while(true){
            int thours=0;
            for(int i: piles){
                thours+= (i+ speed -1) / speed;
                if(thours > h) break;
            }
            if(thours <= h) return speed;
            speed++;
        }
    }
}