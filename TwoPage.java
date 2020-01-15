import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwoPage 
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
		   System.out.println("login name"+objprop.getProperty("login1"));
		   System.out.println("password"+objprop.getProperty("pwd1"));
		   System.setProperty("webdriver.chrome.driver", 
				   "C://Users//admin//Downloads//chromedriver_win32//chromedriver.exe");
		   WebDriver ObjDriver = new ChromeDriver();
		   ObjDriver.get("http://demo.opencart.com");
		   //System.out.println("open cart page loaded");
	       //String var1 = ObjDriver.getTitle();
	       //System.out.println("Title of the page :" +var1);
	       WebElement Obj1 = ObjDriver.findElement(By.xpath("//a[@href='https://demo.opencart.com/index.php?route=account/account']"));
	       Obj1.click();
	       WebElement Obj2 = ObjDriver.findElement(By.xpath("//*[@id=\'top-links\']/ul/li[2]/ul/li[2]/a"));
	       Obj2.click();
	       WebElement Obj3 = ObjDriver.findElement(By.xpath("//*[@id=\'input-email\']"));
	       Obj3.sendKeys(objprop.getProperty("login1"));
	       WebElement Obj4 = ObjDriver.findElement(By.xpath("//*[@id=\'input-password\']"));
	       Obj4.sendKeys(objprop.getProperty("pwd1"));
	       ObjDriver.manage().window().maximize();
		   ObjDriver.findElement(By.xpath("//*[@id='content']/div/div[2]/div/form/div[2]/a")).click();
		   WebElement Obj6 = ObjDriver.findElement(By.xpath("//*[@id='content']/form/div/div[2]/input"));
		   Obj6.click();
		   WebElement Obj5 = ObjDriver.findElement(By.xpath("//*[@id='account-forgotten']/div[1]"));
		   if(Obj5.isDisplayed()) {
			   System.out.println(Obj5.getText());
		   }
	}

}

