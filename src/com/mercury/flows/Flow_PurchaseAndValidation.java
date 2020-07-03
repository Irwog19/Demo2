package com.mercury.flows;

import java.io.IOException;

import com.mercury.basedriver.Basedriver;
import com.mercury.pages.Page_PurchaseAndValidate;

public class Flow_PurchaseAndValidation extends Basedriver {
	Page_PurchaseAndValidate ppv= new Page_PurchaseAndValidate();
	public void Purchaseandvalidation_flow() throws InterruptedException, IOException {
		ppv.clickpurchase();
		ppv.screenshotPurchase();
		ppv.validatepurchase();
		ppv.returntoHomescreen();
		
	}
	

}
