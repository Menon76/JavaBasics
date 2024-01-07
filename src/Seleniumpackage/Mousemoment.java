package Seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousemoment {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C://Users//menon//Downloads//chromedriver-win64_//chromedriver-win64//chromedriver.exe");
		WebDriver driver1 =new ChromeDriver();// launch chrome browser is launched
		driver1.manage().window().maximize();
		driver1.manage().deleteAllCookies();
		driver1.get("https://www.spicejet.com/");
		Actions action = new Actions(driver1);
		Thread.sleep(3000);
		action.moveToElement(driver1.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-ubezar r-16dba41 r-1pzd9i8'][normalize-space()='SpiceClub']"))).build().perform();
		Thread.sleep(3000);
		driver1.findElement(By.xpath("//div[contains(text(),'Our Program')]")).click();
		System.out.println("sucessfully completed testing");
		driver1.quit();
	}

}
