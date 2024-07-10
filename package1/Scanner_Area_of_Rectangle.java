// Assignment 34
package package1;

import java.util.Scanner;

public class Scanner_Area_of_Rectangle {

	
	static Scanner s1 =new Scanner(System.in);
	
	
	static void Area_of_Rectangle() 
	{
		System.out.println("Enter the value of width and height->");
	 int width =s1.nextInt();
	 int height =s1.nextInt();
	 int area = width*height;
	 System.out.println("Area of Rectabgle ->" +area);
	}
	public static void main(String[] args) 
	{
		Area_of_Rectangle();
		
	}
	
}
