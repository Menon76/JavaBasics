package Seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorsessions {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//menon//Downloads//chromedriver-win64_//chromedriver-win64//chromedriver.exe");
		WebDriver driver1 =new ChromeDriver();// launch chrome browser is launched
		driver1.get("https://selectorshub.com/xpath-practice-page/");
		// by xpaths
		
		
		driver1.findElement(By.xpath("//*[@id='shub84']")).sendKeys("Suraj123@gmail.com");
		
		driver1.findElement(By.xpath("//*[@id='pass']")).sendKeys("Quantiphi@123");

		
		driver1.findElement(By.xpath("//*[@id='content']/div/div/section[2]/div/div/div/div/div/form/div/div[1]/div/div/div/input[1]")).sendKeys("Quantiphi");


		
		//by Id
		
		driver1.findElement(By.id("shub84")).sendKeys("Suraj123@gmail.com");
		
		driver1.findElement(By.id("pass")).sendKeys("Quantiphi@123");
		
		
		// name locator
		driver1.findElement(By.name("email")).sendKeys("Suraj123@gmail.com");
		
		driver1.findElement(By.name("Password")).sendKeys("Quantiphi@123");
		
		// link texts
		
		driver1.findElement(By.linkText("Find out how to automate these controls without XPath")).click();
		
		
		
		
	}

}
