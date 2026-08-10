class MedianFinder {
    private PriorityQueue<Integer> smallnum;
    private PriorityQueue<Integer> largenum;
    public MedianFinder() {
        smallnum=new PriorityQueue<>(Collections.reverseOrder());
        largenum=new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        smallnum.add(num);
        if(smallnum.size() - largenum.size() >1 || 
        !largenum.isEmpty() && largenum.peek() < smallnum.peek()){
            largenum.add(smallnum.poll());
        }
        if(largenum.size() - smallnum.size() >1 ){
            smallnum.add(largenum.poll());
        }
    }
    
    public double findMedian() {
        if(smallnum.size() == largenum.size()){
            return (smallnum.peek()+ largenum.peek())/2.0;
        }else if(smallnum.size() > largenum.size()){
            return smallnum.peek();
        }else{
            return largenum.peek();
        }
    }
}