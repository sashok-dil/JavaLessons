package com.it.sources.atm;

import com.it.sources.atm.logic.ATMLogic;
import com.it.sources.atm.money.Hryvna;
import com.it.sources.atm.money.Money;

public class ATM {
	
    //TODO insertClientValue(int clientValue)
		public void insertClientValue(int clientValue){
			Box box = new Box();
		    ATMLogic logic = new ATMLogic();
		    Hryvna hryvna = new Hryvna(clientValue);

		if (logic.checkCounterfeit(clientValue, hryvna.getpat())){
			logic.consume(hryvna);
			System.out.println("Купюру принято "+hryvna.getValue());
			}
			else {
				logic.garbage();
			}

		}
		
		
		
		
}