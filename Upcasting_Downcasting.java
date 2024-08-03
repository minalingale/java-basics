package Collection;
class Parent_Class
{
    void add()
    {
    	System.out.println("Addition");
    }
    void sub()
    {
    	System.out.println("Substraction");
    }
}

public class Upcasting_Downcasting extends Parent_Class
{
	void mul()
	{
		System.out.println("Multiplication");
	}
	void div()
	{
		System.out.println("Division");
	}
	public static void main(String[] args) 
	{
		Parent_Class p1=new Upcasting_Downcasting();//Upcasting(implicit manner) converting child class object into super class
		p1.add();
		p1.sub();
	
		Parent_Class p2 = (Parent_Class) new Upcasting_Downcasting();//upcasting explicitmanner
	
		
		 
		Upcasting_Downcasting u1= (Upcasting_Downcasting) p1;//converting parentclass object into child class type
		u1.add();
		u1.sub();
		u1.mul();
		u1.div();
	}

}
