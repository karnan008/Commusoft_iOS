package pages;

import action.iOS_Test_Report;
import io.appium.java_client.MobileElement;
import io.testproject.sdk.drivers.ios.IOSDriver;

public class Job extends iOS_Test_Report{
	
	public Job(IOSDriver<MobileElement> lldriver)
	{
		this.kdriver = lldriver;
	}
	public void Job_Arrive_Answer() throws InterruptedException
	{
		Thread.sleep(2000);
		type("//XCUIElementTypeTextField", "Arrive answer from appium");
	}
	public void Job_Leave_Answer() throws InterruptedException
	{
		Thread.sleep(2000);
		type("//XCUIElementTypeTextField", "Leave answer from appium");
	}
	public void Certificate_Tab() throws InterruptedException
	{
		Thread.sleep(2000);
		click("//XCUIElementTypeCell[2]");//click certificates
		Thread.sleep(2000);
	}
	public void Certificate_Search() throws InterruptedException
	{
		Thread.sleep(2000);
		type("//XCUIElementTypeSearchField[@name='Search']", "Domestic Gas Safety");
		Thread.sleep(2000);
	}
	public void Select_Certificate() throws InterruptedException
	{
		Thread.sleep(2000);
		click("//XCUIElementTypeStaticText[@name='Domestic Gas Safety']");
	}
	public void Add_Asset_toCertificate() throws InterruptedException
	{
		Thread.sleep(2000);
		click("//XCUIElementTypeStaticText[@name='Add asset to certificate']");
	}
	public void Select_Asset() throws InterruptedException
	{
		Thread.sleep(2000);
		click("//XCUIElementTypeStaticText[@name='System boiler']");
	}
	public void Add_Defect() throws InterruptedException
	{
		Thread.sleep(2000);
		click("//XCUIElementTypeStaticText[@name='Add defects to certificate']");
	}
	public void Defect_Details()
	{
		type("//XCUIElementTypeOther[2]/XCUIElementTypeTextField", "Defect Details");
	}
	public void Remedial_Action()
	{
		type("//XCUIElementTypeOther[3]/XCUIElementTypeTextField", "Remedial Action");
	}
	public void Toggle() throws InterruptedException
	{
		click("//XCUIElementTypeScrollView/XCUIElementTypeButton[1]");
		Thread.sleep(1000);
		click("//XCUIElementTypeScrollView/XCUIElementTypeButton[2]");
		Thread.sleep(1000);
		click("//XCUIElementTypeScrollView/XCUIElementTypeButton[3]");
		Thread.sleep(1000);
		click("//XCUIElementTypeButton[4]");
		Thread.sleep(1000);
		click("//XCUIElementTypeButton[5]");
	}
	public void Certificate_Comments()
	{
		type("//XCUIElementTypeTextView", "Comments added from appium");
	}
	public void Nominal()
	{
		click("//XCUIElementTypeOther[4]/XCUIElementTypeOther");//click nominal account
	}
	public void Payment_Method()
	{
		click("//XCUIElementTypeOther[5]/XCUIElementTypeOther");//click method
	}
	
	
	
	
}
