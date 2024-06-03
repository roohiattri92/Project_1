package TestCases;

import org.testng.annotations.Test;

import Source.Home_Page_aircanada;

public class TestCase_5 extends Launch_Quit

{
	@Test

	public void round_trip_flight() throws InterruptedException
	{
		Home_Page_aircanada o1=new Home_Page_aircanada(driver);
		Thread.sleep(1000);
		o1.Round_trip();
		o1.From_city();
		Thread.sleep(1000);
		o1.to_city();
		
		Thread.sleep(1000);
		
		o1.Calender();
		Thread.sleep(2000);
		o1.Date_Select();
		o1.Return();
		o1.Select_return_date();
		Thread.sleep(1000);
		
		o1.Adults();
		Thread.sleep(1000);
		o1.Plus_one_adult();
		o1.add_one_youth();
		o1.Close_adult_option();
		Thread.sleep(2000);
		o1.Search_select();
	}
}
