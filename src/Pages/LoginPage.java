package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	static WebDriver driver;
By uname = By.xpath("//*[@id='ctl00_MainContent_username']");
By pwd = By.xpath("//*[@id='ctl00_MainContent_password']");
By login = By.xpath("//*[@id='ctl00_MainContent_login_button']");

public void EnterUsername(String Usernamedata)
{
	driver.findElement(uname).sendKeys(Usernamedata);
	//driver.findElement(uname).sendKeys("Tester");
}
public void EnterPwd(String pwddata)
{
	driver.findElement(pwd).sendKeys(pwddata);
	
}
public void loginbtn() {
	driver.findElement(login).click();
}
public LoginPage(WebDriver dr) {
	driver = dr;
	
}
}
