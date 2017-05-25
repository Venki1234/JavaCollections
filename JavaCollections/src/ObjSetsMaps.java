import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

class Person
  {
	 private int id;
	 private String name;
	 
	 public Person(int id, String name)
	 {
		 this.id = id;
		 this.name = name;
	 }
	 
	 public String toString()
	 {
		 return +id+ ":" + name;
	 }

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	 	 
  }


public class ObjSetsMaps {

	public static void main(String args[])
	{
		
		Person p1 = new Person(0,"bob");
		Person p2 = new Person(1,"venki");
		Person p3 = new Person(2,"venkat");
		Person p4 = new Person(1,"venki");
		
		Map<Person, Integer> map = new HashMap<Person, Integer>();
		map.put(p1,1);
		map.put(p2,2);
		map.put(p3,3);
		map.put(p4,1);
		
		for(Person key:map.keySet())
		{
			System.out.println("{key is:" +key+"}" + " and value is:" +map.get(key));
		}
		
		Set<Person> map1 = new LinkedHashSet<Person>();
		map1.add(p1);
		map1.add(p2);
		map1.add(p3);
		map1.add(p4);
		
		for(Person key1:map1)
		{
			System.out.println(key1);
		}
	}
}
