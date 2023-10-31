package FoodOrderApp;
//import java.util.Scanner;

public class Eater {

	public static void main(String[] args) {
		CustomerDetails cd = new CustomerDetails();		
		Restaurant rst = new Restaurant();
		
		Restaurant.details();
		cd.getSubbscription();
		cd.checkUser();
		rst.checkDateTime();
		cd.deliveryDetails();
		Restaurant.queries();
	}

}
