package Seleniumpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverBasics {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// launch firefox browser
		System.setProperty("webdriver.gekco.driver", "C://Users//menon//Downloads//geckodriver-v0.30.0-win64//geckodriver.exe");
		WebDriver driver =new FirefoxDriver();// launch firefox browser is launched
		driver.get("https://selectorshub.com/xpath-practice-page/");
		String title = driver.getTitle();
		System.out.println(title);
		
		//validation points
		if(title.equals("Xpath Practice Page | Shadow dom, nested shadow dom, iframe, nested iframe and more complex automation scenarios.")) {
				System.out.println("correct title");
				
		}
		else{
				System.out.println("incorrect title");
			}
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());

		 
		driver.quit();
		
		// launch chrome Browser
				System.setProperty("webdriver.chrome.driver", "C://Users//menon//Downloads//chromedriver-win64_//chromedriver-win64//chromedriver.exe");
				WebDriver driver1 =new ChromeDriver();// launch chrome browser is launched
				driver1.get("https://selectorshub.com/xpath-practice-page/");
				String s1 = driver1.getTitle();
				System.out.println(s1);
				
				
				//validation points
			if(title.equals("Xpath Practice Page | Shadow dom, nested shadow dom, iframe, nested iframe and more complex automation scenarios."))
			{
					System.out.println("correct title");
					
					}
			else
			{
					System.out.println("incorrect title");
				}
			System.out.println(driver.getCurrentUrl());
			//System.out.println(driver.getPageSource());
			driver1.quit();
				

	}
	

}
