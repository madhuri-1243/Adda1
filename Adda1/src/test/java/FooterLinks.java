import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FooterLinks {

	
		// TODO Auto-generated method stub
		public static WebDriver driver;
		
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\madhu\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	JavascriptExecutor js=(JavascriptExecutor) driver;
	
	
	driver.get("https://auditionsadda-v4.ncinc.io/");
	driver.manage().window().maximize();		
			String url = driver.getTitle();
			System.out.println("URL is :::"+url);
			
			
			
			
			System.out.println("URL is :::Wake Up");
			js.executeScript("window.scrollBy(0,6000)");
			
			int countSize=driver.findElements(By.xpath("//*[contains(@class,'menu-item menu-item-type-taxonomy menu-item-object-mt-listing-category2 menu-item')]//a")).size();			
			System.out.println(countSize);
			
			for(int i=0;i<countSize;i++)
			{
				String ClickOnLinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
				driver.findElements(By.xpath("//*[contains(@class,'menu-item menu-item-type-taxonomy menu-item-object-mt-listing-category2 menu-item')]//a")).get(i).sendKeys(ClickOnLinkTab);
			
				
				
			}
			
			int countSize1=driver.findElements(By.xpath("//aside[@id='nav_menu-2']//a")).size();
			for(int j=0;j<countSize1;j++)
			{
				String ClickOnLinkTab1=Keys.chord(Keys.CONTROL,Keys.ENTER);
				driver.findElements(By.xpath("//aside[@id='nav_menu-2']//a")).get(j).sendKeys(ClickOnLinkTab1);
				
			}
			int countSize2=driver.findElements(By.xpath("//aside[@id='nav_menu-4']//a")).size();
			for(int k=0;k<countSize2;k++)
			{
				String ClickOnLinkTab2=Keys.chord(Keys.CONTROL,Keys.ENTER);
				driver.findElements(By.xpath("//aside[@id='nav_menu-4']//a")).get(k).sendKeys(ClickOnLinkTab2);
			
				
			}
			int countSize3=driver.findElements(By.xpath("//aside[@id='nav_menu-5']//a")).size();
			for(int l=0;l<countSize3;l++)
			{
				String ClickOnLinkTab3=Keys.chord(Keys.CONTROL,Keys.ENTER);
				driver.findElements(By.xpath("//aside[@id='nav_menu-5']//a")).get(l).sendKeys(ClickOnLinkTab3);
			
			
			}

		}
}


