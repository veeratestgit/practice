package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	
	/*storing data as key and value pair (key:value),unique key,duplicate values,any kind of data type,it can have
	 * many values with data as null,dosenot store in index
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> hm = new HashMap<>();
		
		hm.put("Ram", 12345);  // storing kay and value
		hm.put("Marc", 35345);
		hm.put("John", 5345);
		hm.put("Jaya", 5345);
		hm.put("James", 34535);
		
		// print the values of the Hash map
		// it retrievs all the values but doesnot maintain sequence
		// duplicate values not allowed
		
		/*
		 * for(Entry m: td.entrySet()) { System.out.println(m.getKey() + " - " +
		 * m.getValue()); }
		 */
		// a key and value is called as Entry and we use entry interafce
		// it has an EntrySet method which return values as a Set
		
		Set set = hm.entrySet();
		
		//System.out.println(set);  // square braces indicates as a single set
		
	// the set can use a method called as iterator to iterate over the set of values and print them
		
		Iterator itr = set.iterator();
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
		
		// remove methods
		
		hm.remove("Marc"); // Remves the key marc and its value
	}
}