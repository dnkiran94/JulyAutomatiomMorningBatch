package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// 7) launchBrowser-->navigate-->login-->createCustomer-->CreateProject-->Create Tasks -->Delete Tasks -->DeleteProject-->deleteCustomer-->logout -->closeApplication


public class Assignment7 {
 
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		CreateCustomer();
		CreateProject();
		CreateTask();
		deleteTask();
		DeleteProject();
		DeleteCustomer();
		Logout();
		closeApplication();

	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
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
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
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
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void CreateCustomer()
	{
		try
		{
		 oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[3]/a")).click();
		 Thread.sleep(2000);
		 oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[2]")).click();	
		 Thread.sleep(2000);
		 oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
		 Thread.sleep(2000);
		 oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("Kiran");	
		 Thread.sleep(2000);
		 oBrowser.findElement(By.xpath("//*[@id='customerLightBox_commitBtn']/div/span")).click();
		 Thread.sleep(2000);
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	static void CreateProject()
	{
		try
		{
		 oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div")).click();
		 oBrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
		 Thread.sleep(2200);
		 oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("Mission actiTime Automation");
		 Thread.sleep(2200);	
		 oBrowser.findElement(By.xpath("//*[@id='projectPopup_commitBtn']/div/span")).click();
		 Thread.sleep(2000);
		 
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void CreateTask()
	{
		try
		{
		 oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[1]/div[1]/div[3]/div/div[2]")).click();
		 Thread.sleep(2200);
		 oBrowser.findElement(By.xpath("/html/body/div[13]/div[1]")).click();
		 Thread.sleep(2200);
		 oBrowser.findElement(By.xpath("//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input")).sendKeys("Automation");
		 Thread.sleep(2200);
		 oBrowser.findElement(By.xpath("//*[@id=\'createTasksPopup_commitBtn\']/div/span")).click();
		 Thread.sleep(2200);
		 
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void deleteTask()
	{
		try
		{
		 oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[1]/div/div")).click();
		 Thread.sleep(4000);
		 oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]/div/div[2]")).click();
	     Thread.sleep(2000);
		 oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[3]/div[1]/div[2]/div[3]/div/div")).click();
		 Thread.sleep(2000);
		 oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[3]/div[4]/div/div[3]/div")).click();
		 Thread.sleep(2000);
		 oBrowser.findElement(By.xpath("//*[@id='taskPanel_deleteConfirm_submitTitle']")).click();
		 Thread.sleep(2000);
		 
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void DeleteProject()
	{
		try
		{
		 oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[2]")).click();
		 Thread.sleep(2000);
		 oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
		 Thread.sleep(2000);
		 oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")).click();
		 Thread.sleep(2000);
		 oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")).click();
		 Thread.sleep(2000);
		 oBrowser.findElement(By.xpath("//*[@id=\'projectPanel_deleteConfirm_submitTitle\']")).click();
		 Thread.sleep(2000);
		 
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void DeleteCustomer()
	{
		try
		{
			
			 oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]")).click();
			 Thread.sleep(2000);
			 oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			 Thread.sleep(2000);
			 oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[1]/div[4]/div/div/div[2]")).click();
			 Thread.sleep(2000);
			 oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[4]/div/div[3]/div")).click();
			 Thread.sleep(2000);
			 oBrowser.findElement(By.xpath("//*[@id='customerPanel_deleteConfirm_submitTitle']")).click();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void Logout()
	{
		{
			try
			{
				oBrowser.findElement(By.linkText("Logout")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
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
