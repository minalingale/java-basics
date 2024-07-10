//Ass 46

package package1;

class parent 
{
	static void Login() //2 concrete method
	{
		System.out.println("Login");
	}
	static void Email()
	{
		System.out.println("Email");
	}
	
}
abstract class parent1 extends parent
    {
	abstract void add();//2abstract method
	abstract void sub();
    
     void div()
      {
	System.out.println("division");
      }
     void mod()
      {
	System.out.println("Modulus");
      }
    }
public class Child_2AM_2CM extends parent1 
{
	void add() 
	{
     System.out.println("addition");
	}
	void sub() {
		System.out.println("Substraction");
	}
   
	public static void main(String[] args) 
	{
	
          Login();
          Email();
		Child_2AM_2CM c1 =new Child_2AM_2CM();
		c1.add();
		c1.sub();
		c1.div();
		c1.mod();
			
}
}
	
	