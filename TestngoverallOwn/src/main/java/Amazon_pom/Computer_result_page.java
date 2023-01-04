package Amazon_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Computer_result_page {
	public WebDriver driver; 
	@FindBy(linkText = "Sell") WebElement sell_button; 
	
	public void sell_click() {
		sell_button.click();
		
	}

	public Computer_result_page(WebDriver driver) {
		this.driver=driver; 
		PageFactory.initElements(driver, this);
		
	}
	
}