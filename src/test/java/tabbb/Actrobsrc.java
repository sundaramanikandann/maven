package tabbb;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actrobsrc {
public static void main(String[]args)throws Throwable {
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	String st=("https://www.facebook.com/");
	driver.get(st);
	driver.manage().window().maximize();
	
	Thread.sleep(4000);
	WebElement we =driver.findElement(By.id("email"));
	Actions a=new Actions(driver);
	a.sendKeys(we,"mani").perform();
	a.doubleClick().perform();
	a.contextClick().perform();
	
	Robot r=new Robot();
	for( int i=0;i<2;i++){
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	}
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_V);
	
	TakesScreenshot tk=(TakesScreenshot) driver; 
	File desc=tk.getScreenshotAs(OutputType.FILE);
	File src= new File("C:\\Users\manik\eclipse-workspace\MavenProject\target\\image.png");
	FileUtils.copyFile(desc,src);
	
	
}}
