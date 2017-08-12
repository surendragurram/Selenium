package auto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Lieferando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.lieferando.de/");	
		  //driver.manage().window().maximize()a[id='reference']  ;
		  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
		  driver.findElement(By.xpath("//*[@id='imysearchstring']")).sendKeys("ferdinand porsche str 23 69181");
		  driver.findElement(By.cssSelector("a[id='reference']")).click();
		  driver.quit();
	}
}
