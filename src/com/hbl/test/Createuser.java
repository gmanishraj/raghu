package com.hbl.test;

import org.testng.annotations.Test;

import com.hbl.page.Loginpage;

import generic.Basetest;

public class Createuser extends Basetest {
	
	@Test(priority=1)
	public void createaccount()
	{
		Loginpage l1=new Loginpage(driver);
		l1.createaccount();
		
	}

}
