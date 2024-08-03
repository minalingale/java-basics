package Collection;

public class StringBuffer_class {


	public static void main(String[] args)
	{
		StringBuffer s1=new StringBuffer("test");
	     s1.append(" Automation");
	     System.out.println(s1);
	     
	     System.out.println(s1.length());
	     System.out.println(s1.substring(2));
	     System.out.println(s1.substring(0,4));
	     System.out.println(s1.indexOf("A"));
	     System.out.println(s1.isEmpty());
	     System.out.println(s1.replace(0, 4, "MKT"));
	     System.out.println(s1.reverse());
	     System.out.println(s1.reverse());
	     System.out.println(s1.insert(0, "test"));
	     System.out.println(s1.capacity());
	     System.out.println(s1.delete(0, 4));
	}

}
