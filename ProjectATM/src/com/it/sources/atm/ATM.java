package com.it.sources.atm;

import com.it.sources.atm.logic.ATMLogic;
import com.it.sources.atm.money.Hryvna;


public class ATM {
	
    	public void insertClientValue(int clientValue){
			ATMLogic logic = new ATMLogic();
		    Hryvna hryvna = new Hryvna(clientValue);

		    if (logic.checkCounterfeit(clientValue, hryvna.getpat())){
			logic.consume(hryvna);
		    }
			else {
				logic.garbage();
			}

		}
		
}