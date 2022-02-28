package com.list;

import java.awt.geom.QuadCurve2D;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class List {
	public static void main(String[] args) {
		//store duplicate 
		//it store insertion order
		//nonsycronized->executed parallel
		System.out.println("ArrayList :");
		ArrayList<String> arrayList= new ArrayList<>();
		arrayList.add("One");
		arrayList.add("One");
		arrayList.add("One");
		arrayList.add("Two");
		arrayList.add("Two");
		arrayList.add("Three");
		arrayList.add("Four");
		arrayList.add("Five");
		arrayList.add("Six");
		for (String string : arrayList) {
			System.out.println(string);
		}	
		System.out.println("==============");
		//store duplicate 
		//it store insertion order
		//sycronized one
		System.out.println("LinkedList :");
		LinkedList<String> arrayLinkedList= new LinkedList();
		arrayLinkedList.add("One");
		arrayLinkedList.add("Two");
		arrayLinkedList.add("Two");
		arrayLinkedList.add("Three");
		arrayLinkedList.add("Three");
		arrayLinkedList.add("Four");
		arrayLinkedList.add("Five");
		arrayLinkedList.add("Six");
		for (String string : arrayLinkedList) {
			System.out.println(string);
		}
		System.out.println("==============");
		System.out.println("Vector :");
		Vector<String> vector= new Vector<>();
		vector.add("One");
		vector.add("Two");
		vector.add("Two");
		vector.add("Three");
		vector.add("Three");
		vector.add("Four");
		vector.add("Five");
		vector.add("Six");
		for (String string : arrayLinkedList) {
			System.out.println(string);
		}
		//subclass of vector
		//last in first out
		//boolean push
		//boolean peek
		//boolean push

		System.out.println("==============");
		System.out.println("Stack :");
		Stack<String> stack = new Stack<>();
		stack.push("five");
		stack.push("one");
		stack.push("two");
		stack.push("two");
		stack.push("two");
		stack.push("two");
		stack.push("three");
	//	stack loaded
		System.out.println(stack);
		//	stack.pop();//last in fist out
		System.out.println(stack);	
		String peek = stack.peek();
		System.out.println("peek : "+peek);

		System.out.println("==============");
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
		System.out.println("peek : "+queue.peek());
		System.out.println(queue);
		System.out.println("out : "+queue.poll());
	//	System.out.println(queue);
	}
}
















