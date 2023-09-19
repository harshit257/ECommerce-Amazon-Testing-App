package com.amdocs.amazon.pageobjects;

import com.amdocs.amazon.base.Base;
import java.util.ArrayList;
import java.util.Set;
import org.openqa.selenium.support.ui.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.amazon.actiondriver.Action;

public class IndexPage extends Base {
	
	@FindBy(xpath = "//*[@id=\"nav-signin-tooltip\"]/a/span")
	WebElement signIn;
	
	@FindBy(xpath="//*[@id=\"nav-search-submit-button\"]")
	WebElement searchSubmitBtn;
	
	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div")
	WebElement firstProduct;
	
	@FindBy(xpath="//*[@id=\"nav-cart-count-container\"]/span[2]")
	WebElement AddToCart;

	public IndexPage() {
		PageFactory.initElements(driver, this);
	}
	
	public SignInPage ClickonSignIn() throws Throwable {
		// TODO Auto-generated method stub
		Action.click(driver, signIn);
		return new SignInPage();
	}
	
}






