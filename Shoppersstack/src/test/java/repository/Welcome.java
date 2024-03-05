package repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class Welcome {
	@FindBy(xpath="//*[@id=\"loginBtn\"]")
	WebElement Login;
	
	@FindAll({@FindBy(xpath="(//*[@id=\"addToCart\"])[1]"),@FindBy(xpath="//*[@id='addToCart']")})
	WebElement AddToCart;

}
