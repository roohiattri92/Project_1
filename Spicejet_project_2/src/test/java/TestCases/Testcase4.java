package TestCases;

import org.testng.annotations.Test;

import Source.Home_page;

public class Testcase4  extends Launch_Quit
{
	//test the search functionality for one way flight
	@Test
	public void one_way_flight() throws InterruptedException
	{
		Home_page h1=new Home_page(driver);
		h1.source_city();
		h1.source_name();
		h1.destination_city();
		h1.destination_name();
		//h1.date_dropdown(); (Not require since after selecting destination automatically it gets open)
		h1.date_forward_button();
		h1.date_select();
		h1.flight_search_button();
	}

}
