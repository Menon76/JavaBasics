package XpathPracticePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomatePage1 {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//menon//Downloads//chromedriver-win64_//chromedriver-win64//chromedriver.exe");
		WebDriver driver =new ChromeDriver();// launch chrome browser is launched
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		String title = driver.getTitle();
		System.out.println(title);
		
		
		WebElement your_element = driver.findElement(By.className("sgpb-popup-close-button-6"));
		
		if (isElementPresent(driver, your_element))
		 {
			 your_element.click();
            
		 }
		driver.findElement(By.name("email")).sendKeys("menonsuraj123@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Quantiphi@123");
		driver.findElement(By.name("company")).sendKeys("Quantiphi");
		driver.findElement(By.name("mobile number")).sendKeys("0877857375");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.id("inp_val")).sendKeys("Love");
		driver.findElement(By.className("sgpb-popup-close-button-6")).click();

		driver.findElement(By.linkText("DownLoad Link")).click();
		driver.findElement(By.linkText(" SelectorsHub Youtube Channel  ")).click();
		driver.findElement(By.className("nameFld")).sendKeys("Suraj");
		driver.findElement(By.name("test")).sendKeys("Menon");
		Select select = new Select(driver.findElement(By.id("cars")));
		select.selectByVisibleText("Opel");
		driver.findElement(By.linkText("Find out how to automate these controls without XPath")).click();
		driver.findElement(By.linkText("New Year Gift: Get Free Access of Advanced XPath and CSS Selector Paid Course")).click();
		driver.findElement(By.linkText("Consider a small Donation and support this page.")).click();
		driver.quit();
		}

	private static boolean isElementPresent(WebDriver driver, WebElement your_element) {
	 try {
         driver.findElement(By.className("sgpb-popup-close-button-6"));
         return true;
     } catch (org.openqa.selenium.NoSuchElementException e)
	{
		return false;
	}
}
}
