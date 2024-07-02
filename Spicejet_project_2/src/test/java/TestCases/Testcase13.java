package TestCases;

import org.testng.annotations.Test;

import Source.Addpage;
import Source.Booking_page;
import Source.Home_page;
import Source.Search_page;

public class Testcase13  extends Launch_Quit
{
	//check if user is able to apply coupon code while ordering the product
	@Test
	public void Coupon_Code() throws InterruptedException
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
		
		Booking_page b1=new Booking_page(driver);
		b1.title_selection_dd();
		b1.title_selection();
		b1.FIRST_NAME();
		b1.LAST_NAME();
		b1.Mobile_No();
		b1.Email();
		b1.town_name();
		Thread.sleep(2000);
		b1.passenger_info_checkbox();
		b1.payment_page_continue_button();
		b1.continue_button();
		
		Addpage a1=new Addpage(driver);
		//a1.continue_button();
		Thread.sleep(5000);
		a1.iframe1(driver);
		a1.pop_up1();
		a1.continue_button();
	}

}