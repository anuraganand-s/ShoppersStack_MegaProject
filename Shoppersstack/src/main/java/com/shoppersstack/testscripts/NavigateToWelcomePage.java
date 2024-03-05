package com.shoppersstack.testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigateToWelcomePage {//abc
	WebDriver driver;

	@Test(priority = 1)
	public void openBrowser() {
		driver = WebDriverManager.firefoxdriver().create();
		driver.manage().window().maximize();
	}

	@Test(priority = 2)
	public void navigateToUrl() {
		driver.navigate().to("https://www.shoppersstack.com/");
	}

	@Test(priority = 3)
	public void verifyPageTitle() {
		String expectedtitle = "ShoppersStack";//tftrf
		String actualTitle = driver.getTitle();
		if (actualTitle.equals(expectedtitle)) {
			Reporter.log(actualTitle);

		}

	}

}
