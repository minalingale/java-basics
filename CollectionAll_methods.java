package Collection;
import java.util.ArrayList;
public class CollectionAll_methods 
{
	public static void main(String[] args) 
	{
		ArrayList a1= new ArrayList();
		 a1.add("Ram");
		 a1.add("Sita");
		 a1.add("Laxman");     //add methods
		 System.out.println("a1 is -> "+a1);
		 
		 ArrayList a2 = new ArrayList();
		 a2.addAll(a1);   //addall methods
		 a2.add("Minal");
		 a2.add("Ved");
		 System.out.println("a2 is ->" +a2);
		 
		 a1.add(1, "Atharva"); //index with object
		 System.out.println("a1 is -> "+ a1);
		 a2.addAll(0, a1);  //index with collectoion
		 System.out.println("a2 is ->"+a2);
		 
	     a2.remove("Ram"); //remove methods
	     System.out.println(a2);
	     a2.removeAll(a1);  //remove all
	     System.out.println("a2 is ->"+a2);
	     System.out.println(a2.contains("Ved"));//contains
	     
	     System.out.println(a2.size());
	     System.out.println(a1.size());
	     System.out.println(a1.isEmpty());
	     
	  
	     System.out.println(a2.get(0));
	     a1.set(1, "av");
	     System.out.println(a1);
	     a1.clear();
	     System.out.println(a1);
	     
	     
		 
	}

}
