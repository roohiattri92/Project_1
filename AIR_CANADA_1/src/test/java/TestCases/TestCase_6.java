package TestCases;

import org.testng.annotations.Test;

import Source.Departing_flight;
import Source.Home_Page_aircanada;

//Validate search result for different class (economy,business,first class)
public class TestCase_6 extends Launch_Quit

{
	@Test
	public void Different_Classes() throws InterruptedException
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
		
		Departing_flight n=new Departing_flight(driver);
		n.Economy();
		n.Select_button_for_economy();
		n.choose_comfort();
	}
	}

