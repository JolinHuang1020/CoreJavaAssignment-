package CollectionAssignment;

import java.util.Comparator;
import java.util.TreeSet;

public class Q1TreeSet{

	//Q1 sort person in sorted order based on weight, 
	//if two person have same weights, sorted based on height
	
	public static void main(String[] args) {
		
//		Person p1 = new Person("Alex", 130, 5.70);
//		Person p2 = new Person("Amy", 100, 5.00);
//		Person p3 = new Person("Bob", 130, 5.80);
//		Person p4 = new Person("David", 120, 5.80);
		
		TreeSet <Person> person = new TreeSet<>();
		person.add(new Person("Alex", 130, 5.70));
		person.add(new Person("Amy", 100, 5.00));
		person.add(new Person("Bob", 130, 5.80));
		person.add(new Person("David", 120, 5.80));
		
		
		perosn.forEach(System.out::println);
	
		
//		while(person.hasNext()) {
//			System.out.println(person.next());
//		}
		
		
//class comp implements Comparator<Person> {
//	
//}
	}

}
