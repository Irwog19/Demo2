package com.mercury.flows;

import java.io.IOException;

import com.mercury.basedriver.Basedriver;
import com.mercury.pages.Page_Preferences;

public class Flow_Preferences extends Basedriver {
	Page_Preferences pr = new Page_Preferences();

	public void preferences_flow() throws InterruptedException, IOException {
		pr.serviceclass();
		pr.airlines();
		pr.screenshotPreference();
	}
}
