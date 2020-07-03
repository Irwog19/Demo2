package com.mercury.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.mercury.basedriver.Basedriver;
import com.mercury.flows.Flow_FlightDetails;

public class TC2 extends Basedriver {
	Flow_FlightDetails ff = new Flow_FlightDetails();
	
	@Test
	public void testflightdetails() throws InterruptedException, IOException {
		ff.flightDetails();
	}
			

}
