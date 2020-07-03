package com.mercury.flows;

import java.io.IOException;

import com.mercury.basedriver.Basedriver;
import com.mercury.pages.Page_FlightDetails;

public class Flow_FlightDetails extends Basedriver {
	Page_FlightDetails pf = new Page_FlightDetails();
	
	public void flightDetails() throws InterruptedException, IOException {
		pf.type();
		pf.noofpassengers();
		pf.departfrom();
		pf.departmonth();
		pf.departday();
		pf.arrivein();
		pf.returnmonth();
		pf.returnday();
		
	}

}
