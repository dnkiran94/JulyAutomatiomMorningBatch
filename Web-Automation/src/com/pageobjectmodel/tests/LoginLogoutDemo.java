package com.pageobjectmodel.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogoutDemo {

	public static WebDriver oBrowser=null;
	public static ActiPage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		logout();
		closeApplication();
	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiPage(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:83/login.do");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void login()
	{
		try
		{
		  oPage.getUserName().sendKeys("admin");
		  oPage.getPassword().sendKeys("manager");
		  oPage.getLoginButton().click();
		  Thread.sleep(4000);	
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void minimizeFlyOutWindow()
	{
		try
		{
			oPage.getFlyoutWin().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void logout()
	{
		try
		{
			oPage.getLogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void closeApplication()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}	
