package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayList_add {

	public static void main(String[] args)
	{
	ArrayList a1= new ArrayList();
	/*	a1.add("Minal");
		a1.add(10);
		a1.add('c');
		a1.add(71.98);
		a1.add(false);
		a1.add(9155453);
		System.out.println(a1);//[Minal, 10, c, 71.98, false, 9155453]Arraylist follow indexing
		
		a1.add("Minal");
		System.out.println(a1); //[Minal, 10, c, 71.98, false, 9155453, Minal] //Arraylist accept duplicats
		
		a1.add(null);
		System.out.println(a1)*/;//[Minal, 10, c, 71.98, false, 9155453, Minal, null] Arralist accept null
		a1.add("vinit");
		a1.add("Soni");
		a1.add("Mihir");
		a1.add("test");
		a1.add("Minal");
		Collections.sort(a1);
		System.out.println(a1);//[Mihir, Minal, Soni, test, vinit] Arraylist sorting 
}
}