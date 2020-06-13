package leetcode1046;

import java.util.PriorityQueue;

public class FindLastStoneWeight {
	public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b - a);
        
        // Add the stone from heaviest to lightest
        for(int stone : stones){
            maxHeap.offer(stone);
        }
        
        while(maxHeap.size() > 1){
        	// Could've store them into two variables
            maxHeap.offer(maxHeap.poll() - maxHeap.poll());
        }
        
        return maxHeap.poll();
    }
}
