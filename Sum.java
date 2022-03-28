package LabAdditional;

//wap to print sum of digit 

import java.util.Scanner;

public class Sum {
	
	int num1,num2; //
    int total;
    Scanner g;

    void takeNum()
    {
        g = new Scanner(System.in);
        System.out.println("Enter num1");
        num1 = g.nextInt();
        System.out.println("Enter num2");
        num2 = g.nextInt();
    }

    void result()
    {
        total = num1+num2;
        System.out.println("Sum of " + num1 + " + " + num2 + " = " + total);
    }


	public static void main(String[] args) {
		Sum var = new Sum();
        var.takeNum();
        var.result();
	}

}
