package fileoperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frames {
	public static void main(String[]args) {
		String frame=("http://chercher.tech/practice/frames-example-selenium-webdriver");
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("http://chercher.tech/practice/frames-example-selenium-webdriver"); 
		driver.manage().window().maximize();
		
		driver.switchTo().frame("frame1");
		driver.switchTo().frame("frame3");
		driver.findElement(By.id("a")).click();
//		xpath for frame 1 oor frame 3  "a"
		
		driver.switchTo().parentFrame();
		String text=driver.findElement(By.id("topic")).getText();
		System.out.println(text);
}
}


