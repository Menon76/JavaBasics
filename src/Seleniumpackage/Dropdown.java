package Seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gekco.driver", "C://Users//menon//Downloads//geckodriver-v0.30.0-win64//geckodriver.exe");
		WebDriver driver =new FirefoxDriver();// launch firefox browser is launched
		driver.get("https://selectorshub.com/xpath-practice-page/");
		String title = driver.getTitle();
		System.out.println(title);

		
		//dropdown handeling
		
		Select select = new Select(driver.findElement(By.id("cars")));
		select.selectByVisibleText("Opel");
		
		
	}

}
