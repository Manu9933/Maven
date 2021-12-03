package Amazon123.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class LoginTest {
	
	WebDriver Driver;
	

	
	public LoginTest(WebDriver driver) {
		this.Driver=driver;
	}
		
	

	By login=By.className("nav-action-inner");

	public WebElement login() {
		
		return Driver.findElement(login);
	}
public WebElement login1() {
		
		return Driver.findElement(login);
	}
	
	
	
	

}
