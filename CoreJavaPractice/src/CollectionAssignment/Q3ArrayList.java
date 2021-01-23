package CollectionAssignment;

import java.util.*;

public class Q3ArrayList {
	
	//Q3 print ArrayList backward
	
	public static void main(String[] args) {
		
		List<Integer> aList = new ArrayList<>();
		aList.add(1);
		aList.add(2);
		aList.add(3);
		aList.add(4);
		aList.add(5);
		
		ListIterator<Integer> iterator =aList.listIterator();
		//System.out.println(aList);
		//System.out.println("----------------------");
		
		
		while(iterator.hasNext()) {
			//System.out.println("The forward is "+ iterator.next());
			iterator.next();
		}
		//System.out.println("----------------------");
		
		
		while(iterator.hasPrevious()) {
			System.out.println("The backward is "+ iterator.previous());
		}
		

	}

}
