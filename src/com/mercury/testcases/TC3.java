package com.mercury.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.mercury.basedriver.Basedriver;
import com.mercury.flows.Flow_Preferences;

public class TC3 extends Basedriver {
	Flow_Preferences pr = new Flow_Preferences();

	@Test
	public void testpreferences() throws InterruptedException, IOException {
		pr.preferences_flow();

	}

}
