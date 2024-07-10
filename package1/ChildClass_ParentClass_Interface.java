//class A extend B implements c

package package1;


class Add
{
	void add()
	{
		System.out.println("Addition");
	}
}
interface sub
{
	void sub();
}


public class ChildClass_ParentClass_Interface extends Add implements sub 
{
	public void sub() 
	{
		System.out.println("substraction");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass_ParentClass_Interface c1 = new ChildClass_ParentClass_Interface();
		c1.add();
		c1.sub();
	
       
	}

	

}
