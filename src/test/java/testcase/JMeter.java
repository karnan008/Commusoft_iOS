package testcase;

import org.junit.Test;

import action.iOS_Test_Report;
import pages.Customer2;

public class JMeter extends iOS_Test_Report {
	
	@Test
	public void JMeter_Customer() throws InterruptedException 
	{ 
		Customer2 customer = new Customer2(kdriver);
		customer.Side_Menu(); 
		customer.Add_Customer();
		customer.CustomerType_Dropdown(); 
		customer.Customer_Type("Private Customer");
		customer.Title_dropdown(); 
		customer.Title(Title); 
		customer.Sur_Name(CustomerName);
		customer.Landline("8248724397"); 
		customer.Mobile("8248724397");
		customer.Email("karnan@commusoft.com"); 
		customer.Address("Chennai");
		customer.Save(); 
		customer.CusNum(); 
		customer.Menu_Button(); 
		customer.Daily();
	}

}
