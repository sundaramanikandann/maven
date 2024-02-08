package fileoperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {
	public static void main(String[]args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.manage().window().maximize();
		
		WebElement dropdown=driver.findElement(By.xpath("//select[@id=\"first\"]"));
		Select ss=new Select(dropdown);
		ss.selectByIndex(2);
//	    Thread.sleep(4000);
//		ss.selectByValue("Iphone");
		Thread.sleep(3000);
		ss.selectByVisibleText("Google");
		
		List<WebElement> options = ss.getOptions();
		for (int i=0;i<options.size();i++) {
			WebElement element=options.get(i);
			String Values=element.getText();
			System.out.println(Values);
		}
		
		WebElement dropdown1 = driver.findElement(By.xpath("//select[@id=\"second\"]"));
		dropdown1.click();
		
		Select s1 = new Select (dropdown1);
		s1.selectByIndex(0);
		s1.selectByIndex(1);
		s1.selectByIndex(2);
		
		List<WebElement> allSelectedOptions = s1.getAllSelectedOptions();
		for(int i=0;i<allSelectedOptions.size();i++) {
			WebElement element = allSelectedOptions.get(i);
			String text = element.getText();
			System.out.println(text);
		}
		
		//System.out.println(s1.getFirstSelectedOption().getText());
		
//		WebElement drop= s1.getFirstSelectedOption();
//		
//			String Values=drop.getText();
//			System.out.println(Values);
		}
		
	}
			
		
			
			
			
			
			
			
			
			
			
			
			
	
//	WebElement Mvdropdown=driver.findElement(By.xpath("//select[@id=\"second\"]"));
//		Mvdropdown.click();
//		Select s=new Select(Mvdropdown);
//		s.selectByIndex(1);
//	Thread.sleep(4000);
//		s.selectByIndex(0);
//		Thread.sleep(4000);
//		s.selectByIndex(3);
//		
//		List<WebElement> allSelectedOptions=s.getAllSelectedOptions();
//		for(int i =0;i < allSelectedOptions.size();i++) {
//		WebElement webElement=allSelectedOptions.get(i);
//		String text=webElement.getText();
//		System.out.println(text);
//		}
//	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
