class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxarea=0;
        int[] arr1=new int[heights.length];
        int[] arr2=new int[heights.length];
        Stack<Integer> s=new Stack<>();
        //next smaller right
        for(int i=heights.length-1;i>=0;i--){
            while(!s.isEmpty()&&heights[i]<=heights[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                arr1[i]=heights.length;
            }else{
                arr1[i]=s.peek();
            }
            s.push(i);
            
        }
        //next smaller left
        s=new Stack<>();
        for(int i=0;i<heights.length;i++){
            while(!s.isEmpty()&&heights[i]<=heights[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                arr2[i]=-1;
            }else{
                arr2[i]=s.peek();
            }
            s.push(i);
        }
        //currarea
        for(int i=0;i<heights.length;i++){
            int width=arr1[i]-arr2[i]-1;
            int currarea=heights[i]*width;
            maxarea=Math.max(maxarea,currarea);
        }
        return maxarea;
}

    }
