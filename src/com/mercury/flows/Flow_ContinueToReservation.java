package com.mercury.flows;

import java.io.IOException;

import com.mercury.basedriver.Basedriver;
import com.mercury.pages.Page_ContinueToReservation;

public class Flow_ContinueToReservation extends Basedriver {	
	Page_ContinueToReservation pcr= new Page_ContinueToReservation();
	
	public void continuewithreservation_flow() throws InterruptedException, IOException {
		pcr.continuefindflights();
		pcr.screenshotreservation();
		pcr.Continuereserveflights();
		
	}

}
