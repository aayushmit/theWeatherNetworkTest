package com.aayush.TWNTest;

import com.aayush.TWNTest.pages.TheWeatherNetwork;
import java.io.IOException;
import org.openqa.selenium.support.PageFactory;

public class TheWeatherNetworkTest extends Utility

{
	int tmp;
	public void setUp() {
		connectionBrowser("https://www.theweathernetwork.com/ca");
		System.out.println("\nOpening The Weather Network");
		TheWeatherNetwork weather = PageFactory.initElements(driver, TheWeatherNetwork.class);
		//wait.until(ExpectedConditions.visibilityOf(weather.logo));
		String temp = weather.temp.getText();
		tmp = Integer.parseInt(temp.substring(0, 2));
	}

	
	public void checktemp() throws InterruptedException, IOException {
		System.out.println("Checking Current Temprature");
		if(tmp >= 15) {
			System.out.println("Test Failed. The temperature is less than 15 degrees Celcius");
		}
		else
			System.out.println("Test passed. The temperature is more than 15 degrees Celcius");
	}
	
	
	public void clickSeeNews() throws InterruptedException {
		System.out.println("Clicking on \"See All News\" button");
		TheWeatherNetwork weather = PageFactory.initElements(driver, TheWeatherNetwork.class);
		weather.btnSeeNews.click();
		waitPageLoad();
		System.out.println("Successfully clicked on \"See All News\" button");
	}
	
	
	public void checkLatest() throws InterruptedException {
		System.out.println("Checking for highlight on the \"Latest\" button");
		TheWeatherNetwork weather = PageFactory.initElements(driver, TheWeatherNetwork.class);
		String selectedNode = weather.activeNode.getText();
		if(selectedNode.equals("Latest"))
			System.out.println("Test passed. The button \"Latest\" is underlined");
		else
			System.out.println("Test failed. The button \"Latest\" is not underlined");
	}
	
	public void clickWorld() throws InterruptedException {
		System.out.println("Clicking on \"World\" button");
		TheWeatherNetwork weather = PageFactory.initElements(driver, TheWeatherNetwork.class);
		weather.btnWorld.click();
		waitPageLoad();
		System.out.println("Successfully clicked on \"World\" button");
	}

	public void checkWorld() throws InterruptedException {
		System.out.println("Clicking on button \"World\" and checking if its underlined");
		TheWeatherNetwork weather = PageFactory.initElements(driver, TheWeatherNetwork.class);
		
		weather.btnWorld.click();
		Thread.sleep(2000);
		String selectedNode = weather.activeNode.getText();
		if(selectedNode.equals("World"))
			System.out.println("Test passed. The button \"World\" is underlined");
		else
			System.out.println("Test Failed. The button \"World\" is not underlined");
	}
}
