package com.amdocs.amazon.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.amazon.actiondriver.Action;
import com.amdocs.amazon.base.Base;

public class SignInPage extends Base {
	
	@FindBy(xpath="//*[@id=\"ap_email\"]")
	WebElement emailTextbox;
	
	
	@FindBy(xpath="//*[@id=\"continue\"]")
	WebElement continueBtn;
	
	@FindBy(xpath="//*[@id=\"ap_password\"]")
	WebElement passwordTextbox;
	
	@FindBy(xpath="//*[@id=\"signInSubmit\"]")
	WebElement signInSubmitBtn;
	
	
	public SignInPage() { 
		PageFactory.initElements(driver, this);
	}
	
	public HomePage login(String uname,String pwd) throws Throwable{
		Action.type(emailTextbox, uname);
		Action.Wait(driver, 5);
		Thread.sleep(3000);
		Action.click(driver, continueBtn);
		Action.Wait(driver, 5);
		Thread.sleep(3000);
		Action.type(passwordTextbox, pwd);
		Action.Wait(driver, 5);
		Thread.sleep(3000);
		Action.click(driver, signInSubmitBtn);
		Action.Wait(driver, 40);
		Thread.sleep(3000);
		return new HomePage();
	}

}
