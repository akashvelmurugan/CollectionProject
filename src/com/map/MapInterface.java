package com.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapInterface {
	public static void main(String[] args) {
		//Key-Value Pair Combination
		System.out.println("****Map****");
		//HashMap -> Random
		Map<Integer, String> hashMap= new HashMap<Integer, String>();
		//Integer ->RollNumber
		//String  ->Name
		hashMap.put(1001, "Saravanan");
		hashMap.put(1002, "Saravanan");
		hashMap.put(1003, "Saravanan");
		hashMap.put(1004, "Saravanan");
		hashMap.put(1005, "Saravanan");// Value -> allow duplicates
		hashMap.put(1005, "Saravanan");// Key   -> does not allow duplicates
		hashMap.put(1006, "Saravanan");
		hashMap.put(1007, "Saravanan");
		hashMap.put(1008, "Saravanan");
		hashMap.put(1009, "Saravanan");
		hashMap.put(1010, "Saravanan");
		hashMap.put(1011, "Saravanan");
		System.out.println(hashMap);

		//LinkedHashMap -> Insersion Order
		Map<Integer, String> linkedHashMap= new LinkedHashMap<Integer, String>();
		linkedHashMap.put(1001, "Saravanan");
		linkedHashMap.put(1002, "Saravanan");
		linkedHashMap.put(1003, "Saravanan");
		linkedHashMap.put(1004, "Saravanan");
		linkedHashMap.put(1005, "Saravanan");// Value -> allow duplicates
		linkedHashMap.put(1005, "Saravanan");// Key   -> does not allow duplicates
		linkedHashMap.put(1006, "Saravanan");
		linkedHashMap.put(1007, "Saravanan");
		linkedHashMap.put(1008, "Saravanan");
		linkedHashMap.put(1009, "Saravanan");
		linkedHashMap.put(1010, "Saravanan");
		linkedHashMap.put(1011, "Saravanan");
		System.out.println(linkedHashMap);
		
		//LinkedHashMap -> Assending Order
		Map<Integer, String> treeMap= new TreeMap<Integer, String>();
		treeMap.put(1001, "Saravanan");
		treeMap.put(1002, "Saravanan");
		treeMap.put(1003, "Saravanan");
		treeMap.put(1004, "Saravanan");
		treeMap.put(1005, "Saravanan");// Value -> allow duplicates
		treeMap.put(1005, "Saravanan");// Key   -> does not allow duplicates
		treeMap.put(1006, "Saravanan");
		treeMap.put(1007, "Saravanan");
		treeMap.put(1008, "Saravanan");
		treeMap.put(1009, "Saravanan");
		treeMap.put(1010, "Saravanan");
		treeMap.put(1011, "Saravanan");
		treeMap.put(1001, "Saravanan");//1001->Assending Order
		System.out.println(treeMap);
	}
}