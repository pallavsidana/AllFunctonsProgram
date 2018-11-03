package maven.com.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import maven.com.pages.HomePage;
//@Listeners(maven.com.utility.Listner.class)
public class MainTest {
	WebDriver driver=null;
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\jars\\browsers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void Test() {
		HomePage hp = new HomePage(driver);
		hp.selectFunction();
		hp.OpenWindow();
	}
	@AfterTest
	public void closeBroser()
	{
		driver.close();
		driver.quit();
	}
}