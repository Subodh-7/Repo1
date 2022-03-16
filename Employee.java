package Studentdetails;

import java.util.*;
// wap to ask 2 employees record from user and display
public class Employee {
	
	String name;
	int age;
	float salary;
	Scanner s;
//	static int code;
	
	//non static methods of class
	void add()
	{
		s = new Scanner (System.in);
		System.out.println("enter name ");
		name = s.next(); //take string as input user
		System.out.println("enter age ");
		age = s.nextInt();
		System.out.println("enter salary ");
		salary = s.nextFloat();
		
	}
	
	void display()
	{
		System.out.println(name + " " + age + " " + salary);
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.add();
		e.display();
		
		Employee e1 = new Employee();
		e1.add();
		e1.display();

	}

}
