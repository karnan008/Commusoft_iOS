package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import action.iOS_Test_Report;
import io.testproject.sdk.internal.rest.messages.Report;
import io.testproject.sdk.internal.rest.messages.TestReport;
import action.Wrapper2.DIRECTION;
import pages.Customer2;
import pages.Diary;
import pages.Job;

public class Case1 extends iOS_Test_Report{


	@Test (priority = 0) 
	public void Create_Customer() throws InterruptedException 
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
	@Test (priority = 1) 
	public void Edit_Cusotmer() throws InterruptedException
	{
		Customer2 customer = new Customer2(kdriver);
		customer.Side_Menu();
		customer.Search();
		customer.SearchText();
		customer.ClickSearch();
		customer.ClickSearchResult();
		customer.EditScreen();
		customer.AddressLine2();
		customer.Save(); 
		customer.Back();
		customer.Menu_Button();
		customer.Daily();
	}
	@Test (priority = 2) 
	public void Add_Customer_Contact() throws InterruptedException
	{
		Customer2 customer = new Customer2(kdriver);
		customer.Side_Menu();
		customer.Search();
		customer.SearchText();
		customer.ClickSearch();
		customer.ClickSearchResult();
		customer.Contact(); 
		customer.AddContact();
		customer.Title_dropdown();
		customer.Title("Mr");
		customer.Sur_Name(CustomerContact);
		customer.ContactNum(Mobile);
		customer.ContactEmail(Email);
		customer.Save();
		customer.Back();
		customer.Menu_Button();
		customer.Daily();
	}
	@Test (priority = 3) 
	public void Add_Notes_Section() throws InterruptedException
	{
		Customer2 customer = new Customer2(kdriver);

		//Notes - Note
		customer.Side_Menu();
		customer.Search();
		customer.Search_ClickCustomer();//text to result
		customer.Notes();
		customer.AddNotebtn();
		customer.NotesTitle(Title);
		customer.NotesBody("Notes Body");
		customer.Save();

		//Notes - Email
		customer.AddNotebtn0();
		customer.NotesEmail();
		customer.Emailsearch();
		customer.Emailselect();
		customer.EmailDone();
		customer.EmailSubject();
		customer.EmailSend();

		//Notes - SMS
		customer.AddNotebtn0();
		customer.NoteSms();
		customer.Notesms_Contactdropdown();
		customer.SMSDone();
		customer.Note_SMS_Number();
		customer.SMSDone();
		customer.SMS_Message();
		customer.Save();

		//Notes - Phonecall
		customer.AddNotebtn0();
		customer.PhoneCall();
		customer.CallType();
		customer.EmailDone();
		customer.Phone_Contactname();
		customer.EmailDone();
		customer.Phone_Callwith();
		customer.EmailDone();
		customer.Phone_Notes();
		customer.Save();
		customer.Back();
		customer.Menu_Button();
		customer.Daily();	
	}
	@Test (priority = 4) 
	public void Add_Parts() throws InterruptedException
	{
		Customer2 customer = new Customer2(kdriver);
		customer.Side_Menu();
		customer.Search();
		customer.Search_ClickCustomer();//text to result
		customer.Assets();
		customer.AddNotebtn0();
		customer.Asset_group();
		customer.fuel();
		customer.Fueltype();
		customer.Make();
		try{
			//kdriver.findElement(By.xpath("//XCUIElementTypeStaticText[@name='System boiler']")).isDisplayed();
			Thread.sleep(2000);
			customer.AddItem();
			type("//XCUIElementTypeTextField","Model");
			customer.Save();
			click("//XCUIElementTypeOther[4]/XCUIElementTypeOther");
			Thread.sleep(2000);
			click("//XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther");
			Thread.sleep(2000);
			click("//XCUIElementTypeOther[5]/XCUIElementTypeOther");
			Thread.sleep(2000);
			click("//XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther");
			customer.Save();
			
		}catch (Exception e1){
			click("//XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther");
			Thread.sleep(2000); 
			click("//XCUIElementTypeOther[4]/XCUIElementTypeOther"); 
			Thread.sleep(2000);
			click("//XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther");
			Thread.sleep(2000); 
			click("//XCUIElementTypeOther[5]/XCUIElementTypeOther");
			Thread.sleep(2000);
			click("//XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther");
			customer.Save();
		}
		customer.Back();
		customer.Menu_Button();
		customer.Daily();
	}
	
