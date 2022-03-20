package com.task;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListProgram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Array Size :");
		int araySize=scanner.nextInt();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		for (int i = 0; i<araySize; i++) {
			for (int j = 0; j < araySize; j++) {
				System.out.println(i+"th"+j+"th"+"Enter The Number");
				
				arrayList.add( i,1 );

			}
		}
		scanner.close();		
	}
}