package Firstpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirstClass {
	
	@Test
	public void testJenkins(){
		System.out.println("welcome to jenkins world123456");
		
		System.setProperty("webdriver.gecko.driver","C:\\BrowserDrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
