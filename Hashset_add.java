package Collection;
import java.util.HashSet;
import java.util.List;

public class Hashset_add {

	public static void main(String[] args) {
	HashSet h1= new HashSet();
		h1.add("Minal");
		h1.add("Ved");
		h1.add("Atharva");
		h1.add("Parth");
		h1.add(11);
		System.out.println(h1);//Hashset not follow insertion order & heterogeneous value
		
		h1.add("Ved");
		System.out.println(h1);//not accepting duplicated
		h1.add(null);
		System.out.println(h1);
		h1.add(null);
		System.out.println(h1);//accept only 1 null value
		/*HashSet h2= new HashSet();
		h2.add("Minal");
		h2.add("Ved");
		h2.add("Atharva");
		h2.add("Parth");
		Collections.sort(h2);// sorting not applicable for treeset*/
		
		
		
	}

}
