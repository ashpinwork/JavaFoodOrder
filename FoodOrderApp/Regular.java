package FoodOrderApp;

public class Regular implements BillPayment {
	
	float delivery = 200f;
	float discount = 0.25f;
	
	@Override
	public void payBill() {		
		Orders o = new Orders();
		boolean v;
		
		v = o.getData();
		o.display(v);		

		
		float total = (o.orderTotal*(1-discount) + delivery);
		
		System.out.println("--------Billing--------");
		System.out.println("Delivery Charges: "+delivery);
		System.out.println("Discount: "+(discount*100)+"%");
		System.out.println("Billed Amount: "+total);

		
	}
}
