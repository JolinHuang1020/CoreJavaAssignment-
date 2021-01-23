package StreamAssignment;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Trader {
	private String name; 
	private String city;
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	@Override
	public String toString() {
		return "Trader [name=" + name + ", city=" + city + "]";
	}



	public Trader(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}



	public static void main(String[] args) {
		List<Trader> trader =Arrays.asList(
				
				new Trader("Amy", "Paris"),
				new Trader("Bob", "Pune"),
				new Trader("John", "Indore"),
				new Trader("Sam", "Pune")
					
				);
		
		
		//Q9. What are all the unique cities where the traders work? 
//not working.............................................	
		List<Trader>uniqueCity=trader.stream()
				.distinct()
				.collect(Collectors.toList());
		
		uniqueCity.forEach(c->System.out.println(c.getCity()+" "));
		
		System.out.println("--------------------------------");
		//Q10. Find all traders from Pune and sort them by name. 
		List<Trader> puneList = trader.stream()
				.filter(t->t.getCity().equals("Pune"))
				.sorted(Comparator.comparing(Trader::getCity))
				.collect(Collectors.toList());
		puneList.forEach(System.out::println);
		System.out.println("--------------------------------");
		
		
		//Q11. Return a string of all traders’ names sorted alphabetically. 
		List<Trader>nameList=trader.stream()
				.sorted(Comparator.comparing(Trader::getName))
				.collect(Collectors.toList());
		nameList.forEach(n->System.out.print(n.getName()+" "));
		System.out.println("\t");
		System.out.println("--------------------------------");
		
		
		//Q12. Are any traders based in Indore? 
		List<Trader> basedIndore = trader.stream()
				.filter(c->c.getCity().equals("Indore"))
				.collect(Collectors.toList());
		basedIndore.forEach(c->System.out.println(c.getName()));
	}



	

}
