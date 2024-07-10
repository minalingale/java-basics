package package1;
class Method_parent
{
	void add()
	{
		System.out.println("Login from Mobile number");
	}
	
}
public class Overriding extends Method_parent
{
 void add ()
 {
	 System.out.println("Login from Email address");
 }
 public static void main(String[] args) {
	 Overriding o1 = new Overriding();
	 o1.add();
	 
			 
}
}
