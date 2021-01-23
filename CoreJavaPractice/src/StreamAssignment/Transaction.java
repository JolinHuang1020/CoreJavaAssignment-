package StreamAssignment;

import java.util.Arrays;
import java.util.List;

public class Transaction {

	private Trader trader; 
	private int year; 
	private int value;
	
	public Trader getTrader() {
		return trader;
	}

	public void setTrader(Trader trader) {
		this.trader = trader;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Transaction [trader=" + trader + ", year=" + year + ", value=" + value + "]";
	}

	public Transaction(Trader trader, int year, int value) {
		super();
		this.trader = trader;
		this.year = year;
		this.value = value;
	}

	public static void main(String[] args) {
		
		
//		List<Transaction>transac = Arrays.asList(
//				new Transcation()
//				
//				);
	
	//Q8. Find all transactions in the year 2011 and sort them by value (small to high). 
		
		
		
	//Q13. Print all transactions’ values from the traders living in Delhi. 
		
	//Q14. What’s the highest value of all the transactions? 
		
    //Q15. Find the transaction with the smallest value	
		
	}

}
