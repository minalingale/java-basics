package package1;

public class StaticMethod
{
	static void add()
	{
		int no1=10;
		int no2=20;
		int sum =no1+no2;
		System.out.println(sum);
	}
     static void sub()
     {
    		int no1=30;
    		int no2=20;
    		int sub =no1-no2; 
    		System.out.println(sub);
     }
	public static void main(String[] args) {
		  add();
		  sub();

	}

}
