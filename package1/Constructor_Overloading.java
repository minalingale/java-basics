//Assignment 14
package package1;
public class Constructor_Overloading 
{
	Constructor_Overloading(int a)
	{
		System.out.println("Int datatype");	
	}
	Constructor_Overloading(boolean b)
	{
		System.out.println("boolean datatype");
	}
	Constructor_Overloading(char c)
	{
	System.out.println("char datatype");	
	}
	Constructor_Overloading(String d)
	{
	System.out.println("String datatype");
	}
	Constructor_Overloading()
	{
	System.out.println("without parameter");
	}
	public static void main(String[] args) 
	{
		Constructor_Overloading C1 =new Constructor_Overloading(2);
		Constructor_Overloading C2 =new Constructor_Overloading(true);
		Constructor_Overloading C3 =new Constructor_Overloading('a');
		Constructor_Overloading C4 =new Constructor_Overloading("Test");
		Constructor_Overloading C5 =new Constructor_Overloading();
	}
	
	
}
