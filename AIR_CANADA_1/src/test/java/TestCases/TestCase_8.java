package TestCases;

import org.testng.annotations.Test;

import Source.Home_Page_aircanada;

/*verify that the user is presented with additional options like luggage, 
extra legroom, food, etc and selecting like same results in additional cost with the booking
amount*/
public class TestCase_8 extends Launch_Quit
{
	@Test
	public void Additional_options() throws InterruptedException
	{
		/*Home_Page_aircanada o1=new Home_Page_aircanada(driver);
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
		o1.Click_on_second_clender();
		o1.Select_return_date();*/
		
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

		