//Assignment 38
package package1;
class Delhi
{
	static void Method_Delhi()
	{
		System.out.println("Method_Delhi");	
	}
}
 class Mumbai extends Delhi
 {
	 static void Method_Mumbai()
	 {
		 System.out.println("Method_Mumbai");
	 }
 }
public class Multilevel_Inheritance extends Mumbai
{
	static void Method_Multiple()
	{
		 System.out.println("Method_Multiple");	
	}
	void Method_Pune()
	{
		System.out.println("Method_Pune");
	}
public static void main(String[]args)
{
	Method_Multiple();
	Method_Mumbai();
	Method_Delhi();
	Multilevel_Inheritance m1 = new Multilevel_Inheritance();
	m1.Method_Pune();
}

}
//for nonstatic method


// Multilevel_Inheritance m1 = new Multilevel_Inheritance();
//m1.Method_Multiple();
// m1.Method_Mumbai();
//m1.Method_Delhi();