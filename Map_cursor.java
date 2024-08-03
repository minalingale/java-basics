package Collection;


import java.util.HashMap;
import java.util.Map;

public class Map_cursor
{

	public static void main(String[] args)
	{

		Map<String,Integer> m4 = new HashMap<String,Integer>();
		m4.put("Minal", 12);
		m4.put("nandhni", 13);
		m4.put("mani", 20);
		m4.put("sunil", 23);
		System.out.println(m4);
		for(String key: m4.keySet())
		{
			System.out.println(key);			
		}
		for(Integer value:m4.values())
        {
			System.out.println(value);
        }
		System.out.println(m4);
		for(Entry <String,Integer> KV:m4.entrySet());
		
		

	}

}
