class MedianFinder {
    private List<Integer> l;
    public MedianFinder() {
        l=new ArrayList<>();;
    }
    
    public void addNum(int num) {
        l.add(num);
    }
    
    public double findMedian() {
        Collections.sort(l);
        int n=l.size();
        if(n % 2 == 0){
            return (l.get(n/2)+ l.get(n/2 -1)) / 2.0;
        }else{
            return l.get(n/2) ;
        }
    }
}