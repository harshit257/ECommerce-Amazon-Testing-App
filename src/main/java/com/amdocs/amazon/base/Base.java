package com.amdocs.amazon.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

//import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


//import com.aventstack.extentreports.model.Log;
//import com.solera.mystore.utility.extentreports.ExtentManager;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
		public static WebDriver driver;
	    public static Properties prop;
	    
	    public static void loadConfig()
	    {
	        try {
	            prop=new Properties();
	            System.out.println("super construtor invoked");
	            FileInputStream ip=new FileInputStream("C:\\Users\\Administrator\\AmdocsAQE\\MyAmazonTestNG\\Configuration\\config.properties");
	            prop.load(ip);
	            System.out.println("driver : "+driver);
	            }
	        catch(FileNotFoundException e)
	        {
	            e.printStackTrace();

	        }
	        catch(IOException e)
	        {
	            e.printStackTrace();
	        }
	    }

	    public static void launchApp() throws IOException
	    
	    {
	        WebDriverManager.edgedriver().setup();
	        String browserName=prop.getProperty("browser");
	        if(browserName.contains("Chrome"))
	        {
	            driver=new ChromeDriver();
	        }
	        else if(browserName.contains("Edge"))
	        {
	            driver=new EdgeDriver();
	        }
	        else if(browserName.contains("IE"))
	        {
	            driver=(WebDriver) new InternetExplorerDriver();
	        }

	        driver.manage().window().maximize();
	        driver.manage().deleteAllCookies();
	        driver.get(prop.getProperty("url"));
	    }
	    
	    public static String getUsername() {
	     return prop.getProperty("username");
	    }
	    
	    public static String getPassword() {
	        return prop.getProperty("password");
	       }


}
