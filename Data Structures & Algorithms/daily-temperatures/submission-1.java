class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int[] ans=new int[temp.length];
        Stack<Integer> s=new Stack<>();
        s.push(0);
        for(int i=1; i<temp.length; i++){
            while(!s.isEmpty() && temp[s.peek()] < temp[i]){
                int index=s.pop();
                ans[index]=i-index;
            }
            s.push(i);
        }
        return ans;
    }
}
