package com.it.sources.atm.money;

public class Hryvna extends Money {
	private int pat[] = {1,2,5,10,20,50,100,200,500};
	private int value = 0;
	
	public Hryvna(int value){
		super(value);
        this.value = value;
    }
	
	 
    public int getValue() {
        return value;
    }
    
    public int [] getpat() {
		return pat;
		
	}
   
 
}
