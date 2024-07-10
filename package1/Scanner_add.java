//Assignment32

package package1;

import java.util.Scanner;

public class Scanner_add
{

	static Scanner s1 = new Scanner(System.in);
	
	static void add()
	{
	System.out.println("Enter the value of a &b ->");
	int a= s1.nextInt();
	int b =s1.nextInt();
	int sum= a +b;
	System.out.println("The addition of 2 number is ->" +sum);
	}
	static void sub()
	{
	System.out.println("Enter the value of a &b ->");
	int a= s1.nextInt();
	int b =s1.nextInt();
	int sub= a -b;
	System.out.println("The substraction of 2 number is ->" +sub);
	}
	static void mul()
	{
	System.out.println("Enter the value of a &b ->");
	int a= s1.nextInt();
	int b =s1.nextInt();
	int mul= a *b;
	System.out.println("The multiplication of 2 number is ->" +mul);
	}
	static void div()
	{
	System.out.println("Enter the value of a &b ->");
	int a= s1.nextInt();
	int b =s1.nextInt();
	int div= a / b;
	System.out.println("The division of 2 number is ->" +div);
	}
	static void mod()
	{
	System.out.println("Enter the value of a &b ->");
	int a= s1.nextInt();
	int b =s1.nextInt();
	int mod= a % b;
	System.out.println("The modulus of 2 number is ->" +mod);
	}

	
	public static void main(String[] args)
	{
	 add();
	 sub();
	 mul();
	 div();
	 mod();
	 }
	
	
}
