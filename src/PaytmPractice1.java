import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.dom.Document;

public class PaytmPractice1 {

	WebDriver driver;
	
	@BeforeMethod 
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Onedrive\\Selenium sws\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://paytm.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	
	@Test
	public void Login() throws Exception 
	{
		/*WebElement Signin = driver.findElement(By.xpath("//div[text()='Log In/Sign Up']"));
		Signin.click();
		
		driver.switchTo().frame(0);
		//driver.switchTo().activeElement();
		WebElement UserName = driver.findElement(By.cssSelector("input[name='username']"));
		Thread.sleep(5000);
		UserName.sendKeys("8978094875");
		driver.findElement(By.xpath(".//*[@id='loginForm']/div/md-content/button[1]")).click();*/
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.querySelector('._3ac-').click()");
		Thread.sleep(10000);
		
		driver.close();
		
	}
	

}
