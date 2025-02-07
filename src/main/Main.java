package main;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//CONSTRUCTOR = A special method to initialize objects
		//You can pass arguments to a constructor
		//And set up initial values
		
		Student student1 = new Student("Spongebob", 30, 3.2);
		Student student2 = new Student("Patrick", 34, 1.5);
		Student student3 = new Student("Sandy", 27, 4.0);
		
		student1.study();
		student2.study();
		student3.study();
				
	}
	
}
