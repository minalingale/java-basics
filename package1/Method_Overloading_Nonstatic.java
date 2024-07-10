//Assignment 13

package package1;

public class Method_Overloading_Nonstatic 
{

	void add(int a)
	{
		System.out.println(a+12);
	}
	void add (int a , int b)
	{
	System.out.println(a+b);
	}
	void add (int a ,double b ,double c)
	{
		System.out.println(a+b+c);
	}
	
	void add()
	{
		System.out.println("welcome");
	}
	public static void main(String[] args) 
	{
		Method_Overloading_Nonstatic m1 =new Method_Overloading_Nonstatic();
		m1.add(9);
		m1.add(2,9);
		m1.add(2,7.8,6.9);
		m1.add();
	}
	
}
