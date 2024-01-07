package Seleniumpackage;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class takescreenshots {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C://Users//menon//Downloads//chromedriver-win64_//chromedriver-win64//chromedriver.exe");
		WebDriver driver =new ChromeDriver();// launch chrome browser is launched
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		//take a screenshot
		
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String screenshotBase64 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
	}

}
