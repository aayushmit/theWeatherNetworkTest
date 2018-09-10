package com.aayush.TWNTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class Utility {

	public WebDriver driver;
	public BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public WebDriverWait wait;

	public void connectionBrowser(String url) {
		ChromeDriverManager.getInstance().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-infobars");
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.get(url);
		System.setProperty("webdriver.chrome.driver", System.getProperty("webdriver.chrome.driver"));
		wait = new WebDriverWait(driver, 10);
	}

	public void waitPageLoad() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void teardown() {
		if (driver != null)
			driver.quit();
		System.out.println("\nEnd of script");
	}
}
