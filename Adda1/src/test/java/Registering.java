

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class Registering {
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\madhu\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
JavascriptExecutor js = (JavascriptExecutor) driver;
driver.get("https://auditionsadda-v4.ncinc.io/");
driver.manage().window().maximize();		
		String url = driver.getTitle();
		System.out.println("URL is :::"+url);
		
		
		Thread.sleep(10000);
		
		System.out.println("URL is :::Wake Up");
		
		
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Register here")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("first_name")).sendKeys("Madhuri A");
		driver.findElement(By.id("email")).sendKeys("madhurikrishnakanth+5@gmail.com");
		driver.findElement(By.id("aa_phone_number")).sendKeys("9000000000");
		
		Select s=new Select(driver.findElement(By.id("user_pro_state")));
		s.selectByValue("Delhi");
		Thread.sleep(1000);
	 Select s1=new Select(driver.findElement(By.id("user_pro_city")));
	 s1.selectByValue("Delhi");
	 driver.findElement(By.id("passw1")).sendKeys("hello#123");
	 driver.findElement(By.id("passw2")).sendKeys("hello#123");
	 driver.findElement(By.id("aa_terms_conditions")).click();
	 Thread.sleep(500);
WebElement element=	 driver.findElement(By.id("register"));

js.executeScript("arguments[0].scrollIntoView();", element);
driver.findElement(By.id("register")).click();
Thread.sleep(50);
/* js.executeScript("window.scrollBy(0,1000)");
 WebElement columnDriver1=driver.findElement(By.id("menu-footer1"));
List<WebElement> columnCount1=columnDriver1.findElements(By.tagName("a"));
System.out.println(columnCount1);

for(int i=1;i<columnCount1.size();i++)
{
	String ClickOnLinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
	driver.findElements(By.tagName("a")).get(i).sendKeys(ClickOnLinkTab);
	
}

 
 */
	
	}

}