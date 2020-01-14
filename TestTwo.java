import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestTwo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Users//admin//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver ObjDriver = new ChromeDriver();
		ObjDriver.get("https://demo.opencart.com/index.php?route=product/category&path=57");
		WebElement Obj1=ObjDriver.findElement(By.xpath("//*[@id='input-sort']"));
		Obj1.click();
		 List<WebElement> myList=ObjDriver.findElements(By.xpath("//*[@id='input-limit=100']"));
}}
