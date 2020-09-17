
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AuditionsLink {

	public static void main(String[] args) {
		   // TODO Auto-generated method stub
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\madhu\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver();  
        driver.get( "https://auditionsadda-v4.ncinc.io/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Auditions")).click();
        WebElement menu = driver.findElement(By.id("category"));
        int cateogories=driver.findElements(By.xpath("//p[@id='category']")).size();
Actions action=new Actions(driver);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        System.out.println(cateogories);
        for(int i=0;i<cateogories;i++)
        {
        	
        	driver.findElements(By.id("category"));
        		
        			
        	action.moveToElement(menu).click().perform();
        				    
        				    
		// TODO Auto-generated method stub

	}

	}
}
