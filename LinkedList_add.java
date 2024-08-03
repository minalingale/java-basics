package Collection;
import java.util.*;

import java.util.ArrayList;
import java.util.Collections;


public class LinkedList_add
{

	public static void main(String[] args)
	{
     LinkedList l1= new LinkedList();
     l1.add("Minal");
		l1.add(10);
		l1.add('c');
		l1.add(71.98);
		l1.add(false);
		l1.add(9155453);
		System.out.println(l1);//[Minal, 10, c, 71.98, false, 9155453]LinkedList follow indexing
		
		l1.add("Minal");
		System.out.println(l1); //[Minal, 10, c, 71.98, false, 9155453, Minal] //LinkedList accept duplicats
		
		l1.add(null);
		System.out.println(l1);//[Minal, 10, c, 71.98, false, 9155453, Minal, null] LinkedList accept null
		
		/*l1.add("vinit");
		l1.add("Soni");
		l1.add("Mihir");
		l1.add("test");
		l1.add("Minal");
		Collections.sort(l1);
		System.out.println(l1);*///[Mihir, Minal, Soni, test, vinit] LinkedList sorting 

	}

}