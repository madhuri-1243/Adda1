import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClearTest {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\madhu\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		
		driver.get("https://auditionsadda-v4.ncinc.io/");
		driver.manage().window().maximize();		
				//String url = driver.getTitle();
				//System.out.println("URL is :::"+url);
				//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.findElement(By.linkText("Auditions")).click();
				
				//WebElement element = driver.findElement(By.xpath("//p[contains(text(),'Actor')]"));
				/*Actions action=new Actions(driver);
				JavascriptExecutor executor = (JavascriptExecutor)driver;
				//executor.executeScript("arguments[0].click();", element);
				action.moveToElement(element).click().build().perform();
*/
				JavascriptExecutor js = (JavascriptExecutor)driver;
				for(int i=0;i<10;i++)
				{
				    
					js.executeScript("document.getElementsByTagName(\"p\")[0].childNodes.length;i++");
				}
				
	}

}
