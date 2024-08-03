package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class LIst_Set_difference {

	public static void main(String[] args)
	{
        List l1= new ArrayList();//upcasting
        l1.add("Minal");
        l1.add(12);
        l1.add("Think");
        l1.add("Minal");
        l1.add(null);
        l1.add(null);
        System.out.println(l1);
        Iterator i1=l1.iterator();
        
        while(i1.hasNext())
        		{
        	     System.out.println(i1.next());
        		}
       ListIterator i3=l1.listIterator();
       while(i3.hasNext())
		{
	     System.out.println(i3.next());
		}
       while(i3.hasPrevious())
		{
	     System.out.println(i3.previous());
		}	   
    		
    		
    		
        Set s1= new HashSet();
        s1.add("Minal");
        s1.add(12);
        s1.add("Think");
        s1.add("Minal");
        s1.add(null);
        s1.add(null);
        System.out.println(s1);
 Iterator i2=s1.iterator();
 
while(i2.hasNext())
		{
	     System.out.println(i2.next());
	
		}
 
 
	}
}
