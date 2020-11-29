package sampleproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\selenium course\\exe2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		driver.quit();

	}

}
