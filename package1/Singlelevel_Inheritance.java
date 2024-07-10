//Assignment 37
package package1;

class Parent_class

{
	static void add()
	{
	int a=5;
	int b=6;
	int sum= a+b;
	System.out.println(sum);
	}
}

public class Singlelevel_Inheritance extends Parent_class //main method always be in child class
{
 static void substract()
{
	int a=10;
	int b=2;
	int sub= a-b;
	System.out.println(sub);
}
 void multiply()
 {
	 int a=2;
	 int b=4;
	 int mul= a*b;
	System.out.println(mul);	 
 }
public static void main(String[]args)
{
	substract();
	add();
	Singlelevel_Inheritance s1= new Singlelevel_Inheritance();
	s1.multiply();
}
}



//for Non static method
// Singlelevel_Inheritance s1= new Singlelevel_Inheritance();
// s1.substract();
// s1.add();
