package com.mercury.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.mercury.basedriver.Basedriver;
import com.mercury.flows.Flow_BillingAddress;

public class TC7 extends Basedriver {
	Flow_BillingAddress fb= new Flow_BillingAddress();
	
	@Test
	public void testbillingaddress() throws IOException, InterruptedException {
		fb.billingaddress_flow();
	}

}
