package package1;

public class AccessSpecifier_Within_Class
{
	public void add()
	{
		System.out.println("add");
	}
	private void sub()
	{
		System.out.println("sub");
	}
	protected void multiply()
	{
		System.out.println("multiply");
	}
	void div()
	{
		System.out.println("div");
	}
 public static void main(String[] args) {
	 AccessSpecifier_Within_Class c1= new AccessSpecifier_Within_Class();
	 c1.add();
	 c1.sub();
	 c1.multiply();
	 c1.div();
	 
}
}
