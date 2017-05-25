import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapInterface {

	//public static void main(String args[])
	{
		Map<Integer,String> hmap = new HashMap<Integer,String>();
		Map<Integer,String> lhmap = new LinkedHashMap<Integer,String>();
		Map<Integer, String> tmap = new TreeMap<Integer,String>();
		testMap(hmap);
		//testMap(lhmap);
		//testMap(tmap);
		
	}
	
	public static void testMap(Map<Integer,String> map)
	{
		map.put(2, "One");
		map.put(1, "Two");
		map.put(4, "Three");
		map.put(3, "Four");
		for(Integer key : map.keySet())
		{
			String key1 = map.get(key);
			System.out.println(key + ":" + key1);
		}
		
	}
}
