package TestCases;

import org.testng.annotations.Test;

import Source.Home_page;

public class Testcase9 extends Launch_Quit
{
	// validate the systems ability to handle multiple passenger
	@Test
	public void Multiple_Passenger()
	{
		Home_page h1=new Home_page(driver);
		h1.source_city();
		h1.source_name();
		h1.destination_city();
		h1.destination_name();
		h1.date_forward_button();
		h1.date_select();
		h1.passanger_dropdown();
		h1.adult_button();
		h1.children_button();
		h1.infant_button();
		h1.flight_search_button();
	}

}