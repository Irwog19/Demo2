package com.mercury.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.mercury.basedriver.Basedriver;
import com.mercury.flows.Flow_DeliveryAddress;

public class TC8 extends Basedriver {
	Flow_DeliveryAddress fd= new Flow_DeliveryAddress();
	
	@Test
	public void testdeliveryaddress() throws IOException, InterruptedException {
		fd.deliveryaddress_flow();
	}

}
