package Amazon_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sell_page {

	public WebDriver driver; 

	@FindBy(linkText = "Today's Deals")WebElement Todaysdeal_button; 
	
	public void todaysdeal_click() {
		Todaysdeal_button.click();
		
	}

	public Sell_page(WebDriver driver) {
		this.driver=driver; 
		PageFactory.initElements(driver, this);
	}
}
