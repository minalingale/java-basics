package Collection;
import java.util.ArrayList;
import java.util.ListIterator;
public class Iterator_ListIterator_hasnext_hasprevious 
{
	public static void main(String[] args)
	{
		ArrayList a1=new ArrayList();
		a1.add("MInal");
		a1.add("Ved");
		a1.add('B');
		a1.add(10);
		System.out.println(a1);
		ListIterator i2=a1.listIterator();//listiterator applicable to only list interface
		while(i2.hasNext())
		{
			System.out.println("forward iterartion ->"+i2.next());
			
		}
		while(i2.hasPrevious())
		{
			System.out.println("backword iterartion ->"+i2.previous());
			
		}
			
		/*	java.util.Iterator i1=       a1.iterator();//iterator applicable to entrire collection hirarchy
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}*/
	}
}
