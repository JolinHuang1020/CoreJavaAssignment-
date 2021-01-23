package StreamAssignment;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fruit {

	
	private String fName;
	private int fCalories;
	private int fPrice;
	private String fColor;
	
	
	public String getfName() {
		return fName;
	}


	public void setfName(String fName) {
		this.fName = fName;
	}


	public int getfCalories() {
		return fCalories;
	}


	public void setfCalories(int fCalories) {
		this.fCalories = fCalories;
	}


	public int getfPrice() {
		return fPrice;
	}


	public void setfPrice(int fPrice) {
		this.fPrice = fPrice;
	}
	


	public String getfColor() {
		return fColor;
	}


	public void setfColor(String fColor) {
		this.fColor = fColor;
	}


	public Fruit(String fName, int fCalories, int fPrice, String fColor) {
		super();
		this.fName = fName;
		this.fCalories = fCalories;
		this.fPrice = fPrice;
		this.fColor = fColor;
	}


	
	@Override
	public String toString() {
		return "Fruit [fName=" + fName + ", fCalories=" + fCalories + ", fPrice=" + fPrice + ", fColor=" + fColor + "]";
	}


	public static void main(String[] args) {
		List<Fruit> fruits = Arrays.asList(
			
				new Fruit("orange", 150, 4, "orange"),
				new Fruit("watermelon", 100, 7, "red"),
				new Fruit("banana", 60, 1, "yellow"),
				new Fruit("avacado", 80, 1, "green"),
				new Fruit("apple", 120, 3, "red")
				
				);
	//Q1. Display the fruit names of low calories fruits i.e. calories < 100 sorted in 
	//	descending order of calories.		
		
		List<Fruit> descendCarlories= fruits.stream()
		.filter(f-> f.getfCalories()<100)		
		.sorted(Comparator.comparingInt(Fruit::getfCalories).reversed())
		.collect(Collectors.toList());
		
		descendCarlories.forEach(System.out::println);
		System.out.println("------------------------------------");
		
		
	//Q2. Display color wise list of fruit names. 
//what is color wise???????????????????????????????????////
		List<Fruit> colorWised= fruits.stream()
				.sorted(Comparator.comparing(Fruit::getfColor))
				.collect(Collectors.toList());
						
		colorWised.forEach(System.out::println);
		
		System.out.println("------------------------------------");
		
	//Q3. Display only RED color fruits sorted as per their price in ascending order
				
		 List<Fruit>sortedPriceList= fruits.stream()
				 .filter(f->f.getfColor()=="red")
				 .sorted(Comparator.comparingInt(Fruit::getfPrice))
				 .collect(Collectors.toList());
		 sortedPriceList.forEach(System.out::println);	 
		 System.out.println("------------------------------------");		 
	}

}
