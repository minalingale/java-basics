package Collection;

import java.util.Collections;
import java.util.Vector;

public class Vector_add 
{

	public static void main(String[] args)
	{
        Vector v1= new Vector();
       /* v1.add("Minal");
 		v1.add(10);
 		v1.add('c');
 		v1.add(71.98);
 		v1.add(false);
 		v1.add(9155453);
 		System.out.println(v1);//[Minal, 10, c, 71.98, false, 9155453]LinkedList follow indexing & Heterogeneous valued
 		
 		v1.add("Minal");
 		System.out.println(v1); //[Minal, 10, c, 71.98, false, 9155453, Minal] //LinkedList accept duplicats
 		
 		v1.add(null);
 		System.out.println(v1);*///[Minal, 10, c, 71.98, false, 9155453, Minal, null] LinkedList accept null
 		
 		v1.add("vinit");
 		v1.add("Soni");
 		v1.add("Mihir");
 		v1.add("test");
 		v1.add("Minal");
 		Collections.sort(v1);
 		System.out.println(v1);//[Mihir, Minal, Soni, test, vinit] LinkedList sorting 



	}

}
