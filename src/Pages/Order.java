package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Order {//*[@id='ctl00_MainContent_fmwOrder_txtName']
static WebDriver driver;
By name = By.xpath("//*[@id='ctl00_MainContent_fmwOrder_txtName']");
By st = By.xpath("//*[@id='ctl00_MainContent_fmwOrder_TextBox2']");
By city = By.xpath("//*[@id='ctl00_MainContent_fmwOrder_TextBox3']");
By state =By.xpath("//*[@id='ctl00_MainContent_fmwOrder_TextBox4']");
By zip = By.xpath("//*[@id='ctl00_MainContent_fmwOrder_TextBox5']");
public void enterCustname(String custnamedata)
{
	driver.findElement(name).sendKeys(custnamedata);
	
}
public void enterSt(String streetdata)
{
	driver.findElement(st).sendKeys(streetdata);
	
}
public void enterCity(String citydata)
{
	driver.findElement(city).sendKeys(citydata);
}
public void enterState(String statedata) {
	driver.findElement(state).sendKeys(statedata);
}
public void enterZip(String zipdata)
{
	driver.findElement(zip).sendKeys(zipdata);
}
public Order(WebDriver dr)
{
	driver = dr;
}


//*[@id='ctl00_MainContent_fmwOrder_txtName']
//*[@id='cl00_MainContent_fmwOrder_TextBox2']
//*[@id="ctl00_MainContent_fmwOrder_TextBox3"]
//*[@id="ctl00_MainContent_fmwOrder_TextBox4"]
//*[@id="ctl00_MainContent_fmwOrder_TextBox5"]
}
