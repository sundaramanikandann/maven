package tabbb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fra {
	public static void main(String[]args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("http://chercher.tech/practice/frames-example-selenium-webdriver"); 
		driver.manage().window().maximize();
		
		driver.switchTo().frame("frame1");
		WebElement car=driver.findElement(By.xpath("//input[@type='text']"));
		car.sendKeys("mugesh");
		
		
//		driver.switchTo().frame("frame2");
//		WebElement bike=driver.findElement(By.id("a"));       /how to identify the frames number
//		bike.click();
		

//		driver.switchTo().frame("frame3");
//		WebElement cycle=driver.findElement(By.id("animals"));
//		cycle.sendKeys("Avatar");
		
//		driver.switchTo().parentFrame();
//		driver.findElement(By.xpath(("//*[text()='Selenium']")).click();    / xpath wrong
		
//		driver.switchTo().defaultContent();
		
}
}