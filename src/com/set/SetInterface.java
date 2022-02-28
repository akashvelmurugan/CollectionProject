package com.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {
	public static void main(String[] args) {
		//does not allow duplicates
		System.out.println("****SET****");
		System.out.println("****HashSet****");
		//random order
		Set<String> set = new HashSet<>(); 
		set.add("One");
		set.add("One");
		set.add("two");
		set.add("two");
		set.add("three");
		set.add("three");
		set.add("four");
		set.add("five");
		set.add("six");
		set.add("seven");
		set.add("eight");
		set.add("nine");
		System.out.println(set);
		System.out.println("****LinkedHashSet****");
		//inserion order
		Set<String> linkedLinkedHashSet = new LinkedHashSet<>();
		linkedLinkedHashSet.add("One");
		linkedLinkedHashSet.add("One");
		linkedLinkedHashSet.add("two");
		linkedLinkedHashSet.add("two");
		linkedLinkedHashSet.add("three");
		linkedLinkedHashSet.add("three");
		linkedLinkedHashSet.add("four");
		linkedLinkedHashSet.add("five");
		linkedLinkedHashSet.add("six");
		linkedLinkedHashSet.add("seven");
		linkedLinkedHashSet.add("eight");
		linkedLinkedHashSet.add("nine");
		System.out.println(linkedLinkedHashSet);
		System.out.println("****TreeSet****");
		//assendingorder order
		Set<String> treeSet = new TreeSet<>();
		treeSet.add("one");
		treeSet.add("one");
		treeSet.add("two");
		treeSet.add("two");
		treeSet.add("three");
		treeSet.add("three");
		treeSet.add("four");
		treeSet.add("five");
		treeSet.add("six");
		treeSet.add("seven");
		treeSet.add("eight");
		treeSet.add("nine");
		System.out.println(treeSet);
	}
}
