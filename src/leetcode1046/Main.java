package leetcode1046;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] stones = {1,7,3,4,10,2};
		
		System.out.println("input: " + Arrays.toString(stones));
		
		FindLastStoneWeight solution = new FindLastStoneWeight();
		
		System.out.println("Solution: " + solution.lastStoneWeight(stones));
	}
}
