
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebCount {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Users//admin//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver ObjDriver = new ChromeDriver();
		ObjDriver.get("http://demo.opencart.com");
		System.out.println("open cart page loaded");
		String var1=ObjDriver.getTitle();
		System.out.println("Title of the page"+var1);
		WebElement Obj1=ObjDriver.findElement(By.xpath("//html/body/footer/div/div/div[4]/ul/li[1]/a)"));
		Obj1.click();
		WebElement Obj2=ObjDriver.findElement(By.xpath("//a[@href='https://demo.opencart.com/index.php?route=account/account']"));
		Obj2.click();
		WebElement Obj3=ObjDriver.findElement(By.xpath("//*[@id=\'input-email\']"));
				Obj3.sendKeys("obama@trumo.com");
		WebElement Obj4=ObjDriver.findElement(By.xpath("//*[@id='input-password']"));
		      Obj4.sendKeys("america");
		      String var2=ObjDriver.getTitle();
		      System.out.println("Title of the page"+var2);

			}

		


	}

