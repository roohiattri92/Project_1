package TestCases;

import org.testng.annotations.Test;

import Source.Booking_page;
import Source.Home_page;
import Source.Search_page;

public class Testcase11  extends Launch_Quit
{
	@Test
	public void passenger_info()
	{
		Home_page h1=new Home_page(driver);
		h1.source_city();
		h1.source_name();
		h1.destination_city();
		h1.destination_name();
		h1.date_forward_button();
		h1.date_select();
		h1.flight_search_button();
		
		Search_page s1=new Search_page (driver);
		s1.search_continue_button();
		
		Booking_page b1=new Booking_page(driver);
		b1.title_selection_dd();
		b1.title_selection();
		b1.FIRST_NAME();
		b1.LAST_NAME();
		b1.Mobile_No();
		b1.Email();
		b1.town_name();
		b1.passenger_info_checkbox();
	}

}
