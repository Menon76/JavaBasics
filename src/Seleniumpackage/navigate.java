package Seleniumpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C://Users//menon//Downloads//chromedriver-win64_//chromedriver-win64//chromedriver.exe");
		WebDriver driver =new ChromeDriver();// launch chrome browser is launched
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		driver.get("https://www.google.com/");
		
		driver.navigate().to("https://www.reperiohumancapital.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.quit();
	}

}
