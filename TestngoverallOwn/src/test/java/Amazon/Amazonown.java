package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Amazon_pom.Amazon_homepage;
import Amazon_pom.Computer_result_page;
import Amazon_pom.Sell_page;
import Amazon_pom.Todaysdeal_page;
import common.Utilities;

public class Amazonown extends Utilities {
	
  @Test
  public void f() {
	  Amazon_homepage ob= new Amazon_homepage(driver); 
	  ob.search_click();
	  ob.enter_click();
	  
	 String ninethousandtext=  driver.findElement(By.xpath("//*[contains(text(),'1-16 of over 9,000 results for')]")).getText(); 
	 System.out.println(ninethousandtext);
	 SoftAssert asrt= new SoftAssert(); 
	 asrt.assertEquals(ninethousandtext, "1-16 of over 9,000 results for"); 
	 asrt.assertAll(); 
	 
	 Computer_result_page ob1= new Computer_result_page(driver); 
	 ob1.sell_click(); 
	 
	String sellonamazon= driver.findElement(By.xpath("//h1[@class='heading align-start font-size-medium color-squid-ink ember font-heavy']")).getText(); 
	 System.out.println(sellonamazon);
	 asrt.assertEquals(sellonamazon, "Sell on Amazon1"); 
	 asrt.assertAll(); 
	 
	 Sell_page ob2= new Sell_page(driver); 
	 ob2.todaysdeal_click(); 
	 
	 Todaysdeal_page ob3 = new Todaysdeal_page(driver); 
	 ob3.coupon_click(); 
	 
	 
  }
}
