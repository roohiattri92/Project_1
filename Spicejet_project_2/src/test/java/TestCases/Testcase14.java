package TestCases;

import org.testng.annotations.Test;

import Source.Home_page;

public class Testcase14 extends Launch_Quit
{
	//check if user is able to search domestic round trip flight
	@Test
	public void Domestic_RoundTrip()
	{
		Home_page h1=new Home_page(driver);
		h1.round_trip_radio_button();
		h1.source_city();
		h1.source_name();
		h1.destination_city();
		h1.destination_name();
		//h1.date_dropdown();
		h1.date_select();
		h1.date_forward_button();
		h1.return_date();
		h1.flight_search_button();
	}

}