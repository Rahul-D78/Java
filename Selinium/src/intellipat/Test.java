package intellipat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test {

   public static void main(String []args) {
	   
	   System.setProperty("webdriver.chrome.driver", "//home/ubuntu/chromedriver.exe");
	   
	   ChromeOptions options = new ChromeOptions();
	   
	   options.addArguments("--headless");
	   WebDriver driver = new ChromeDriver();
	   
	   driver.get("http://100.26.254.218:82/");
	   
	   driver.findElement(By.xpath("/html/body")).isDisplayed();
   }
}
