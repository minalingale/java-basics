//ASsignment42
package package1;

public class This_CallingStatement 
{
	This_CallingStatement()
	{
		System.out.println("Test1");
	}
	This_CallingStatement(int a,int b )
	{
		this();
		System.out.println("Test 2");
	}
	This_CallingStatement(int a ,double d)
	{
		this(2,3);
		System.out.println("Test3");
	}

	public static void main(String[] args) 
	{
		This_CallingStatement t1 = new This_CallingStatement(3,23.23);
		
		
	}

}
