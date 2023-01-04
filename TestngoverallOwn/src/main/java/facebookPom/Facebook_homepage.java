package facebookPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_homepage {
WebDriver driver; 

@FindBy(name = "email") WebElement email_button; 
@FindBy(name = "pass") WebElement pass_button; 
@FindBy(name = "login") WebElement login_button;


public void provideEmail() {
	email_button.sendKeys("");
}

public void providePass() {
	pass_button.sendKeys(null);
}

public void login_click() {
	login_button.click();
}



public Facebook_homepage (WebDriver driver) {
	this.driver=driver; 
	PageFactory.initElements(driver, this);
	
}


}
