class MedianFinder {

    // max-Heap to store the smaller half of numbers
    private PriorityQueue<Integer> maxHeap;
    // min-heap to store the larger half of numbers
    private PriorityQueue<Integer> minHeap;
    public MedianFinder() {
        //Max heap for the left half
        maxHeap = new PriorityQueue<>((a,b) -> b - a);
        // Min Heap for the right half
        minHeap = new PriorityQueue<>();
    }
    
    public void addNum(int num) {  
        maxHeap.offer(num);
        if(!minHeap.isEmpty() && maxHeap.peek() > minHeap.peek()){
            minHeap.offer(maxHeap.poll());
        }
        if(maxHeap.size() > minHeap.size() + 1){
            minHeap.offer(maxHeap.poll());
        }else if(minHeap.size() > maxHeap.size()){
            maxHeap.offer(minHeap.poll());
        }
    }
    
    public double findMedian() {
        if(maxHeap.size() == minHeap.size()){
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        } else{
            return maxHeap.peek();
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */

 // TC: O(logn) for add num
 // TC: O(1) for find median

 // SC: O(N) 