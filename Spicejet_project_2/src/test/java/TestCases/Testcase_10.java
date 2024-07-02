package TestCases;

import org.testng.annotations.Test;

import Source.Home_page;

public class Testcase_10 extends Launch_Quit
{
	// Validate the flight information, fare details, baggage rules and cancellations link has the details in the search result page.
	
	@Test
	public void Flight_Details()
	{
		Home_page h1=new Home_page(driver);
		h1.source_city();
		h1.source_name();
		h1.destination_city();
		h1.destination_name();
		h1.date_forward_button();
		h1.date_select();
		h1.flight_search_button();
		h1.flight_details_dropdown();
		//h1.flight_info();
		
		
	}
}
