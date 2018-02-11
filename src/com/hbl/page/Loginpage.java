package com.hbl.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Basepage;

public class Loginpage extends Basepage{
	
	@FindBy(id="Email")
	private WebElement emailtb;
	
	@FindBy(id="Password")
	private WebElement paswordtb;
	
	@FindBy(id="submitLoginButton")
	private WebElement loginbtn;
	
	@FindBy(xpath="//a[.='Create a Free Account']")
	private WebElement freebtn;
	
	
	@FindBy(id="show-pass")
	private WebElement showpassbtn;
	
	@FindBy(id="forgot-pass")
	private WebElement forgotbtn;
	
	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    public void enteremail(String un)
    {
      emailtb.sendKeys("admin");
    }
    
    public void enterpaword(String pw)
    {
    	paswordtb.sendKeys("admin");
    }
    public void createaccount()
    {
        freebtn.click();
    }
}
