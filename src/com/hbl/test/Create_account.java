package com.hbl.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.hbl.page.Freeaccount_creattion;
import com.hbl.page.Loginpage;

import generic.Basetest;

public class Create_account extends Basetest{
	
	
	@Test(priority=2)
	public void createacc()
	{
//		Loginpage l1=new Loginpage(driver);
//		l1.createaccount();
		Freeaccount_creattion f = new Freeaccount_creattion(driver);
		f.firstname("un");

}
}