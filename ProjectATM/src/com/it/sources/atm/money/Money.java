package com.it.sources.atm.money;

public class Money {
private int value;
private boolean counterfeit;

	public Money(int i){
		
	}

	public int getValue() {
	return value;
	}
	
	public void setValue(int value) {

	this.value = value;
	}
	
	public boolean isCounterfeit() {
	return counterfeit;
	}
	
	public void setCounterfeit(boolean counterfeit) {
	this.counterfeit = counterfeit;
	}

}
