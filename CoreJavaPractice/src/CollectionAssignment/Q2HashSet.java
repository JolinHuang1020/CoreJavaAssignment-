package CollectionAssignment;

import java.util.*;

public class Q2HashSet {

	public static void main(String[] args) {
		//prove HashSet in unordered
		
		HashSet<String> hs = new HashSet<>();
		hs.add("Monday");
		hs.add("Tuesday");
		hs.add("Wednesday");
		hs.add("Thursday");
		hs.add("Friday");
	
		Iterator <String> itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());	
		}
	  
		System.out.println("-------------------");
		
		//prove LinkedHashSet is ordered
		
		LinkedHashSet <String> lhs = new LinkedHashSet<>();
		lhs.add("Monday");
		lhs.add("Tuesday");
		lhs.add("Wednesday");
		lhs.add("Thursday");
		lhs.add("Friday");
		
		Iterator <String> itr2 = lhs.iterator();
		 while (itr2.hasNext()) {
			 System.out.println(itr2.next());
		 }
		
		
	

	}


}
