package com.it.source.test;

import com.it.source.collections.Bag;

public class BugTest {

	public static void main(String[] args) {
		Bag bag = new Bag();
		
		Bag<String>bagString = new Bag<String>();
		Bag<Integer>bagInteger = new Bag<Integer>();
		
		System.out.println("Before: "+ bag.isEmpty());
		System.out.println("Before: "+ bag.size());
		
		bag.add(5);
		bag.add(-1);
		bag.add(4);
		
		System.out.println("After: "+bag.isEmpty());
		int y = bag.size();
		y++;
		y++;
		System.out.println("After: "+bag.size());

	}
	

}
