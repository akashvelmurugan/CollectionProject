package com.dequeue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeInterface {
	public static void main(String[] args) {

		Deque<String> deque=new ArrayDeque<>();
		deque.add("Ravi");
		deque.add("Vijay");
		deque.add("Ajay");

		for (String string : deque) {
			System.out.println(string);
		}
		deque.pollLast();
		System.out.println(deque);		
		System.out.println(deque.pollFirst());


	}
}
