class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0, j=0;
        int len1=nums1.length, len2= nums2.length;
        int m1=0, m2=0;
        for(int k=0; k<= (nums1.length + nums2.length)/2; k++){
            m2=m1;
            if(i<len1 && j<len2){
                if(nums1[i]< nums2[j]){
                    m1=nums1[i];
                    i++;
                }else{
                    m1=nums2[j];
                    j++;
                }
            }else if(i<len1){
                m1=nums1[i];
                i++;
            }else{
                m1=nums2[j];
                j++;
            }
        } 
        if((len1+len2) % 2== 1) return (double)m1;
        else return (m1+m2)/2.0;

    }
}
