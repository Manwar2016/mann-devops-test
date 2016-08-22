package SeleniumTestDemo.selenium.devops;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.server.SeleniumServer;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 

{   
	static WebDriver driver;
	@BeforeTest
	public void seleniumStart() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver = new ChromeDriver();

	}
	@Test
	public void testTitle()
	{   
		driver.get("https://www.google.co.in");
		String webPageTitle="Google";
		if(driver.getTitle().equals(webPageTitle))
			System.out.println("test Passed, Title is correct");
		else
			System.out.println("Test Failed");
	}

	public void closeServer()
	{
		driver.close();
	}
}
