package pages;

import java.time.Duration;

import org.openqa.selenium.Dimension;

import action.iOS_Test_Report;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.testproject.sdk.drivers.ios.IOSDriver;

public class Diary extends iOS_Test_Report{
	
	public Diary(IOSDriver<MobileElement> lldriver)
	{
		this.kdriver = lldriver;
	}
	public void FirstEvent() throws InterruptedException
	{
		Thread.sleep(2000);
		click("//XCUIElementTypeCollectionView[3]/XCUIElementTypeCell[1]/XCUIElementTypeOther");
		Thread.sleep(2000);
	}
	public void SecondEvent() throws InterruptedException
	{
		Thread.sleep(2000);
		click("//XCUIElementTypeCollectionView[3]/XCUIElementTypeCell[2]/XCUIElementTypeOther");
		Thread.sleep(2000);
	}
	public void ThirdEvent() throws InterruptedException
	{
		Thread.sleep(2000);
		click("//XCUIElementTypeCollectionView[3]/XCUIElementTypeCell[3]/XCUIElementTypeOther");
		Thread.sleep(2000);
	}
	public void FourthEvent() throws InterruptedException
	{
		Thread.sleep(2000);
		click("//XCUIElementTypeCollectionView[3]/XCUIElementTypeCell[4]/XCUIElementTypeOther");
		Thread.sleep(2000);
	}
	public void Estimate_Accept() throws InterruptedException
	{
		Thread.sleep(2000);
		click("//XCUIElementTypeButton[@name='Accept']");
		Thread.sleep(2000);
	}
	public void Estimate_Travel() throws InterruptedException
	{
		Thread.sleep(2000);
		click("//XCUIElementTypeButton[@name='Travel']");
		Thread.sleep(2000);
	}
	public void Estimate_Arrive() throws InterruptedException
	{
		Thread.sleep(2000);
		click("//XCUIElementTypeButton[@name='Arrive']");
		Thread.sleep(4000);
	}
	public void Fill_in_Estimate_Choose() throws InterruptedException
	{
		Thread.sleep(2000);
		click("//XCUIElementTypeButton[@name='QA or Fill in estimate']");
		Thread.sleep(2000);
	}
	public void Fill_in_Estimate() throws InterruptedException
	{
		Thread.sleep(2000);
		click("//XCUIElementTypeButton[@name='Fill in estimate']");
		Thread.sleep(4000);
	}
	public void Free_Of_Charge() throws InterruptedException
	{
		Thread.sleep(2000);
		click("//XCUIElementTypeButton[@name='Free of charge job']");
		Thread.sleep(4000);
	}
	public void Price() throws InterruptedException
	{
		click("//XCUIElementTypeCell[3]/XCUIElementTypeOther/XCUIElementTypeOther");
		Thread.sleep(2000);
	}
	public void NoBreakdown() throws InterruptedException
	{
		click("//XCUIElementTypeStaticText[@name='No Breakdown']");
		Thread.sleep(4000);
	}
	public void NoBreakdown_Value() throws InterruptedException
	{
		type("//XCUIElementTypeOther[1]/XCUIElementTypeStaticText[2]", "100");
		Thread.sleep(2000);
	}
	public void Invoice_Schedule() throws InterruptedException
	{
		click("//XCUIElementTypeStaticText[@name='Invoice Schedule']");
		Thread.sleep(2000);
	}
	public void AcceptorReject() throws InterruptedException
	{
		click("//XCUIElementTypeStaticText[@name='Accept/Reject']");
		Thread.sleep(2000);
	}
	public void Option1() throws InterruptedException
	{
		click("//XCUIElementTypeStaticText[@name='Option 1']");
		Thread.sleep(2000);
	}
	public void Option1_Accept() throws InterruptedException
	{
		click("//XCUIElementTypeButton[@name='Accept']");
		Thread.sleep(2000);
	}
	public void Option2_Reject() throws InterruptedException
	{
		click("//XCUIElementTypeButton[@name='Reject']");
		Thread.sleep(2000);
	}
	public void Scrolldown() throws InterruptedException
	{
		scrollToIOSElement("//XCUIElementTypeStaticText[3]");
		Thread.sleep(2000);
	}
	public void Click_Sign() throws InterruptedException
	{
		click("//XCUIElementTypeStaticText[@name='Click here to sign']");
		Thread.sleep(2000);
	}
	public void Acceptbtn() throws InterruptedException
	{
		click("//XCUIElementTypeButton[@name='Accept']");
		Thread.sleep(5000);
	}
	public void Rejectbtn() throws InterruptedException
	{
		click("//XCUIElementTypeButton[@name='Reject']");
		Thread.sleep(5000);
	}
	public void LeaveSite() throws InterruptedException
	{
		click("//XCUIElementTypeButton[@name='Leave site']");
		Thread.sleep(2000);
	}
	public void YesorNo(String name) throws InterruptedException
	{
		click("//XCUIElementTypeButton[@name='"+name+"']");
		Thread.sleep(2000);
	}
	public void Next() throws InterruptedException
	{
		Thread.sleep(4000);
		click("//XCUIElementTypeButton[@name='Next']");
		Thread.sleep(2000);
	}
	public void StartTime() throws InterruptedException
	{
		Thread.sleep(3000);
		click("//XCUIElementTypeOther[3]/XCUIElementTypeButton/XCUIElementTypeStaticText");//click on start time
		Thread.sleep(2000);
	}
	public void JobStartTime() throws InterruptedException
	{
		Thread.sleep(3000);
		click("//XCUIElementTypeOther[4]/XCUIElementTypeButton/XCUIElementTypeStaticText");//click on start time
		Thread.sleep(2000);
	}
	public void StartTimeSlot(String time) throws InterruptedException
	{
		type("//XCUIElementTypePickerWheel[1]", time);
		Thread.sleep(2000);
	}
	public void RejectReason()
	{
		click("//XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther");//click on reason
	}
	public void JobDes(String time) throws InterruptedException
	{
		type("//XCUIElementTypePickerWheel", time);
		Thread.sleep(2000);
	}
	public void Booking() throws InterruptedException
	{
		click("//XCUIElementTypeOther[8]/XCUIElementTypeSwitch");
		Thread.sleep(2000);
	}
	public void Fill_in_Job_Report() throws InterruptedException
	{
		click("//XCUIElementTypeButton[@name='Fill in job report']");
		Thread.sleep(2000);
	}
	public void Raise_Final_Invoice() throws InterruptedException
	{
		click("//XCUIElementTypeButton[@name='Raise final invoice']");
		Thread.sleep(4000);
	}
	public void Copy_from_Job() throws InterruptedException
	{
		click("//XCUIElementTypeStaticText[@name='Copy from job']");
		Thread.sleep(4000);
	}
	public void Invoice_Category() throws InterruptedException
	{
		Thread.sleep(3000);
		click("//XCUIElementTypeOther[7]/XCUIElementTypeOther");
		Thread.sleep(4000);
	}
	public void NoBreakdown_Value(String name) throws InterruptedException
	{
		type("//XCUIElementTypeTextField", name);
		Thread.sleep(2000);
	}
	public void Save_Invoice() throws InterruptedException 
	{
		Thread.sleep(2000);
		click("//XCUIElementTypeButton[@name='Save invoice']");
		Thread.sleep(8000); 
	}
	public void Payment() throws InterruptedException 
	{
		Thread.sleep(2000);
		click("//XCUIElementTypeButton[@name='Add new payment']");
		Thread.sleep(8000); 
	}
	
	
	

}
