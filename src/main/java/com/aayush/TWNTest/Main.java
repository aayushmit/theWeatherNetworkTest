package com.aayush.TWNTest;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException, InterruptedException {
		TheWeatherNetworkTest weather = new TheWeatherNetworkTest();
		try {
			weather.setUp();
			weather.checktemp();
			weather.clickSeeNews();
			weather.checkLatest();
			weather.clickWorld();
			weather.checkWorld();;
			weather.teardown();
			
		} catch (Exception e) {
			System.out.println("\n!!! ---------- SCRIPT FAILED ---------- !!!");
			weather.teardown();
		}
	}
}