package com.mercury.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.mercury.basedriver.Basedriver;
import com.mercury.flows.Flow_ContinueToReservation;

public class TC4 extends Basedriver {
	Flow_ContinueToReservation fcr = new Flow_ContinueToReservation();
	
	@Test
	public void testContinuetoReserve() throws InterruptedException, IOException {
		fcr.continuewithreservation_flow();
	}
	

}
