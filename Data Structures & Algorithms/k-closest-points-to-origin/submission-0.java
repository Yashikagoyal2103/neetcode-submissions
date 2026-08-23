class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] ans=new int[k][2];
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b) -> a[0]-b[0]);
        for(int i=0; i<points.length; i++){
            int dist=points[i][0]*points[i][0]+ points[i][1]*points[i][1];
            pq.add(new int[]{dist, points[i][0], points[i][1]});
        }
        for(int i=0;i<k;i++){
            int[] temp=pq.poll();
            ans[i][0]=temp[1];
            ans[i][1]=temp[2];
        }
        return ans;
    }
}
