package com.it.sources.atm.money;

public class Hryvna {
	private int pat[] = {1,2,5,10,20,50,100,200,500};
	private int value = 0;
	
	Hryvna(int value) {
        this.value = value;
    }
	
	 
    public int getValue() {
        return value;
    }
    
    public int[] getPat() {
        return getPat();
    }

	public void setPat(int pat[]) {
		this.pat = pat;
	}
}
