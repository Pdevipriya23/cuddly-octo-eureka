import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class OnePage 
{
	public static void main(String[] args)
	{
		Properties objprop = new Properties();
		   try
		   {
			   objprop.load(new FileInputStream("C://java//data3.properties"));
		   }
		   catch(FileNotFoundException e) {
			   e.printStackTrace();
		   } 
		   catch(IOException e) {
			   e.printStackTrace();
		   }
		   System.out.println("login name"+objprop.getProperty("login2"));
		   System.out.println("password"+objprop.getProperty("pwd2"));
		   System.setProperty("webdriver.chrome.driver", 
				   "C://Users//admin//Downloads//chromedriver_win32//chromedriver.exe");
		   WebDriver ObjDriver = new ChromeDriver();
		   ObjDriver.get("http://demo.automationtesting.in/SignIn.html");
		   WebElement Obj3 = ObjDriver.findElement(By.xpath("/html/body/div/div/div[2]/input"));
		   Obj3.sendKeys(objprop.getProperty("login2"));
		   WebElement Obj4 = ObjDriver.findElement(By.xpath("/html/body/div/div/div[3]/input"));
		   Obj4.sendKeys(objprop.getProperty("pwd2"));
		   WebElement Obj5 = ObjDriver.findElement(By.xpath("//*[@id=\"enterbtn\"]"));
		   Obj5.click();
		   WebElement Obj6 = ObjDriver.findElement(By.xpath("//*[@id=\"errormsg\"]"));
		   if(Obj6.isDisplayed())
		   {
			   System.out.println(Obj6.getText());
		   }
	}
}


