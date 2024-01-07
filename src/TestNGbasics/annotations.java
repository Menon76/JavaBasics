package TestNGbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class annotations {
	
	WebDriver driver =new ChromeDriver();// launch chrome browser is launched

	
	

	@BeforeSuite  
	public void Beformethod1() {
		System.setProperty("webdriver.chrome.driver", "C://Users//menon//Downloads//chromedriver-win64_//chromedriver-win64//chromedriver.exe");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().deleteAllCookies();
		System.out.println("this is a before suite method");
	}
	@BeforeTest 
	public void Beformethod2() {
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		System.out.println("this is a before Test method");
	}
	
	@BeforeClass 
	public void launchbrowser() {
		driver.findElement(By.name("email")).sendKeys("menonsuraj123@gmail.com");
		System.out.println("this is a before class annotation ");
	}
	
	@BeforeMethod
	public void Beformethod4() {
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Quantiphi@123");
		System.out.println("this is a before method");
	}
	
	@org.testng.annotations.Test
	public void Test() {
		
		System.out.println("this is a Test anotations");
	}
	
	@AfterMethod
	public void Aftermethod() {
		System.out.println("this is a After method anotations");
	}
	
	@org.testng.annotations.AfterClass
	public void AfterClass() {
		System.out.println("this is a After Class anotations");
	}
	@AfterTest
	public void Aftertest() {
		System.out.println("this is a After Test anotations");
	}
	
	@org.testng.annotations.AfterSuite
	public void AfterSuite() {
		driver.quit();
		System.out.println("this is a After Suite anotations");
	}
	

	
}
