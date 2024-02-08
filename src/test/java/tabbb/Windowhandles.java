package tabbb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandles {
	public static void main(String[]args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
//		//input[type()='text']
		//input[@type='submit']  ////span[@class='a-size-medium a-color-base a-text-normal'][1]
		
		WebElement s=driver.findElement(By.xpath("//input[@type='text']"));
		s.sendKeys("mobiles");
	    Thread.sleep(3000);
		WebElement submit=driver.findElement(By.xpath("//input[@type='submit']"));
			s.click();
	  		 WebElement s2=driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal'][1]"));
          s.click();
	}}