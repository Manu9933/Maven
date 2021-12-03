package Amazon123.Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataTest {
	
	@Test
	public  void Data()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Manisha\\drivers\\45\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://amazon.in");
	
	LoginTest login1=new LoginTest( driver);
	
	login1.login().click();
	login1.login().sendKeys("abc");

	}

}
