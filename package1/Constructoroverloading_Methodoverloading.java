//Asssignment 15
package package1;

public class Constructoroverloading_Methodoverloading {

	//constructor 
	Constructoroverloading_Methodoverloading()  //class name with non parameterise 
	{
	 System.out.println("Hello i am constructor");	
	}
	Constructoroverloading_Methodoverloading(int x ,int y) //class name with parameterise
	{
		System.out.println("Addition of 2 number is(via constructor overloading:" +(x+y));
	}
	
   //Methodoverloading (multiple method with same name but variation in argument)
	
	static void add (int a ,int b)
	{
	System.out.println(a+b);	
	}
	static void add (int a ,int b ,int c)
	{
	System.out.println(a+b+c);	
	}
	
	static void add (int a ,int b ,double c)
	{
		System.out.println(a+b+c);
		
	}
	static void add (int a ,int b ,double c ,double d) 
	{
	  double sum =a+b+c+d;
	  System.out.println(sum);
	}
     public static void main(String[] args)
     {
    	 Constructoroverloading_Methodoverloading c1 =new Constructoroverloading_Methodoverloading();
    	 Constructoroverloading_Methodoverloading c2 =new Constructoroverloading_Methodoverloading(9,8);
    	 add(2,3);
    	 add(3,5,8);
    	 add(6,8,8.9);
    	 add(3,8,3.4,9.8);
    	 
     }

}
