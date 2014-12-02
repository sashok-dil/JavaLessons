package com.it.source.collections;

public class Odd {
	public static void main(String[] args) {
		int odd[] = {42,56,78,31,41,17,120,86,77,99,60,30,50,25,11,84,6};
		int sum = 0;
		for (int i = 0; i < odd.length; i++) {
			if(odd[i]%2==1) {
			
				sum = odd[i]+sum;
			}
			
		}
		System.out.println(sum);	
	} 

}
