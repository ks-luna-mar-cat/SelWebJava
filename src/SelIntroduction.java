import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction{

	public static void main(String args[]) {
		//Invoking Browser
		//System.setProperty("webdriver.chrome.driver", "/Users/Kate/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com");
        //Print page title in console, URL
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}
