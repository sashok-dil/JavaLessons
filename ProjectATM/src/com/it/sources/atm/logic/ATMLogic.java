package com.it.sources.atm.logic;
import com.it.sources.atm.Box;
import com.it.sources.atm.money.Money;

public class ATMLogic {
	
	public ATMLogic() {
		
	}
	public boolean checkCounterfeit(int value, int[] values) {

		boolean exist = false;
			for (int i = 0; i < values.length; i++) {
			if(values[i]==value){
			exist=true;
			break;
			}
		}
			  	return exist;
	}
		
	public void consume(Money money) {
		System.out.println("Купюра найдена ");
	}
	
	public void garbage() {
		System.out.println("Менты!!! харе бухать, идите работать");
	}
	

}