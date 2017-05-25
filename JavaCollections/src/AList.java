import java.util.ArrayList;
import java.util.LinkedList;

public class AList {
	
	public static void main(String args[])
	{
		ArrayList<Integer> number = new ArrayList<Integer>();
		LinkedList<Integer> Lnumber = new LinkedList<Integer>();
		
		Lnumber.add(1);
		Lnumber.add(2);
		Lnumber.add(3);
 		number.add(10);
		number.add(100);
		number.add(100);
		number.add(10);
		
	
		System.out.println(number.get(0));
		System.out.println(Lnumber.get(1));
		
		
		for(Integer value: number)
		{
			
			System.out.println(value);
		}
		
		number.remove(number.size()-1);
		
		for(Integer value: number)
		{
			
			System.out.println(value);
		}
		
		
		
	}

}
