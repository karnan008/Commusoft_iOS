package testcase;

import org.testng.annotations.Test;

import action.iOS_Test_Report;
import action.Wrapper2.DIRECTION;
import pages.Customer2;
import pages.Diary;
import pages.Job;

public class testing extends iOS_Test_Report{

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
