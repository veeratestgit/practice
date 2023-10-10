package collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		ArrayList<String> cities = new ArrayList<>();
		//checking add() method
		cities.add("london");
		cities.add("paris");
		cities.add(2, "new delhi");
		cities.add("mumbai");
		//size of array
		System.out.println(cities.size());
		//print item in list
		for(String t:cities){
			System.out.println(t);
			}
	}
}

