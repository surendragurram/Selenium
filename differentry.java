package auto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentTry {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		    String baseUrl = "https://www.lieferando.de/";
		    driver.get(baseUrl);
		    driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		    driver.findElement(By.xpath(".//*[@id='submit_deliveryarea']")).click();
		    
		    if(driver.findElement(By.id(".//*[@id='ideliveryareaerror']")).getText().contains(" Die eingegebene Adresse/Postleitzahl ist ungültig. Bitte versuche es noch einmal."))
		    {
		    	System.out.println("Test Passed!");
		    }
		    else
		    
		    {
		    	System.out.println("Test Failed");
		    }
}
}
