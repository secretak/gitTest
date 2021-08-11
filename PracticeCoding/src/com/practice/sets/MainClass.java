package com.practice.sets;

import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class MainClass {
	public static void main(String[] args) {
		Set<String> fruits2 = new HashSet<>();
		Set<String> fruits1 = new LinkedHashSet<>();
		Set<String> fruits = new TreeSet<>();
		
		fruits.add("Apple");
		fruits.add("Kiwi");
		fruits.add("Banana");
		
		System.out.println(fruits);
		
	}

}
