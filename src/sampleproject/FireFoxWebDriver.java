package sampleproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxWebDriver {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\selenium course\\EXE for firefox\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.quit();

	}

}
