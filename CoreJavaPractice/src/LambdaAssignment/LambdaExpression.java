package LambdaAssignment;


import java.util.Arrays;
import java.util.List;
import java.util.function.*;

import CollectionAssignment.Person;

public class LambdaExpression {

	public static void main(String[] args) {
		//Q1--------------------
		//1.Write  an  application  to  perform  basic  arithmetic  operations  
		//like  add, subtract, multiply & divide. You need to define a functional 
		//interface first.
		
		MyAdd mA = (int x, int y)-> x+y;
		System.out.println(mA.addResult(1, 2));
		
		MySubtract mS = (int x, int y)-> x-y;
		System.out.println(mS.subtractResult(6, 2));
		
		MyMultiply mP= (int x, int y)-> x*y;
		System.out.println(mP.multilpfyResult(5, 2));
		
		MyDivide mD= (int x, int y)-> x/y;
		System.out.println(mD.divideResult(6, 3));
		System.out.println("-----------------------------------");
		
		
		//Q2 Write  an  application  using  lambda  expressions  to  print  Orders  having  
		//2 criteria  implemented:  1)  order  price  more  than  10000  
		//2)  order  status  is ACCEPTED or COMPLETED.		
		
		
		
		
		
		
		
		//Q3-----------------
		//Use  the  functional  interfaces  Supplier,  Consumer,  
		//Predicate  &  Function  to invoke built-in methods from Java API.
		
		List<Person> person = Arrays.asList(
				new Person("Alex", 130, 5.70),
				new Person("Amy", 100, 5.00),
				new Person("Bob", 130, 5.80),
				new Person("David", 120, 5.80)
				);
		//System.out.println("Print all persons");
		//person.forEach(System.out::print);

	
//		Consumer<Person> consumer = i -> System.out.println(i);
//		printList(person, consumer);
//		
//		public static void printList(List<Person> person, Consumer<Person>consumer) {
//			for(Person p: person) {
//				consumer.accept(p)
//			}
//		}
//
//		System.out.println("----------------------------------");
//        Supplier<Double> randomValue = () -> Math.random(); 
//        System.out.println(randomValue.get());
//	
        
        
		
        
        //Q4 Remove the words that have odd lengths from the list. 
        //       HINT: Use one of the new methods from JDK 8. 
        //      Use removeIf() method from Collection interface.  

		
//why not working???
		List<String>list = Arrays.asList(
				new String("Apple"),
				new String("Orange"),
				new String("Pear")
				);
		Predicate<String> pr= p-> (p.length()%2!=0);
		List<String> subList = list;
		subList.removeIf(pr);
		System.out.println(subList);
        
        //Q5Create  a  string  that  consists  of  the  first  letter  of  
        //each  word  in  the  list  of Strings   provided.   
        //HINT:   Use   Consumer   interface   &   a   StringBuilder   to construct the result.      
        
        
        
        
        //Q6 Replace   every   word   in   the   list   with   its   upper   
        //case   equivalent.   Use replaceAll() method & UnaryOperator interface.
        
        
        
        
        
        
        //Q7Convert every key-value pair of the map into a string and append 
        //them all into a single string, in iteration order.
        //HINT: Use Map.entrySet() method & a StringBuilder to construct the result String.
        
        
        
        
        //Q8 Create a new thread that prints the numbers from the list. 
        //Use class Thread & interface Consumer.
        
        
        
        
        
        
}
		


//Q3 interface

	
	
	
	
	
	
	
	
	
	
	
//Q1 interface-----	
	@FunctionalInterface		
	interface MyAdd{
		int addResult(int x, int y);
	}

	@FunctionalInterface		
	interface MySubtract{
		int subtractResult(int x, int y);
	}
	
	@FunctionalInterface		
	interface MyMultiply{
		int multilpfyResult(int x, int y);
	}
	
	
	@FunctionalInterface		
	interface MyDivide{
		int divideResult(int x, int y);

	}
//Q1 interface-----	
	
}

