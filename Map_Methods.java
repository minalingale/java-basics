package Collection;

import java.util.HashMap;
import java.util.Map;

public class Map_Methods {

	public static void main(String[] args) 
	{
		Map m1= new HashMap();
		m1.put("Ram",12);
		m1.put("ved", 12);
		m1.put("om", 18);
		m1.put("atharva", 3);
		m1.put("minal", 30);
		System.out.println(m1);//not follow indexing
		
		Map m2=new HashMap();
		m2.put("palak", 11);
		m2.put("shreya", 20);
		m2.put("nil", 9);
		m2.putAll(m1);
		System.out.println(m2);
				
		Map m3= new HashMap();
		m3.put("suman", 90);
		m3.put("veda", 12);
		m3.put("kaavya", 30);
		System.out.println(m3);
		m3.clear();
		System.out.println(m3);
		
		Map<String,String> m4 = new HashMap<String,String>();
		m4.put("Minal", "Software Tester");
		m4.put("nandhni", "Software developer");
		m4.put("mani", "Software java developer");
		m4.put("sunil", "Manager");
		System.out.println(m4);
		m4.putIfAbsent("test", "lead");
		System.out.println(m4);
		System.out.println(m1.containsKey("minal"));
		System.out.println(m1.containsValue("BA"));
		
		m4.remove("Minal");
		System.out.println(m4);
		m4.remove("mani", "Software java developer");
		System.out.println(m4);
		
		System.out.println(m4.keySet());
		System.out.println(m4.values());
		System.out.println(m4.entrySet());
		
		
		
           
	}

}
