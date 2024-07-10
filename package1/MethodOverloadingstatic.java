//Assignment 12
package package1;

public class MethodOverloadingstatic
{
         
	static void add (int a)
	{
	System.out.println(a+9);
	}
	static void add (int a ,int b) 
	{
     System.out.println(a+b);
    }
	static void add (int a ,double b, double c) 
	{
		double sum =a+b+c;
		System.out.println(sum);
	}
	static void add()
	{
		System.out.println("Test");
	}
			
	public static void main(String[] args) {
		add (20);
		add (12,90);
		add (12,7.9,99.99);
		add();
		
	}
}
