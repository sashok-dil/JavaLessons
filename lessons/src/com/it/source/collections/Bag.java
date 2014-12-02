package com.it.source.collections;

import java.util.ArrayList;

public class Bag<Tugrik> {
	private ArrayList<Tugrik> arr;
		int i = 0;
		
	public Bag(){
		arr = new ArrayList<Tugrik>();
	}
			
	public void add(Tugrik item){
		arr.add(item);
	}
	
	
	public boolean isEmpty () {
		return i == 0;
	}
	
	public int size () {
		return i;
	}
	public boolean isFull() {
		return false;
	}
	public void deleted() {
		
	}
	
	

}
