package com.amdocs.amazon.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.amazon.base.Base;

public class checkout extends Base {
	
	
	public checkout() {
		PageFactory.initElements(driver, this);
	}

}
