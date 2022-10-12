package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
static WebDriver driver;
HomePage home;
By logout =By.xpath("//*[@id='ctl00_logout']");
By order = By.xpath("//*[@id='ctl00_menu']/li[3]/a");
public void verifylogin()
{
	if (driver.findElement(logout).isDisplayed())
	{
		System.out.println("login is successful");
	}
}
public void clickorder()
{
	driver.findElement(order).click();
}
public HomePage(WebDriver dr) {
	driver = dr;
}
//*[@id='ctl00_logout']
//*[@id='ctl00_menu']/li[3]/a

}
