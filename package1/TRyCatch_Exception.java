//Assi 62
package package1;
import java.util.InputMismatchException;
import java.util.Scanner;
public class TRyCatch_Exception 
{
public static void main(String[] args) 
   {
	Scanner s1 = new Scanner(System.in);
   try 
   { 
	   System.out.println("Enter a valid age");
	   int age = s1.nextInt();
	   System.out.println("Enter a valid Salary");
	   double salary = s1.nextDouble();
	   System.out.println("Enter a valid weight");
	   float weight = s1.nextFloat();
	   System.out.println("Are you a student");
	   boolean student = s1.nextBoolean();
   }
   catch(InputMismatchException a1)
   {
	   System.out.println("Please enter valid input");
	   Scanner s2 = new Scanner(System.in);
	   System.out.println("Enter a valid age");
	   int age = s2.nextInt();
	   System.out.println("Enter a valid Salary");
	   double salary = s2.nextDouble();
	   System.out.println("Enter a valid weight");
	   float weight = s2.nextFloat();
	   System.out.println("Are you a student");
	   boolean student = s2.nextBoolean();
	}  
  }
}