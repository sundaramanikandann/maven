package tabbb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.jfr.internal.Options;

public class Dropdown {
	
	public static void main(String[]args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.manage().window().maximize();
		
        WebElement dd=driver.findElement(By.xpath("//select[@id='first']") );
        Select ss=new Select(dd);
      ss.selectByIndex(1);
      Thread.sleep(3000);
////        ss.selectByValue("Google");     / output error
////        Thread.sleep(3000);
      ss.selectByVisibleText("Yahoo");
      Thread.sleep(3000);
      boolean multiple =ss.isMultiple();
       System.out.println(multiple);
       
       
  
//       for (int i=0;i<options.size();i++) { // for loop error
    	   
       List<WebElement> options = ss.getOptions();
		for (int i=0;i<options.size();i++) {
			WebElement element=options.get(i);
			String Values=element.getText();
			System.out.println(Values);
		}   
       
        WebElement sss=driver.findElement(By.xpath("//select[@id='second']"));
//        sss.selectByIndex(2); 
////    Thread.sleep(3000);error
//          sss.selectByValue("donut"); 
////    Thread.sleep(3000);error
//        sss.selectByVisibleText("Burger"); error
////    Thread.sleep(3000);
        
        List<WebElement> opt = ss.getOptions();
		for (int i=0;i<opt.size();i++) {
			WebElement element=opt.get(i);
			String Values=element.getText();
			System.out.println(Values);
//			same output for single and multiple?
		}}}		
			
			
			
			
        
        
        
        
        
        
        
        
        
        
        
       
       
       
       
       

