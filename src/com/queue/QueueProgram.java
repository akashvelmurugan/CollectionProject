package com.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueProgram {
	public static void main(String[] args) {
		System.out.println("Queue :");
		Queue<String> queue= new PriorityQueue<>();
		queue.add("one");
		queue.add("five");
		queue.add("one");
		queue.add("two");
		queue.add("two");
		queue.add("two");
		queue.add("two");
		queue.add("three");
		System.out.println("Head is : "+queue.peek());
		
		//System.out.println("Removed :"+queue.remove());
		System.out.println("Removed :"+queue.poll());//Queue is empty is retun null
		System.out.println(queue.size());
		
		System.out.println("out : "+queue.poll());
		//	System.out.println(queue);
	
		PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();
		priorityQueue.add(1);
		priorityQueue.add(7);
		priorityQueue.add(6);
		priorityQueue.add(5);
		System.out.println(priorityQueue);
		
	}
}
