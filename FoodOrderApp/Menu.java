package FoodOrderApp;

public class Menu {
	
	int itemID[] = {0, 1, 2, 3, 4};
	String dishNV[] = {"Omlette", "Butter Chicken", "Butter Naan"};
	float priceNV[] = {200f, 400f, 300f};
	String dishV[] = {"Paneer Tikka", "Dal Masala", "Roti"};
	float priceV[] = {200f, 190f, 100f};
	String menuOpt;
	
	/*
	static {
		System.out.println("The Taj Restaurant");
	}
	*/
	void displayNV() {
		System.out.println("----------------------------------------");
		System.out.println("ID \t Item \t \t Price");
		for(int i=0;i<3;i++) {
			System.out.println(itemID[i]+"\t "+dishNV[i]+"\t "+priceNV[i]);
		}
	}
	void displayV() {
		System.out.println("----------------------------------------");
		System.out.println("ID \t Item \t \t Price");
		for(int i=0;i<3;i++) {
			System.out.println(itemID[i]+"\t "+dishV[i]+"\t "+priceV[i]);
		}
	}
	
	
}
