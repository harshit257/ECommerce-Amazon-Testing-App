package com.amdocs.amazon.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.amazon.actiondriver.Action;
import com.amdocs.amazon.base.Base;

public class cart extends Base {
	
	@FindBy(xpath="//*[@id=\"sc-buy-box-ptc-button\"]/span/input")
	WebElement proceedtoBuy;
	
	@FindBy(xpath="//*[@id=\"shipToThisAddressButton\"]/span/input")
	WebElement addressButton;
	
	public cart() {
		PageFactory.initElements(driver,this);
	}
	
	public checkout proceedToBuy() throws Throwable{
		
		Action.click(driver, proceedtoBuy);
		Thread.sleep(3000);
		Action.click(driver, addressButton);
		Thread.sleep(3000);
		return new checkout();
		
	}
	
	
}
