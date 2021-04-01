package testCase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjectClass.ProductSearchingPage;
import testBase.BaseClass;

public class TC_004_ProductSearch extends BaseClass {
	
	@Test(groups= {"master"})
public void test_searchbox() throws IOException, InterruptedException {
		
logger.info(" Starting TC_004_Login ");

	try {
	

	driver.get(rb.getString("appURL"));
	logger.info("Home Page Displayed ");
	
	driver.manage().window().maximize();
	logger.info("Home Page maximize");
	
	ProductSearchingPage pp= new ProductSearchingPage(driver); 
	logger.info("Created the object");
	
	pp.SearchBox("imac");
	logger.info("Searched for the product imac ");
	
	pp.selClick();
	logger.info("clicked the seach");
	
	pp.Sel_iMac();
	logger.info("selected the imac");
	
	Thread.sleep(4000);
	
	String selectedItem=pp.Sel_ItemName();
	System.out.println("Before add to the cart: "+selectedItem);
logger.info("first selected product to add to cart");

	pp.Sel_quantity("1");
	logger.info("selected quantity");
	
	pp.Add_cart();
	logger.info("added the product to cart");
	
	Thread.sleep(3000);
	
	pp.Sel_shoppingcart();
	logger.info("selected the shopping cart");
	
	String added_itemINCart=pp.Sel_CartItem();
	 System.out.println("added item in the cart: "+ added_itemINCart);
	 logger.info("validata the product");
	 
	
	if(selectedItem.equals(added_itemINCart))
	{
		System.out.println("Test case passed!");
		logger.info("validate the name is match");
	}else 
	{
		System.out.println("Test Failed");
		logger.error("name is not matching");
	}
	
	
	pp.Sel_Checkout();
	 logger.info("clicked checkout");
	 
	String msg=pp.Alert_mess();
	System.out.println(msg);
	logger.info("product are not available....");
	}
	catch(Exception e)
	{
		logger.fatal("Login Failed ");
		captureScreen(driver, "test_searchbox"); //
		//Assert.fail();
	}
	
	logger.info(" Finished TC_004_Login ");
	

	
	
	}

}
