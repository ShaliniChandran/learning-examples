package com.learning;

import java.util.LinkedList;
import java.util.Queue;

public class HitCounter {
	private Queue<Integer> hits;
	
	public HitCounter() {
		this.hits = new LinkedList<Integer>();
	}
	public void hit(int timestamp) {
		this.hits.add(timestamp);
	}
	public int getHits(int timestamp) {
		while(!this.hits.isEmpty()) {
			int diff = timestamp - this.hits.peek();
			if(diff >= 300) this.hits.remove();
			else break;
		}
		return this.hits.size();
	}
	public static void main(String[] args) {
		HitCounter hitCounter = new HitCounter();
		hitCounter.hit(1);       // hit at timestamp 1.
		hitCounter.hit(2);       // hit at timestamp 2.
		hitCounter.hit(3);       // hit at timestamp 3.
		System.out.println(hitCounter.getHits(2));   

	}

}
