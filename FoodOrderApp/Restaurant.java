package FoodOrderApp;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Restaurant {
	
	static void details() {
		System.out.println("Welcome to the Taj Restaurant");
	}
	
	void checkDateTime() {
		ZonedDateTime DateTime = ZonedDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH.mm z");
		System.out.println(formatter.format(DateTime));
	}
	
	static void queries() {
		System.out.println("----------------------------------------------------------------");
		System.out.println("Thank you for choosing The Taj Restaurant! Enjoy your meal!");
		System.out.println("For any queries, please contact:");
		System.out.println("+91 653456534");
		System.out.println("taj@email.com");


	}
	
}
