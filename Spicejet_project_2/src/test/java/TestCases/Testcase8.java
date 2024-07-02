package TestCases;

import org.testng.annotations.Test;

import Source.Booking_page;
import Source.Home_page;
import Source.Search_page;

public class Testcase8 extends Launch_Quit
{
	/* Verify that the user is presented with additional options like luggage
	extra legroom, foods/beverages, etc and selecting the same results in additional cost with the booking amount */
	@Test
	public void additional_Details() throws InterruptedException
	{
		Home_page h1=new Home_page(driver);
		h1.source_city();
		h1.source_name();
		h1.destination_city();
		h1.destination_name();
		h1.date_forward_button();
		h1.date_select();
		h1.flight_search_button();
		
		Search_page s1=new Search_page(driver);
		s1.search_continue_button();
		
		Booking_page b1=new 	Booking_page(driver);
		b1.title_selection_dd();
		b1.title_selection();
		b1.FIRST_NAME();
		b1.LAST_NAME();
		b1.Mobile_No();
		b1.Email();
		//b1.county_selection();
		//b1.county_selection_dd(driver);
		b1.town_name();
		Thread.sleep(2000);
		b1.passenger_info_checkbox();
		b1.payment_page_continue_button();
		
		//Thread.sleep(5000);
		//b1.SpiceCafe_selection();
		//b1.select_meals_option();
		
		//b1.pop_up_close();
		b1.continue_button();
		
	}

}