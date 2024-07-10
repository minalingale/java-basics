//Assignment 35

package package1;

import java.util.Scanner;

public class Scanner_circumfernece_of_circle {

	static Scanner s1 =new Scanner (System.in);
	static void circumfernece_of_circle()
	{
		int r =s1.nextInt();
		double area = Math.PI *r*r;
		System.out.println("circumference of circle ->"+area);
	}
	
	public static void main(String[] args) {
		
		circumfernece_of_circle();
	}
		
		
		
	
	
	
}
