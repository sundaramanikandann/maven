package fileoperation;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowshandling{
	public static void main(String[]args) throws InterruptedException {
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();

	WebElement s=driver.findElement(By.xpath("//input[@type='text']"));
	s.sendKeys("Mobile");
    Thread.sleep(3000);
	WebElement s1=driver.findElement(By.xpath("//input[@type='submit']"));
	s1.click();
	WebElement s2=driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
	s2.click();
	WebElement s3=driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]"));
	s3.click();
	String parent=driver.getWindowHandle();
	Set<String> child =driver.getWindowHandles(); 
	List<String> child1=new ArrayList<>();
	 //for(String x:child) {
	//	if(!parent.equals(x)) {
	        driver.switchTo().window(child1.get(3));
			WebElement sne3=driver.findElement(By.xpath("//span[@id='productTitle']"));
			//System.out.println(sne3); 	
		
	
	

}}