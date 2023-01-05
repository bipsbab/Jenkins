package Amazon_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_homepage {
	public WebDriver driver; 
	@FindBy(id = "twotabsearchtextbox") WebElement search_button; 
	@FindBy(id = "nav-search-submit-button") WebElement entersearch_button; 
	
	public void search_click () {
		search_button.click();
	//	search_button.sendKeys("computer");
	}
		
	public void enter_click() {
		entersearch_button.click();
	}
	
	public Amazon_homepage(WebDriver driver) {
		this.driver=driver; 
		PageFactory.initElements(driver, this);
	}
		
	
}


	

