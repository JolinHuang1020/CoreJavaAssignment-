package CollectionAssignment;

import java.util.TreeSet;

public class Person {
	
	private String pName;
	private double pWeight;
	private double pHeight;
	
	public Person(String pName, double pWeight, double pHeight) {
		super();
		this.pName = pName;
		this.pWeight = pWeight;
		this.pHeight = pHeight;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public double getpWeight() {
		return pWeight;
	}

	public void setpWeight(double pWeight) {
		this.pWeight = pWeight;
	}

	public double getpHeight() {
		return pHeight;
	}

	public void setpHeight(double pHeight) {
		this.pHeight = pHeight;
	}

	@Override
	public String toString() {
		return "Person [pName=" + pName + ", pWeight=" + pWeight + ", pHeight=" + pHeight + "]";
	}
	
	public static void main(String[] args) {
		
		
		
		
		

		TreeSet <Person> person = new TreeSet<>();
		person.add(new Person("Alex", 130, 5.70));
		person.add(new Person("Amy", 100, 5.00));
		person.add(new Person("Bob", 130, 5.80));
		person.add(new Person("David", 120, 5.80));
		
		System.out.println(person);
		
	
	
	}
	

}
