package com.hbl.page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Freeaccount_creattion {
	
	@FindBy(id="FirstName")
	private WebElement firtnamebtn;
	
	@FindBy(id="LastName")
	private WebElement lastnamebtn;
	
	@FindBy(id="PhoneNumber")
	private WebElement phonebtn;
	
	@FindBy(id="PhoneType")
	private WebElement phonetypebtn;
	
	@FindBy(id="Email")
	private WebElement emailbtn;
	
	@FindBy(id="ConfirmEmail")
	private WebElement confirmemailbtn;
	
	@FindBy(id="Password")
	private WebElement passwordbtn;
	
	@FindBy(id="ConfirmPassword")
	private WebElement confirmpassbtn;
	
	@FindBy(id="btn-submit")
	private WebElement submitbtn;
	
	@FindBy(xpath="//a[.='Sign into your Account']")
	private WebElement signbtn;
	
	@FindBy(id="show-pass")
	private WebElement passbtn;

	
	
	
	public Freeaccount_creattion(WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
		
	}
		
	

	public void firstname(String fn)
	{
		firtnamebtn.sendKeys("jhon");
	}
	 public void lastname(String ln)
	 {
		 lastnamebtn.sendKeys("k");
	 }
	 public void phonenumber(String pn)
	 {
		 phonebtn.sendKeys("9566665");
	 }
     public void phonetype(String pt)
     {
    	 Select drop= new Select(phonetypebtn);
    	 drop.selectByIndex(1);
    	 
     }
}
