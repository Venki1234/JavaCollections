import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CompareList {
 public static void main(String args[])
 {
	 ArrayList<Integer> arrayList = new ArrayList<Integer>();//sequential
	 LinkedList<Integer> linkedList = new LinkedList<Integer>();//having the reference of previous and next nodes
	 
	 doTimings("ArrayList", arrayList);
	 doTimings("LinkedList", linkedList);
	 
 }
 
 private static void doTimings(String type, List<Integer> list)
 {
	 for(int i=0;i<1E5;i++)
	 {
		 list.add(i);
	 }
	 Long start = System.currentTimeMillis();
	 
	 
	 for(int i=0;i<1E5;i++)
	 {
		 //list.add(list.size()-100,i);
		 //list.add(i);
		 list.add(0,i);
		 
	}
	 
	 Long end = System.currentTimeMillis();
	 
	 System.out.println("The time taken is: "  +(end-start)+ "ms for " + type);
	 
 }
}
