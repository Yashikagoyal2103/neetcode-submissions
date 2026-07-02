class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0 || nums.length== 1){
            return nums.length;
        }
        Map<Integer, Integer> map=new HashMap<>();
        int max=0;
        for(int i:nums){
            if(!map.containsKey(i)){
                map.put(i, map.getOrDefault(i+1,0)+ map.getOrDefault(i-1,0) +1);
                map.put(i - map.getOrDefault(i - 1, 0), map.get(i));
                map.put(i + map.getOrDefault(i + 1, 0), map.get(i));
                max= Math.max(max, map.get(i));
            }
        }

        return max;

    }
}
