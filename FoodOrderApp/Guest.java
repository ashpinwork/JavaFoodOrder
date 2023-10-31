package FoodOrderApp;

public class Guest implements BillPayment {
	
	float delivery = 400f;
	float discount = 0;
	
	@Override
	public void payBill() {
		Orders o = new Orders();
		boolean v;
		
		v = o.getData();
		o.display(v);		

		
		float total = (o.orderTotal*(1-discount) + delivery);
		
		System.out.println("--------Billing--------");
		System.out.println("Delivery Charges: "+delivery);
		System.out.println("Billed Amount: "+total);
	}

}
