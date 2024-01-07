package Seleniumpackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.lang.model.util.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class automateReperio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//menon//Downloads//chromedriver-win64_//chromedriver-win64//chromedriver.exe");
		WebDriver driver =new ChromeDriver();// launch chrome browser is launched
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.get("https://www.reperiohumancapital.com/");
		driver.findElement(By.linkText("Jobs"));
		driver.findElement(By.xpath("//label[@class='option']")).click();
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@id='edit-submit']")).click();
		List<WebElement> atags = driver.findElements(By.tagName("a"));
		 for (WebElement atags1 : atags) {
	            atags1.click();
	        }
		}

		
		
		}

