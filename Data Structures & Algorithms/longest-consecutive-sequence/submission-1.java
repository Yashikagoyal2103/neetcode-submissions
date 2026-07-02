class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0 || nums.length== 1){
            return nums.length;
        }
        Set<Integer> s= new HashSet<>();
        for(int i:nums){
            s.add(i);
        }
        int max=1;
        for(int i:s){
            // Only start counting from sequence beginnings
            // No left neighbor → Start of sequence
            if(!s.contains(i-1)){
                int cnt=1;
                int x=i;
                while(s.contains(x+1)){
                    cnt++;
                    x++;
                }
                max = Math.max(max, cnt);
            }
        }

        return max;

    }
}
