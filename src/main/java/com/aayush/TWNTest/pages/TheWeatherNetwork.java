package com.aayush.TWNTest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TheWeatherNetwork {
	
	@FindBy(how=How.XPATH, using="//*[@class=\"current-location-current-temp-c\"]")
	public WebElement temp;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"news\"]/div[2]/p/a")
	public WebElement btnSeeNews;
	
	@FindBy(how=How.XPATH, using="//*[@*=\"news|Latest\"]")
	public WebElement btnLatest;
	
	@FindBy(how=How.CLASS_NAME, using="logo")
	public WebElement logo;
	
	@FindBy(how=How.XPATH, using="//*[@*=\"news|World\"]")
	public WebElement btnWorld;
	
	@FindBy(how=How.XPATH, using="//*[@class=\"active\"]/node()")
	public WebElement activeNode;
}