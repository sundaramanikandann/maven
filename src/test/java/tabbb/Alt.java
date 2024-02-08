package tabbb;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alt {
	public static void main(String[]args)throws InterruptedException{
		WebDriverManager.edgedriver().setup();	
		WebDriver driver=new EdgeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		
		WebElement web=driver.findElement(By.name("alert"));
		web.click();
		Thread.sleep(5000);
	    Alert simple=driver.switchTo().alert();
	    simple.accept();
	    
	    WebElement webS=driver.findElement(By.name("confirmation"));  
		webS.click();
		Thread.sleep(4000);
	    Alert confirm=driver.switchTo().alert();
	    confirm.dismiss();
//	    output not working
	    
	    WebElement webH=driver.findElement(By.name("prompt"));  
		webH.click();
		Thread.sleep(4000);
	    Alert prompt=driver.switchTo().alert();
	    prompt.sendKeys("manikandan");
	    prompt.dismiss();
	    String text=prompt.getText();
	    System.out.println(text);
	   
	    
	}	
}