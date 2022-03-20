package com.stack;

import java.util.Stack;

public class StackProgram {
	public static void main(String[] args) {
	
		System.out.println("==============");
		System.out.println("Stack :");
		//Stack<String> stack = new Stack<>();
		Stack<String> stack= new Stack<String>();
		stack.push("five");
		stack.push("one");
		stack.push("two");
		stack.push("two");
		stack.push("two");
		stack.push("two");
		stack.push("three");
		stack.add("four");
		stack.empty();
		System.out.println("stack.empty"+stack.empty());
		
		//	stack loaded
		
		System.out.println(stack);
		//	stack.pop();//last in fist out
		System.out.println(stack);	
		String peek = stack.peek();
		System.out.println("peek : "+peek);
	}
}
