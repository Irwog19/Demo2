package com.mercury.flows;

import java.io.IOException;

import com.mercury.basedriver.Basedriver;
import com.mercury.pages.Page_BillingAddress;

public class Flow_BillingAddress extends Basedriver {
	Page_BillingAddress pb= new Page_BillingAddress();
	public void billingaddress_flow() throws IOException, InterruptedException {
		pb.bilingaddress();
		pb.ticketlesstravel();
	}

}
