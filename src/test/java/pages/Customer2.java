package pages;


import action.Wrapper2;
import io.appium.java_client.MobileElement;
import io.testproject.sdk.drivers.ios.IOSDriver;

public class Customer2 extends Wrapper2{
	
	

	public Customer2(IOSDriver<MobileElement> lldriver)
	{
		this.kdriver = lldriver;
	}
	public void Side_Menu() throws InterruptedException
	{
		Thread.sleep(2000);
		click("//XCUIElementTypeButton[1]");	
		Thread.sleep(2000);
	}
	public void Add_Customer()
	{

		click("//XCUIElementTypeStaticText[@name='Add Customer']");
	}
	public void CustomerType_Dropdown() throws InterruptedException 
	{
		Thread.sleep(2000);
		click("//XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther");
		Thread.sleep(2000);
	}
	public void Customer_Type(String type) throws InterruptedException
	{
		Thread.sleep(2000);
		type("//XCUIElementTypePickerWheel", type);
		click("//XCUIElementTypeStaticText[@name='Done']");
		Thread.sleep(2000);
	}
	public void Title_dropdown() throws InterruptedException
	{
		Thread.sleep(2000);
		click("//XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
		Thread.sleep(2000);
	}
	public void Title(String title) throws InterruptedException
	{
		Thread.sleep(2000);
		type("//XCUIElementTypePickerWheel",title);
		click("//XCUIElementTypeStaticText[@name='Done']");
		Thread.sleep(2000);
	}
	public void Sur_Name(String name) throws InterruptedException
	{
		Thread.sleep(2000);
		type("//XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeTextField",name);
		Thread.sleep(2000);
	}
	public void Landline(String num) throws InterruptedException
	{
		Thread.sleep(2000);
		type("//XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTextField",num);
		Thread.sleep(2000);
	}
	public void Mobile(String num) throws InterruptedException
	{
		Thread.sleep(2000);
		type("//XCUIElementTypeOther[5]/XCUIElementTypeTextField",num);
		Thread.sleep(2000);
	}
	public void Email(String email) throws InterruptedException
	{
		Thread.sleep(2000);
		type("//XCUIElementTypeOther[1]/XCUIElementTypeOther[6]/XCUIElementTypeTextField",email);
		Thread.sleep(2000);
	}
	public void Address(String address) throws InterruptedException
	{
		Thread.sleep(2000);
		type("//XCUIElementTypeOther[1]/XCUIElementTypeTextField",address);
		Thread.sleep(2000);
	}
	public void Save() throws InterruptedException 
	{
		Thread.sleep(2000);
		click("//XCUIElementTypeButton[@name='Save']");
		Thread.sleep(8000); 
	}
	public void CusNum() throws InterruptedException 
	{
		Thread.sleep(4000);
		CustomerNumber = gettext("//XCUIElementTypeOther[5]/XCUIElementTypeStaticText[2]");
		Thread.sleep(2000); 
		System.out.println(CustomerNumber);
	}
	public void Menu_Button() throws InterruptedException 
	{
		Thread.sleep(2000);
		click("//XCUIElementTypeNavigationBar/XCUIElementTypeButton");
		Thread.sleep(2000); 
	}
	public void Daily() throws InterruptedException 
	{
		Thread.sleep(2000);
		click("//XCUIElementTypeStaticText[@name='Daily']");
		Thread.sleep(2000); 
	}
	public void Search() throws InterruptedException 
	{
		click("//XCUIElementTypeStaticText[@name='Search']");
		Thread.sleep(3000);
		click("//XCUIElementTypeSearchField[@name='Search']");
		Thread.sleep(2000);
	}
	public void SearchText(String CusNum) throws InterruptedException 
	{
		type("//XCUIElementTypeSearchField", CusNum);
	}
	
	public void SearchText() throws InterruptedException 
	{
		type("//XCUIElementTypeSearchField",CustomerName);
	}
	
	public void ClickSearch() throws InterruptedException 
	{
		typeenter("//XCUIElementTypeSearchField");
		Thread.sleep(8000);
	}
	public void ClickSearchResult() throws InterruptedException 
	{
		Thread.sleep(3000);
		click("//XCUIElementTypeStaticText[@name='Chennai']");
		Thread.sleep(4000);
	}
	public void EditScreen() throws InterruptedException 
	{
		click("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]");
		Thread.sleep(2000);
	}
	public void AddressLine2() throws InterruptedException 
	{
		type("//XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField", "edited customer");
		Thread.sleep(2000);
	}
	public void Contact() throws InterruptedException 
	{
		Thread.sleep(2000);
		click("//XCUIElementTypeStaticText[@name='users']");
	}
	public void AddContact() throws InterruptedException 
	{
		Thread.sleep(2000);
		click("//XCUIElementTypeButton[@name='Add']");
		Thread.sleep(2000);
		click("//XCUIElementTypeButton[@name='Add contact']");
	}
	public void ContactNum(String num) throws InterruptedException 
	{
		Thread.sleep(2000);
		type("//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTextField",num);
	}
	public void ContactEmail(String email) throws InterruptedException 
	{
		Thread.sleep(2000);
		type("//XCUIElementTypeOther[3]/XCUIElementTypeOther[3]/XCUIElementTypeTextField",email);
	}
	public void Back() throws InterruptedException 
	{
		Thread.sleep(2000);
		click("//XCUIElementTypeButton[@name='Back']");
	}
	public void Search_ClickCustomer() throws InterruptedException
	{
		SearchText();
		ClickSearch();
		ClickSearchResult();
	}
	public void Notes() throws InterruptedException 
	{
		Thread.sleep(2000);
		click("//XCUIElementTypeStaticText[@name='notebook']");
		Thread.sleep(5000);
	}
	public void AddNotebtn() throws InterruptedException 
	{
		Thread.sleep(2000);
		click("//XCUIElementTypeButton[@name='Add']");
		Thread.sleep(2000);
		click("//XCUIElementTypeButton[@name='Add new note']");
	}
	public void NotesTitle(String name) throws InterruptedException
	{
		Thread.sleep(2000);
		type("//XCUIElementTypeTextField", name);
	}
	public void NotesBody(String name) throws InterruptedException
	{
		Thread.sleep(2000);
		type("//XCUIElementTypeTextView", name);
	}
	public void AddNotebtn0() throws InterruptedException 
	{
		Thread.sleep(2000);
		click("//XCUIElementTypeButton[@name='Add']");
		Thread.sleep(3000);
	
	}
	public void NotesEmail() throws InterruptedException 
	{
		Thread.sleep(2000);
		click("//XCUIElementTypeButton[@name='Send new email']");
		Thread.sleep(3000);
	}
	public void Emailsearch() throws InterruptedException 
	{
		Thread.sleep(2000);
		click("//XCUIElementTypeScrollView/XCUIElementTypeButton[1]/XCUIElementTypeStaticText");
		Thread.sleep(1000);
	}
	public void Emailselect() throws InterruptedException 
	{
		Thread.sleep(2000);
		click("//XCUIElementTypeStaticText[2]");
		Thread.sleep(1000);
	}
	public void EmailDone() throws InterruptedException 
	{
		Thread.sleep(2000);
		click("//XCUIElementTypeButton[@name='Done']");
		Thread.sleep(2000); 
	}
	public void EmailSubject() throws InterruptedException 
	{
		Thread.sleep(2000);
		type("//XCUIElementTypeOther[6]/XCUIElementTypeTextField","Email Subject");
		Thread.sleep(1000);
	}
	public void EmailSend() throws InterruptedException 
	{
		Thread.sleep(2000);
		click("//XCUIElementTypeButton[@name='Send']");
		Thread.sleep(8000); 
	}
	public void NoteSms() throws InterruptedException 
	{
		Thread.sleep(2000);
		click("//XCUIElementTypeButton[@name='Send new sms']");
		Thread.sleep(3000);
	}
	public void Notesms_Contactdropdown() throws InterruptedException
	{
		Thread.sleep(2000);
		click("//XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther");
		Thread.sleep(2000);
	}
	public void SMSDone() throws InterruptedException 
	{
		Thread.sleep(2000);
		click("//XCUIElementTypeButton[@name='Done']");
		Thread.sleep(2000); 
	}
	public void Note_SMS_Number() throws InterruptedException
	{
		Thread.sleep(2000);
		click("//XCUIElementTypeOther[2]/XCUIElementTypeOther");
		Thread.sleep(2000);
	}
	public void SMS_Message() throws InterruptedException
	{
		Thread.sleep(2000);
		type("//XCUIElementTypeTextView","SMS Message");
		Thread.sleep(2000);
	}
	public void PhoneCall() throws InterruptedException
	{
		Thread.sleep(2000);
		click("//XCUIElementTypeButton[@name='Add phone call']");
		Thread.sleep(3000);
	}
	public void CallType() throws InterruptedException
	{
		Thread.sleep(2000);
		click("//XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther");
		Thread.sleep(3000);
	}
	public void Phone_Contactname() throws InterruptedException
	{
		Thread.sleep(2000);
		click("//XCUIElementTypeOther[2]/XCUIElementTypeOther");
		Thread.sleep(3000);
	}
	public void Phone_Callwith() throws InterruptedException
	{
		Thread.sleep(2000);
		click("//XCUIElementTypeOther[3]/XCUIElementTypeOther");
		Thread.sleep(3000);
	}
	public void Phone_Notes() throws InterruptedException
	{
		click("//XCUIElementTypeTextView[@value='Tap to enter']");
		Thread.sleep(2000);
		type("//XCUIElementTypeTextView","Phone Notes");
		Thread.sleep(3000);
	}
	public void Assets() throws InterruptedException 
	{
		Thread.sleep(2000);
		click("//XCUIElementTypeStaticText[@name='warehouse']");
		Thread.sleep(1000);
	}
	public void Asset_group() throws InterruptedException 
	{
		Thread.sleep(2000);
		click("//XCUIElementTypeStaticText[@name='System boiler']");
		Thread.sleep(1000);
	}
	public void fuel() throws InterruptedException 
	{
		Thread.sleep(2000);
		click("//XCUIElementTypeOther[2]/XCUIElementTypeOther");
		Thread.sleep(1000);
	}
	public void Fueltype() throws InterruptedException 
	{
		Thread.sleep(2000);
		click("//XCUIElementTypeStaticText[@name='Gas']");
		Thread.sleep(1000);
	}
	public void Make() throws InterruptedException 
	{
		Thread.sleep(2000);
		click("//XCUIElementTypeOther[3]/XCUIElementTypeOther");
		Thread.sleep(1000);
	}
	public void AddItem() throws InterruptedException 
	{
		Thread.sleep(2000);
		click("//XCUIElementTypeOther[3]/XCUIElementTypeButton[2]/XCUIElementTypeStaticText");
		Thread.sleep(1000);
	}
	public void AssetsListclick() throws InterruptedException 
	{
		click("//XCUIElementTypeStaticText[@name='System boiler']");
		Thread.sleep(4000);
	}
	public void More() throws InterruptedException 
	{
		Thread.sleep(2000);
		click("//XCUIElementTypeStaticText[@name='rows']");
		Thread.sleep(4000);
	}
	public void MoreOption() throws InterruptedException 
	{
		Thread.sleep(2000);
		click("//XCUIElementTypeButton[5]");
		Thread.sleep(4000);
	}
	public void Reminder() throws InterruptedException 
	{
		Thread.sleep(2000);
		dclick("//XCUIElementTypeCollectionView[1]/XCUIElementTypeCell[4]/XCUIElementTypeOther");
		Thread.sleep(4000);
	}
	public void ServiceReminder() throws InterruptedException 
	{
		click("//XCUIElementTypeStaticText[@name='Service reminders']");
		Thread.sleep(4000);
	}
	public void ServiceType() throws InterruptedException 
	{
		click("//XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther");
		Thread.sleep(4000);
	}
	public void ServiceType_dropdown() throws InterruptedException 
	{
		type("//XCUIElementTypePickerWheel","Boiler service");
		Thread.sleep(4000);
	}
	public void DueDate() throws InterruptedException 
	{
		click("//XCUIElementTypeOther[2]/XCUIElementTypeOther");
		Thread.sleep(4000);
	}
	public void SendTo() throws InterruptedException 
	{
		click("//XCUIElementTypeOther[3]/XCUIElementTypeOther");
		Thread.sleep(4000);
	}
	public void Reminder_Back() throws InterruptedException
	{
		Thread.sleep(2000);
		click("//XCUIElementTypeButton[@name='Reminders']");
		Thread.sleep(3000);
	}
	public void Reminder1() throws InterruptedException
	{
		Thread.sleep(2000);
		click("(//XCUIElementTypeStaticText[@name='Reminders'])[2]");
		Thread.sleep(3000);
	}
	public void ReminderDate() throws InterruptedException
	{
		Thread.sleep(2000);
		click("//XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther");
		Thread.sleep(3000);
	}
	public void ReminderNote() throws InterruptedException
	{
		Thread.sleep(2000);
		type("//XCUIElementTypeTextView","notes");
		Thread.sleep(3000);
	}
	public void User() throws InterruptedException
	{
		Thread.sleep(2000);
		click("//XCUIElementTypeOther[3]/XCUIElementTypeButton");
		Thread.sleep(3000);
	}
	public void UserSelect() throws InterruptedException
	{
		Thread.sleep(2000);
		click("//XCUIElementTypeCell[1]/XCUIElementTypeStaticText");
		Thread.sleep(3000);
	}
	public void Done() throws InterruptedException 
	{
		Thread.sleep(2000);
		click("//XCUIElementTypeButton[@name='Done']");
		Thread.sleep(8000); 
	}
	public void Ongoing() throws InterruptedException 
	{
		Thread.sleep(2000);
		dclick("//XCUIElementTypeCollectionView[1]/XCUIElementTypeCell[6]");
		Thread.sleep(8000); 
	}
	public void Add_Estimate() throws InterruptedException 
	{
		Thread.sleep(5000);
		click("//XCUIElementTypeButton[@name='Add new estimate']");
		Thread.sleep(8000); 
	}
	public void Add_Job() throws InterruptedException 
	{
		Thread.sleep(5000);
		click("//XCUIElementTypeButton[@name='Add new job']");
		Thread.sleep(8000); 
	}
	public void Estimate_Des() throws InterruptedException 
	{
		Thread.sleep(5000);
		click("//XCUIElementTypeOther[2]/XCUIElementTypeOther");
		Thread.sleep(8000); 
	}
	public void Job_Des() throws InterruptedException 
	{
		Thread.sleep(5000);
		click("//XCUIElementTypeOther[2]/XCUIElementTypeOther");
		Thread.sleep(8000); 
	}
	public void Ongoing_Diary() throws InterruptedException 
	{
		Thread.sleep(5000);
		click("//XCUIElementTypeSwitch");
		Thread.sleep(8000); 
	}
	public void Diary_Today() throws InterruptedException 
	{
		Thread.sleep(5000);
		click("//XCUIElementTypeButton[3]");
		Thread.sleep(8000); 
	}
	public void Diary_Plus() throws InterruptedException 
	{
		Thread.sleep(5000);
		click("//XCUIElementTypeButton[4]");
		Thread.sleep(8000); 
	}
	
	
	public void swipeIOS() {
		
	}
	
	
	
	
	
	
	
	


}
