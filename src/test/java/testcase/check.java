package testcase;

import org.testng.annotations.Test;

import action.iOS_Test_Report;
import action.Wrapper2.DIRECTION;
import pages.Customer2;
import pages.Diary;
import pages.Job;

public class check extends iOS_Test_Report{

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
		swipeScreeniOS(DIRECTION.RIGHT);
		swipeScreeniOS(DIRECTION.RIGHT);
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
		customer.MoreOption();
		job.Certificate_Tab();
		customer.AddNotebtn0();
		job.Certificate_Search();
		job.Select_Certificate();
		diary.Next();
		job.Add_Asset_toCertificate();
		job.Select_Asset();
		customer.Save();
		diary.Next();
		job.Add_Defect();
		job.Defect_Details();
		job.Remedial_Action();
		customer.Save();
		diary.Next();
		job.Toggle();
		diary.Next();
		job.Certificate_Comments();
		diary.Next();
		signature(100, 400, 250, 350);//dot
		diary.Next();
		signature(100, 400, 200, 350);//dot
		customer.Save();
		customer.Back();
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


}
