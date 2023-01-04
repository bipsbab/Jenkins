package Amazon_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Todaysdeal_page {
	public WebDriver driver; 
	@FindBy(linkText = "Coupons") WebElement coupon_button; 
	
	public void coupon_click() {
		coupon_button.click();
		
	}

	public Todaysdeal_page(WebDriver driver) {
		this.driver=driver; 
		PageFactory.initElements(driver, this);
	}
}
