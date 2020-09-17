import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Headers {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\madhu\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		
		driver.get("https://auditionsadda-v4.ncinc.io/");
		driver.manage().window().maximize();		
				String url = driver.getTitle();
				System.out.println("URL is :::"+url);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				int countSize=driver.findElements(By.xpath("//li[contains(@class,'menu-item menu-item-type-post_type')]//a")).size();
				System.out.println(countSize);
				for(int i=0;i<countSize;i++)
				{
				 driver.findElement(By.xpath("//li[contains(@class,'menu-item menu-item-type-post_type')]//a")).click();
				
				}
				
				
		// TODO Auto-generated method stub

	}

}
