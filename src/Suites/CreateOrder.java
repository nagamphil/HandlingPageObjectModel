package Suites;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.Order;

public class CreateOrder {
	static WebDriver driver;
	LoginPage login;
	HomePage home;
	Order or;
	@Before
	public void preSteps()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\workspace\\naga\\selenium\\chromedriver_105.exe");
		driver = new ChromeDriver();
		 login = new LoginPage(driver);
		 home = new HomePage(driver);
		 or = new Order(driver);
		 driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");
			
	}
@Test
public void verifyOrder()
{
	login.EnterUsername("Tester");
	login.EnterPwd("test");
	login.loginbtn();
	home.verifylogin();
	home.clickorder();
	or.enterCustname("naga");
	or.enterSt("anna st");
	or.enterCity("chennai");
	or.enterState("tamil nadu");
	or.enterZip("23456");
}
}
