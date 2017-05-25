import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String args[])
	{
		HashMap<Integer,String> hmap = new HashMap<Integer,String>();
		hmap.put(1,"One");
		hmap.put(2, "Two");
		hmap.put(3, "Three");
		
		//System.out.println("The value is: " +hmap.get(2));
		System.out.println("The value is: " +hmap);
		
		for(Map.Entry<Integer, String> value : hmap.entrySet())
		{
			int key= value.getKey();
			String val= value.getValue();
			System.out.println(key + ":" + val);
		}
		
	}
}
