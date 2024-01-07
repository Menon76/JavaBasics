package Seleniumpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popupalerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//menon//Downloads//chromedriver-win64_//chromedriver-win64//chromedriver.exe");
		WebDriver driver1 =new ChromeDriver();// launch chrome browser is launched
		driver1.get("https://selectorshub.com/xpath-practice-page/");
		String s1 = driver1.getTitle();
		System.out.println(s1);
		
		Thread.sleep(10000);
		
		
		Alert popup =driver1.switchTo().alert();
		popup.accept();
		
		

	}

}