	@Test (priority = 5) 
	public void Add_Reminders() throws InterruptedException
	{
		Customer2 customer = new Customer2(kdriver);
		customer.Side_Menu();
		customer.Search();
		customer.Search_ClickCustomer();//text to result
		customer.More();
		customer.Reminder();
		//Service Reminder
		customer.ServiceReminder();
		customer.AddNotebtn0();
		customer.ServiceType();
		customer.ServiceType_dropdown();
		customer.EmailDone();
		customer.DueDate();
		customer.EmailDone();
		customer.SendTo();
		customer.EmailDone();
		customer.Save();
		customer.Reminder_Back();
		//Reminder
		customer.Reminder1();
		customer.AddNotebtn0();
		customer.ReminderDate();
		customer.EmailDone();
		customer.ReminderNote();
		customer.User();
		customer.UserSelect();
		customer.Done();
		customer.Save();
		customer.Reminder_Back();
		customer.Back();
		customer.Back();
		customer.Menu_Button();
		customer.Daily();	
	}
	
	@Test (priority = 6) //(priority = 6, dependsOnMethods = "Reminders",groups = "deploy") 
	public void Diary_Estimate_Accept() throws InterruptedException
	{
		Customer2 customer = new Customer2(kdriver);
		customer.Side_Menu();
		customer.Search();
		customer.Search_ClickCustomer();//text to result
		customer.More();
		customer.Ongoing();
		customer.AddNotebtn0();
		customer.Add_Estimate();
		customer.Estimate_Des();
		customer.Done();
		customer.Ongoing_Diary();
		customer.Save();
		//Diary screen
		customer.Side_Menu();
		customer.Daily();
		customer.Diary_Today();
//		swipeScreeniOS(DIRECTION.RIGHT);
//		swipeScreeniOS(DIRECTION.RIGHT);
		customer.Diary_Plus();
		customer.Save();
		swipeScreeniOS(DIRECTION.RIGHT);
		swipeScreeniOS(DIRECTION.LEFT);
		Diary diary = new Diary(kdriver);
		//event
		diary.FirstEvent();//9-10 AM
		diary.Estimate_Accept();
		diary.Estimate_Travel();
		diary.Estimate_Arrive();
		diary.Fill_in_Estimate_Choose();
		diary.Fill_in_Estimate();
		diary.Price();
		diary.NoBreakdown();
		diary.NoBreakdown_Value();
		customer.Save();
		diary.Invoice_Schedule();
		customer.Save();
		diary.AcceptorReject();
		diary.Option1();
		diary.Option1_Accept();
		diary.Scrolldown();
		diary.Click_Sign();
		signature(100, 250, 200, 250);//dot
		customer.Save();
		diary.Acceptbtn();
		diary.LeaveSite();
		signature(100, 400, 250, 350);//dot
		diary.Next();
		signature(100, 350, 250, 280);//dot
		customer.Save();
	}
	@Test (priority = 7) 
	public void Diary_Estimate_Reject() throws InterruptedException
	{
		Customer2 customer = new Customer2(kdriver);
		Diary diary = new Diary(kdriver);
		customer.Side_Menu();
		customer.Search();
		customer.Search_ClickCustomer();//text to result
		customer.More();
		customer.Ongoing();
		customer.AddNotebtn0();
		customer.Add_Estimate();
		customer.Estimate_Des();
		customer.Done();
		customer.Ongoing_Diary();
		customer.Save();
		//Diary screen
		customer.Side_Menu();
		customer.Daily();
		customer.Diary_Today();
//		swipeScreeniOS(DIRECTION.RIGHT);
//		swipeScreeniOS(DIRECTION.RIGHT);
		customer.Diary_Plus();
		diary.StartTime();
		diary.StartTimeSlot("10");
		customer.SMSDone();
		customer.Save();
		//Event
		swipeScreeniOS(DIRECTION.RIGHT);
		swipeScreeniOS(DIRECTION.LEFT);
		diary.SecondEvent();//9-10 AM
		diary.Estimate_Accept();
		diary.Estimate_Travel();
		diary.Estimate_Arrive();
		diary.Fill_in_Estimate_Choose();
		diary.Fill_in_Estimate();
		diary.Price();
		diary.NoBreakdown();
		diary.NoBreakdown_Value();
		customer.Save();
		diary.Invoice_Schedule();
		customer.Save();
		diary.AcceptorReject();
		diary.Option1();
		diary.Option2_Reject();
		diary.RejectReason();
		customer.SMSDone();
		diary.Rejectbtn();
		diary.LeaveSite();
		signature(100, 400, 250, 350);//dot
		diary.Next();
		signature(100, 350, 250, 280);//dot
		customer.Save();
		
	}
	@Test (priority = 8) 
	public void Diary_Job_Final_Invoiced() throws InterruptedException
	{
		Customer2 customer = new Customer2(kdriver);
		
		Diary diary = new Diary(kdriver);
		Job job = new Job(kdriver);
		customer.Side_Menu();
		customer.Search();
		customer.Search_ClickCustomer();//text to result
		customer.More();
		customer.Ongoing();
		customer.AddNotebtn0();
		customer.Add_Job();
		customer.Job_Des();
		diary.JobDes("D1");
		customer.Done();
		diary.Booking();
		customer.Save();
		//Diary screen
		customer.Side_Menu();
		customer.Daily();
		customer.Diary_Today();
//		swipeScreeniOS(DIRECTION.RIGHT);
//		swipeScreeniOS(DIRECTION.RIGHT);
		customer.Diary_Plus();
		diary.JobStartTime();
		diary.StartTimeSlot("11");
		customer.SMSDone();
		customer.Save();
		swipeScreeniOS(DIRECTION.RIGHT);
		swipeScreeniOS(DIRECTION.LEFT);
		//event
		diary.ThirdEvent();//11AM-12PM
		diary.Estimate_Accept();
		diary.Estimate_Travel();
		diary.Estimate_Arrive();
		signature(100, 400, 250, 350);//arrive sign
		customer.Save();
		job.Job_Arrive_Answer();
		customer.Save();
		//Certificate
		
//		customer.MoreOption();
//		job.Certificate_Tab();
//		customer.AddNotebtn0();
//		job.Certificate_Search();
//		job.Select_Certificate();
//		diary.Next();
//		job.Add_Asset_toCertificate();
//		job.Select_Asset();
//		customer.Save();
//		diary.Next();
//		job.Add_Defect();
//		job.Defect_Details();
//		job.Remedial_Action();
//		customer.Save();
//		diary.Next();
//		job.Toggle();
//		diary.Next();
//		job.Certificate_Comments();
//		diary.Next();
//		signature(100, 400, 250, 350);//dot
//		diary.Next();
//		signature(100, 400, 200, 350);//dot
//		customer.Save();
//		customer.Back();
		
		//Leave Site
		diary.Fill_in_Job_Report();
		job.Job_Leave_Answer();
		customer.Save();
		diary.LeaveSite();
		diary.YesorNo("Yes");
		signature(100, 400, 250, 350);//dot
		diary.Next();
		signature(100, 350, 250, 280);//dot
		customer.Save();
		//Raise Invoice
		diary.Raise_Final_Invoice();
		diary.Copy_from_Job();
		diary.Invoice_Category();
		customer.SMSDone();
		diary.Next();
		diary.NoBreakdown();
		diary.NoBreakdown_Value("100");
		customer.Save();
		diary.Save_Invoice();
		diary.Payment();
		job.Nominal();
		customer.SMSDone();
		job.Payment_Method();
		customer.SMSDone();
		customer.Save();
		customer.Back();	
	}
	@Test (priority = 9) 
	public void Diary_Job_FOC() throws InterruptedException
	{
		Customer2 customer = new Customer2(kdriver);
		Job job = new Job(kdriver);
		Diary diary = new Diary(kdriver);
		customer.Side_Menu();
		customer.Search();
		customer.Search_ClickCustomer();//text to result
		customer.MoreOption();
		customer.Ongoing();
		customer.AddNotebtn0();
		//Job
		customer.Add_Job();
		customer.Job_Des();
		diary.JobDes("D1");
		customer.Done();
		diary.Booking();
		customer.Save();
		//Diary screen
		customer.Side_Menu();
		customer.Daily();
		customer.Diary_Today();
//		swipeScreeniOS(DIRECTION.RIGHT);
//		swipeScreeniOS(DIRECTION.RIGHT);
		customer.Diary_Plus();
		diary.JobStartTime();
		diary.StartTimeSlot("12");
		customer.SMSDone();
		customer.Save();
		swipeScreeniOS(DIRECTION.RIGHT);
		swipeScreeniOS(DIRECTION.LEFT);
		//event
		diary.FourthEvent();//11AM-12PM
		diary.Estimate_Accept();
		diary.Estimate_Travel();
		diary.Estimate_Arrive();
		signature(100, 400, 250, 350);//arrive sign
		customer.Save();
		job.Job_Arrive_Answer();
		customer.Save();
		diary.Fill_in_Job_Report();
		job.Job_Leave_Answer();
		customer.Save();
		diary.LeaveSite();
		diary.YesorNo("Yes");
		signature(100, 400, 250, 350);//dot
		diary.Next();
		signature(100, 350, 250, 280);//dot
		customer.Save();
		//FOC
		diary.Free_Of_Charge();
		customer.Save();
		customer.Back();
		
		
	}
}
