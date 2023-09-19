package com.amdocs.amazon.pageobjects;

import com.amdocs.amazon.pageobjects.cart;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.amazon.actiondriver.Action;
import com.amdocs.amazon.base.Base;

public class HomePage extends Base {
	
	@FindBy(xpath="//*[@id=\"twotabsearchtextbox\"]")
	WebElement searchBox;
	
	
	@FindBy(xpath="//*[@id=\"nav-search-submit-button\"]")
	WebElement searchButton;
	
	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")	WebElement firstItem;
	
	@FindBy(xpath="//*[@id=\"add-to-cart-button\"]")
	WebElement addtoCart;
	
	@FindBy(xpath="//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")
	WebElement sideviewCart;
	
	@FindBy(xpath="//*[@id=\"sc-buy-box-ptc-button\"]/span/input")
	WebElement proceedtoBuy;
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void SearchProduct(String prod) throws Throwable{
		Action.click(driver,searchBox);
		Thread.sleep(2000);
		Action.type(searchBox, prod);
		Action.click(driver, searchButton);
		Action.Wait(driver, 5);
		Thread.sleep(3000);
	}
	
	public cart SelectProduct() throws Exception{
	
		Action.click(driver, firstItem);
		Action.Wait(driver, 5);
		Thread.sleep(3000);
		
		ArrayList<String> newTb= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newTb.get(1));
		Action.Wait(driver, 5);
		Thread.sleep(3000);
		Action.click(driver, addtoCart);
		Action.Wait(driver, 5);
		Thread.sleep(4000);
		Action.click(driver, sideviewCart);
		Action.Wait(driver, 5);
		Thread.sleep(4000);
		
		return new cart();
	}
	
	
	
}
