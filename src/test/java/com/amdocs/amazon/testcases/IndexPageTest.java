package com.amdocs.amazon.testcases;

import com.amdocs.amazon.actiondriver.Action;
import com.amdocs.amazon.base.Base;
import com.amdocs.amazon.pageobjects.HomePage;
import com.amdocs.amazon.pageobjects.IndexPage;
import com.amdocs.amazon.pageobjects.SignInPage;
import com.amdocs.amazon.pageobjects.cart;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IndexPageTest extends Base {

	
	private IndexPage indexPg;
	
	@BeforeMethod
		public void setup() throws IOException {
		loadConfig();
		launchApp();
		
		indexPg= new IndexPage();
	}
	
	@Test
	public void loginTest() throws Throwable{
		SignInPage signIn= indexPg.ClickonSignIn();
		HomePage home= signIn.login(getUsername(),getPassword());
		
		home.SearchProduct("iPhone 13");
		cart item=home.SelectProduct();
		item.proceedToBuy();
	
	}
}
	


