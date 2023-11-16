package com.utility;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Helper_Class {
	public static Helper_Class helperclass;
	public static WebDriver driver;	
	public static WebDriver wait;
	public final static int TIMEOUT = 10;
	//constructor
	Helper_Class(){  //setup
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
		driver.manage().window().maximize();
	}
	public static void openPage(String url) {
		driver.get(url);		
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public static void setUpDriver() {
		if(helperclass == null) {
			helperclass = new Helper_Class();			
		}
	}
	public static void tearDown() {
		if(driver!=null) {
			//driver.close();
			//driver.quit();
		}
		helperclass = null;
	}

 
}
