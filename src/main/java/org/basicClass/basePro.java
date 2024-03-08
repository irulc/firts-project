package org.basicClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basePro {
	public static WebDriver driver;
	public static WebDriver Browserr(String s) {
		if(s.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(s.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else if(s.equalsIgnoreCase("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
			
		return driver;
	}
	public static void urlLanch(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
	public static void click(WebElement e) 
	{	
     e.click();
	}
	public static void quit() {
		driver.quit();
	}
	
	public static void getcurrenturl() {
		driver.getCurrentUrl();
	}
	public static void implicitwait(long w) {
		driver.manage().timeouts().implicitlyWait(w, TimeUnit.SECONDS);
	}
	public static void sendKeys(WebElement e,String b) {
		e.sendKeys(b);
		
	}
	public static void selectbyIndex (int a,WebElement e) {
    	Select se= new Select(e);
    	se.selectByIndex(a);
    	
    }
    public static void selectbyvalue(String a,WebElement e) {
    	Select se1=new Select(e);
    	se1.selectByValue(a);
    }
    public static void selectByvisibletext(String a,WebElement e) {
    	Select sec2=new Select(e);
    	sec2.selectByVisibleText(a);
    }
    public static String contains(String s) {
    	s.contains(s);
		return s;
    	
    }

}


