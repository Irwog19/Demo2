package com.mercury.flows;

import java.io.IOException;

import com.mercury.basedriver.Basedriver;
import com.mercury.pages.Page_Passengers;

public class Flow_Passengers extends Basedriver {
	Page_Passengers pp = new Page_Passengers();
	
	public void passengers_flow() throws IOException, InterruptedException {
		pp.passenger1();
		pp.passenger2();
	}
			

}
