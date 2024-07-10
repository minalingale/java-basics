//Assignment 16
package package1;

public class Global_Variable 
{
     int a=10;
     int b=5;
     int sum = a+b;
     int substract =a-b;
     int multiply= a*b;
     int division =a/b;
     int mod =a%b;
     
     
     public static void main(String[] args)
     
     {
    	 Global_Variable g1 = new Global_Variable ();
    	 System.out.println(g1.sum);
    	 System.out.println(g1.substract); 
    	 System.out.println(g1.multiply);
    	 System.out.println(g1.division);
    	 System.out.println(g1.mod);
    	 
     }
	
}
