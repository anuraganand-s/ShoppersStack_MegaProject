package com.shoppersstack.testscripts;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigateToWelcomePage {
	WebDriver driver;

	@BeforeClass
	public void navigateToWelcomePage() {
		driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.shoppersstack.com/");
		String expectedtitle = "ShoppersStack";
		String actualTitle = driver.getTitle();
		assertEquals(actualTitle, expectedtitle);
	}

}
