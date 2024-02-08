package fileoperation;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class action {
public static void main(String[]args) throws Throwable  {
	WebDriverManager.edgedriver().setup();
//	System.setProperty(webdriver.driver.edgedriver", "C:\Users\manik\\eclipse-workspace\\MavenProject\\target\\driver");
	WebDriver driver = new EdgeDriver();
//	String st="https://www.flipkart.com/";
//	driver.get(st);
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	
	Thread.sleep(3000);
	WebElement element = driver.findElement(By.id("email"));
	Actions a = new Actions(driver);
	a.sendKeys(element,"mani").perform();
	
//	Actions a = new Actions(driver);
//	WebElement user = driver.findElement(By.xpath("//span[text()='Mobiles']"));
//	a.moveToElement(user).build().perform();
	
	
}
}



