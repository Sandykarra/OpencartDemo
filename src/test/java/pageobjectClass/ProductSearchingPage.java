package pageobjectClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductSearchingPage {
	 public WebDriver driver;
		
		public ProductSearchingPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath="//input[@name='search']") //search box
		WebElement txtserchbox;
		@FindBy(xpath="//i[@class='fa fa-search']") // click the search button
		WebElement btnsearch;
		@FindBy(xpath="//a[normalize-space()='iMac']") //selected item
		WebElement selitem;
		@FindBy(xpath="//h1[normalize-space()='iMac']") //name of the product
		WebElement ItemName;
		@FindBy(id="input-quantity") //quantity
		WebElement selquant;
		@FindBy(id="button-cart") //clicked add to cart
		WebElement seladdcart;
		@FindBy(xpath="//span[normalize-space()='Shopping Cart']") //shopping cart
		WebElement ckshopcart;
		@FindBy(xpath="//body[1]/div[2]/div[2]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]")
		WebElement selcartitem; //in the cart item name
		
		@FindBy(xpath="//a[@class='btn btn-primary']")
		WebElement selcheckout;
		@FindBy(xpath ="//div[@class='alert alert-danger alert-dismissible']")
		WebElement alert;
		
		//Action methods
		public void SearchBox(String search)
		{
			txtserchbox.sendKeys(search);
		}
		
		public void selClick()
		{
			btnsearch.click();
		}
		 public void Sel_iMac()
		 
		{
			 selitem.click();
		}
		 
public String Sel_ItemName()

{ 
	
	return ItemName.getText();
	
}
public void Sel_quantity(String qty)
{
	selquant.clear();
	selquant.sendKeys(qty);
}

public void Add_cart()
{
	seladdcart.click();
}
public void Sel_shoppingcart()
{
	ckshopcart.click();
}

public String Sel_CartItem()
{
 return selcartitem.getText();
	
}
public void Sel_Checkout() {
	 selcheckout.click();
}
public String Alert_mess() {
	
	 return alert.getText();
	
}














}
