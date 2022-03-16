package Studentdetails;

import java.util.Scanner;

public class Inventory {
	String name;
	float price;
	int quantity;
	Scanner s;
	static String banner = "Welcome to IMS";
	
	void input() 
	{
		s = new Scanner (System.in);
		System.out.println("enter your name");
		name = s.next(); //take string as input user
		System.out.println("enter price ");
		price = s.nextFloat();
		System.out.println("enter quantity ");
		quantity = s.nextInt();
		
	}
	void show() {
		
		System.out.println("Product name = " + name + "\nPrice = "+ price + "\n Quantity = " + quantity);
		
	}
	void calculate () {
		if(price > 3000)
			System.out.println("Discount = 10%");
		else
			System.out.println("Discount = 9%");
	}
	
	void displayBanner()
	{
		System.out.println(banner);
	}
	

	public static void main(String[] args) {
		
		Inventory i = new Inventory();
		i.displayBanner();
		i.input();
		i.show();
		i.calculate();
		

	}

}
