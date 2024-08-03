package Collection;

import java.util.LinkedHashSet;
import java.util.List;

public class LinkedHashSet_add {

	public static void main(String[] args) {
	LinkedHashSet l1= new LinkedHashSet();
	l1.add("Minal");
	l1.add("10");
	l1.add("ved");
	l1.add('A');
	l1.add(true);
	System.out.println(l1);//order of insertion,hetrogeneous
	l1.add(null);
	l1.add(null);
	System.out.println(l1);//acceptonly 1
	l1.add("ved");
	System.out.println(l1);//not accept duplicate
/*	o1.add("Minal");
	o1.add("Ved");
	o1.add("Atharva");
	Collections.sort(o1);
	System.out.println(a1);// sorting not allowed for LinkedHashSet*/
	
	
	
	}

}
