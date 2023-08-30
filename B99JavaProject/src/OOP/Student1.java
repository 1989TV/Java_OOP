package OOP;

import java.util.Scanner;

public class Student1 {
	String name;
	String power;
	
	
	public Student1() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Dark Cosmic Name");
		name =  sc.nextLine();
		
		System.out.println("Enter the Cosmic Power");
		power = sc.nextLine();

}

	
	public static void main(String[] args) {
	Student1 student = new Student1();
	System.out.println(student.name);
	System.out.println(student.power);

	
		
	}
	

		

}
