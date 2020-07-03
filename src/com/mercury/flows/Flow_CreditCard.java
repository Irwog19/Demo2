package com.mercury.flows;

import java.io.IOException;

import com.mercury.basedriver.Basedriver;
import com.mercury.pages.Page_CreditCard;

public class Flow_CreditCard extends Basedriver  {
	Page_CreditCard pcc = new Page_CreditCard();
	public void creditcard_flow() throws InterruptedException, IOException {
		pcc.creditcarddetails();
	}
}
