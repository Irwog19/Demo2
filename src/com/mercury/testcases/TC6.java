package com.mercury.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.mercury.basedriver.Basedriver;
import com.mercury.flows.Flow_CreditCard;

public class TC6 extends Basedriver {
	Flow_CreditCard fcc= new Flow_CreditCard();
	
	@Test
	public void testcreditcard() throws InterruptedException, IOException {
		fcc.creditcard_flow();
	}

}
