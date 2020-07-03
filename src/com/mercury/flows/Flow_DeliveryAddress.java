package com.mercury.flows;

import java.io.IOException;

import com.mercury.basedriver.Basedriver;
import com.mercury.pages.Page_DeliveryAddress;

public class Flow_DeliveryAddress extends Basedriver {
	Page_DeliveryAddress pd= new Page_DeliveryAddress();
	
	public void deliveryaddress_flow() throws IOException, InterruptedException {
		pd.deliveryaddress();
		pd.acceptalert();
		pd.sameasbillingaddress();
		pd.screenshotbookflight();
	}

}
