package FoodOrderApp;

public class Address {
	String locality;
	String city;
	String state;
	int pinCode;
	
	Address() {
		
	}
	
	public Address(String locality, String city, String state, int pinCode) {
		this.locality = locality;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}
}
