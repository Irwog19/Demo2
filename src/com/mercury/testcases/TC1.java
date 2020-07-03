package com.mercury.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.mercury.basedriver.Basedriver;
import com.mercury.flows.Flow_Login;


public class TC1 extends Basedriver{
	Flow_Login fl = new Flow_Login();
	
	@Test
	public void testLogin() throws InterruptedException, IOException {
		fl.login_flow();
		
	}

}
