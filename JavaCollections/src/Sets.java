import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
	public static void main(String args[])
	{
		//HashSet<String> hashSet = new HashSet<String>();
		//LinkedHashSet<String> hashSet = new LinkedHashSet<String>(); 
		Set<String> hashSet = new TreeSet<String>();	
		
		if(hashSet.isEmpty())
		{
		  System.out.println("Set is empty before insertion");		
		}
		
		hashSet.add("dog");
		hashSet.add("cat");
		hashSet.add("bear");
		
		//Duplicates are not allowed in Sets where as in ArrayList duplicates are allowed.
		
		hashSet.add("cat");
		
		System.out.println(hashSet);
		
		for(String s: hashSet)
		{
			System.out.println(s);
		}
		
		if(hashSet.isEmpty())
		{
		  System.out.println("Set is empty after insertion");		
		}
		
		////Does Set contains a given element?/////
         
		if(hashSet.contains("venkat")){
		
			System.out.println("Contains Venkat");
		}
		
		if(hashSet.contains("cat")){
			System.out.println("Contains Cat");
		}
		
      Set<String> hashSet2 = new TreeSet<String>();	
		
			
		hashSet2.add("dog");
		hashSet2.add("cat");
		hashSet2.add("snake");
		
		/////Intersection///////
		Set<String> Intersection = new HashSet<String>(hashSet);
		//System.out.println(Intersection);
		Intersection.retainAll(hashSet2);
		System.out.println(Intersection);
		
		/////////Difference///////
		Set<String> Intersection1 = new HashSet<String>(hashSet);
		//System.out.println(Intersection);
		Intersection1.removeAll(hashSet2);
		System.out.println(Intersection1);
		
		System.out.println(hashSet);
		
		
		
		
		
	}

}
