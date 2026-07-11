class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> s=new HashSet<>();
        for(int i:nums){
            if(s.contains(i)){
                s.remove(i);
            }else{
                s.add(i);
            }
        } 
        return s.iterator().next();
    }
}
