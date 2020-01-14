
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {
		Properties objprop = new Properties();
		try {
		objprop.load(new FileInputStream("C://Users//admin//Desktop//data1.properties"));
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("Email"+objprop.getProperty("login"));
		System.out.println("password"+objprop.getProperty("pwd"));
		System.setProperty("webdriver.chrome.driver","C://Users//admin//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver ObjDriver = new ChromeDriver();
		ObjDriver.get("http://demo.automationtesting.in/Register.html");
		System.out.println("demo register loaded");
		String var1=ObjDriver.getTitle();
		System.out.println("Title of the page"+var1);
		/*WebElement Obj1=ObjDriver.findElement(By.xpath("//a[@href='https://demo.opencart.com/index.php?route=account/account']"));
		Obj1.click();
		WebElement Obj2=ObjDriver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/ul/li[2]/a"));
		Obj2.click();*/
		WebElement Obj3=ObjDriver.findElement(By.xpath("//*[@id=\'eid\']/input"));
				Obj3.sendKeys(objprop.getProperty("login"));
		WebElement Obj4=ObjDriver.findElement(By.xpath("//*[@id=\'firstpassword\']"));
		      Obj4.sendKeys(objprop.getProperty("pwd"));
		      //String var2=ObjDriver.getTitle();
		     // System.out.println("Title of the page"+var2);

			}

		


	}

