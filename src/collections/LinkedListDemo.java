package collections;

import java.util.LinkedList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> cities = new LinkedList<>();
		cities.add("london");
		cities.add("paris");
		cities.add(2, "new delhi");
		cities.add("mumbai");
		System.out.println(cities.size());
		java.util.Iterator<String> itr = cities.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(cities.get(1));
		System.out.println();

	}

}
