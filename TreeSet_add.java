package Collection;

import java.util.List;
import java.util.TreeSet;

public class TreeSet_add
{

	public static void main(String[] args) 
	{
    TreeSet t1=new TreeSet();
  t1.add("Minal");
   t1.add("Soni");
   t1.add("Kaavya");
   t1.add("Ved");
   t1.add("Atharva");
   System.out.println(t1);//Tresset not follow indexing
   
    t1.add("Ved");
    System.out.println(t1);//Treeset not accepting duplicate
/*    t1.add(null);
    System.out.println(t1);//Treeset not accepting null*/
   
	/*t2.add("vinit");
		t2.add("Soni");
		t2.add("Mihir");
		t2.add("test");
		t2.add("Minal");
		Collections.sort(t2);
		System.out.println(t2);//sorting not allowed in treeset*/
       
	}

}
