package fileoperation;


import org.openqa.selenium.By; 
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.*;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class javascriptexecutor {
		

		public static void main(String[]args) throws Throwable {
			WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			
JavascriptExecutor js= (JavascriptExecutor)driver;

WebElement user = driver.findElement(By.id("email"));
js.executeScript("arguments[0].setAttribute('value','sathish')", user);

//Object execute = js. executeScript("return argument[0].getAttribute('value')", user );
//System.out.println(execute);

//WebElement pass =  driver.findElement(By.xpath("//input[@type='password']"));
//js.executeScript("arguments[0].setAttribute(''value,'12345')", pass);

WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
js.executeScript("argument[0].click()",login);

Thread.sleep(2000);
WebElement scolldown =  driver.findElement(By.xpath(""));
js.executeScript("arguments[0].scrollIntoview(true)", scolldown);

Thread.sleep(2000);
WebElement scollup =  driver.findElement(By.id("email"));
js.executeScript("arguments[0].scrollIntoview(false)", scollup);

Thread.sleep(2000);
WebElement user2=  driver.findElement(By.id("email"));
js.executeScript("arguments[0].setAttribute('style','background:yellow;border:2px solid red')",user2);





	/*		
		WebElement Mvdropdown=driver.findElement(By.xpath("//select[@id=\"second\"]"));
			Mvdropdown.click();
			Select s=new Select(Mvdropdown);
			s.selectByIndex(1);
		Thread.sleep(4000);
			s.selectByIndex(0);
			Thread.sleep(4000);
			s.selectByIndex(3);
			
			List<WebElement> allSelectedOptions=s.getAllSelectedOptions();
			for(int i =0;i < allSelectedOptions.size();i++) {
			WebElement webElement=allSelectedOptions.get(i);
			String text=webElement.getText();
			System.out.println(text);
			}
		}

		private Object executeScript(String string, WebElement login) {
			// TODO Auto-generated method stub
			
	*/}
}
