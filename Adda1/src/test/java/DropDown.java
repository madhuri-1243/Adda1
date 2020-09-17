import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDown {

	
		public static void main(String[] args) {
			   // TODO Auto-generated method stub
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\madhu\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
	    	WebDriver driver=new ChromeDriver();  
	    	//Actions action=new Actions(driver);
	        driver.get( "https://auditionsadda-v4.ncinc.io/");
	        driver.manage().window().maximize();
	        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	        WebDriverWait wait = new WebDriverWait(driver,30);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("select2-mt-listing-category-2m-container")));
	        driver.findElement(By.id("select2-mt-listing-category-2m-container")).click();
	       
	   //action.moveToElement(menu).click().build().perform();
	}

}
