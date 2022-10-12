package Suites;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.HomePage;
import Pages.LoginPage;

public class VerifyLogin {
	static WebDriver driver;
	LoginPage login;
	HomePage home;
	@Before
	public void preSteps()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\workspace\\naga\\selenium\\chromedriver_105.exe");
		driver = new ChromeDriver();
		 login = new LoginPage(driver);
		 home = new HomePage(driver);
		 driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");
			
	}
@Test
public void verify()
{
	login.EnterUsername("Tester");
	login.EnterPwd("test");
	login.loginbtn();
	home.verifylogin();
}
}
