package FoodOrderApp;
import java.util.Scanner;

public class Orders {
	Menu m = new Menu();
	
	int orderNum;
	int[] quantity = new int[100];
	int[] dishNum = new int[100];	
	float dishTotal;
	float orderTotal;
	
	Scanner sc = new Scanner(System.in);	
	
	boolean getData() {
		
		int menuOpt;
		boolean flag = false;
		System.out.println("Select Veg(1)/Non-Veg(2): ");
		menuOpt = sc.nextInt();

		if(menuOpt==1) {
			flag = true;
			m.displayV();
		}
		else if (menuOpt==2) {
			flag = false;
			m.displayNV();
		}
		else {
			System.out.println("Invalid Option! Input 1 or 2 only!");

		}
		char ch;
		int counter = 0;
		System.out.println("---------Order--------------------------");
		do {
			System.out.println("Enter the dish number:");
			dishNum[counter] = sc.nextInt();
			System.out.println("Enter the quantity:");
			quantity[counter] = sc.nextInt();
			System.out.println("Do you want to add more? (Y/N)");
			ch = sc.next().charAt(0);
			counter += 1;
		}
		while(ch=='y' || ch=='Y');
		
		return flag;
	}
	
	void display(boolean check) {
		
		//orderTotal = quantity*m.price[dishNum];
		orderTotal = 0;
		dishTotal = 0;
		
		if (check) {
			System.out.println("--------Order Confirmation----------------");
			for(int i=0;i<3;i++) {
				dishTotal = quantity[i]*m.priceV[dishNum[i]];
				System.out.println(quantity[i]+"x "+m.dishV[dishNum[i]]+" : "+dishTotal);
				orderTotal += dishTotal;
			}
		}
		else {
			System.out.println("--------Order Confirmation----------------");
			for(int i=0;i<3;i++) {
				dishTotal = quantity[i]*m.priceNV[dishNum[i]];
				System.out.println(quantity[i]+"x "+m.dishNV[dishNum[i]]+" : "+dishTotal);
				orderTotal += dishTotal;
			}
		}

		System.out.println("Total Amount: "+orderTotal);

	}
	
}
