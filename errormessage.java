package auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MessageError {
	public static void main(string[] args) {
		// todo auto-generated method stub
		system.setproperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		  WebDriver driver = new WebDriver();
		    string baseurl = "https://www.lieferando.de/";
		    driver.get(baseurl);
		    driver.findelement(by.xpath(".//*[@id='submit_deliveryarea']")).click();
		boolean ispresent = driver.findelements(
			    by.xpath(".//*[@id='ideliveryareaerror']")).size()!= 0;
			   
			    if (ispresent){
		            system.out.println("test passed!");
		        } else {
		            system.out.println("test failed");
		        }  
	}

}
