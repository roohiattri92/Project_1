package TestCases;

import org.testng.annotations.Test;

import Source.Home_Page_aircanada;

//Test the search functionality for one way.

public class TestCase_4 extends Launch_Quit
{
	@Test
	public void one_way() throws InterruptedException
	{
		Home_Page_aircanada o1=new Home_Page_aircanada(driver);
		Thread.sleep(1000);
		o1.One_way_select();
		o1.From_city();
		Thread.sleep(1000);
		o1.to_city();
		
		Thread.sleep(1000);
		//o1.Travel_date_1();
		o1.Calender();
		Thread.sleep(2000);
		o1.Date_Select();
		o1.Adults();
		Thread.sleep(1000);
		o1.Plus_one_adult();
		o1.add_one_youth();
		o1.Close_adult_option();
		Thread.sleep(2000);
		o1.Search_select();
	
	}

}
