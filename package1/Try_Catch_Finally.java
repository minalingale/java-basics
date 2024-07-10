//Assi 64
package package1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_Catch_Finally 
{

	public static void main(String[] args)
	{
		Scanner s1 =  new Scanner(System.in);
		try
		{
		   System.out.println("Enter valid age");
		   int age=s1.nextInt();//enter name input mismatch error coming
		   System.out.println(age);
		}
		catch(InputMismatchException a1)
		{
			System.out.println("Hey age must be a valid numeric value, Please enter again");
			Scanner s2 =  new Scanner(System.in);
			System.out.println("Enter valid age");
			int age1 =s2.nextInt();
		}
		finally
		{
			System.out.println("NO matter try and Catch will execute or not ,but i will always be there");
		}

	}

}
