package main;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//VARARGS = allow a method to accept varying number of arguments
		//No need for overloaded methods
		//Java will pack arguments into an array
		
		System.out.println(add(1, 2, 3, 4));
		
	}
	
	static int add(int... numbers) {
		
		int sum = 0;
		
		for(int number : numbers) {
			sum += number;
		}
		
		return sum;
		
	}

}
