package intellipat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lunch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium\\chromedriver.exe");
		
		//we need create a object for the chromedriver
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		String title =  driver.getTitle(); //Actual title
		
//		Facebook – log in or sign 
		
		if(title.matches("Facebook – log in or sign up")) {
			System.out.println("valid page");
		
			driver.findElement(By.id("email")).sendKeys("hlw");
			driver.findElement(By.id("pass")).sendKeys("1234");
			
			driver.findElement(By.name("login")).click();
		}else {
			System.out.println("Invalid page");
			
			driver.close();
		}
	}

}
