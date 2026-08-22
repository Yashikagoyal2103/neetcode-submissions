class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq =new PriorityQueue<>(Collections.reverseOrder());
        for(int s:stones){
            pq.offer(s);
        }
        while(pq.size()>1){
            int w=pq.poll()- pq.poll();
            pq.offer(w);
        }
        return pq.peek();
    }
}
