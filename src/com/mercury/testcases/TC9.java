package com.mercury.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.mercury.basedriver.Basedriver;
import com.mercury.flows.Flow_PurchaseAndValidation;

public class TC9 extends Basedriver {
	Flow_PurchaseAndValidation fpv= new Flow_PurchaseAndValidation();
	
	@Test
	public void testpurchaseandvalidation() throws InterruptedException, IOException {
		fpv.Purchaseandvalidation_flow();
		
	}

}
