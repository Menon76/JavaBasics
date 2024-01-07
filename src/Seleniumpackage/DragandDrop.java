package Seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gekco.driver", "C://Users//menon//Downloads//geckodriver-v0.30.0-win64//geckodriver.exe");
		WebDriver driver =new FirefoxDriver();// launch firefox browser is launched
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://jqueryui.com/droppable/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.switchTo().frame(0);
		Actions actions = new Actions(driver);
		
		actions.clickAndHold(driver.findElement(By.xpath("//*[@id=\"draggable\"]"))).moveToElement(driver.findElement(By.xpath("//*[@id=\"droppable\"]"))).release().build().perform();
		

		
}}
