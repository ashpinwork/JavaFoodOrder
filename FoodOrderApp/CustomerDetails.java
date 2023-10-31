package FoodOrderApp;

import java.util.Scanner;

public class CustomerDetails {
	
	String custID;
	int phoneNum;
	String emailID;
	float points;
	Name n = new Name();
	Address addr = new Address();

	
	Scanner sc = new Scanner(System.in);
		
	// Customer Details Constructor
	CustomerDetails() {}
	
	CustomerDetails(String custID, Name n, int phoneNum, String emailID, Address addr) {
		this.custID = custID;
		this.n.fName = n.fName;
		this.phoneNum = phoneNum;
		this.emailID = emailID;
		this.addr.locality = addr.locality;
	}
	

	void getSubbscription() {
		
		System.out.println("--------LOGIN--------");
		System.out.println("Customer ID:\n(Enter G to continue as Guest )");
		custID = sc.next();
		
	}
	
	void checkUser() {
		Regular r = new Regular();
		Guest g = new Guest();
		Premium p = new Premium();
		
		
		if (custID.toUpperCase().startsWith("R")) {
			System.out.println("--------REGULAR USER--------------------------");
			r.payBill();
		}
		else if (custID.toUpperCase().startsWith("G")) {
			System.out.println("--------GUEST USER--------------------------");
			g.payBill();
		}
		else if (custID.toUpperCase().startsWith("P")) {
			System.out.println("--------PREMIUM USER--------------------------");
			p.payBill();
		}
		else {
			System.out.println("Customer ID error!");
		}
	}	
	
	void deliveryDetails() {
		System.out.println("---------Delivery Details----------------");	
		System.out.println("\t Personal");
		System.out.println("First Name:");
		n.fName = sc.next();
		System.out.println("Middle Name:");
		n.mName = sc.next();
		System.out.println("Last Name:");
		n.lName = sc.next();
		System.out.println("Phone Number:");
		phoneNum = sc.nextInt();
		System.out.println("Email ID: ");
		emailID = sc.next();
		System.out.println("\t Address");
		System.out.println("Locality: ");
		addr.locality = sc.next();
		System.out.println("City: ");
		addr.city = sc.next();
		System.out.println("State: ");
		addr.state = sc.next();
		System.out.println("Pin Code: ");
		addr.pinCode = sc.nextInt();

		
	}

}
