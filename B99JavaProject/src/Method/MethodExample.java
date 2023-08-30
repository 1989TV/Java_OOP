package Method;

import java.util.Scanner;

public class MethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter first name : ");
		int num1 = sc.nextInt();
		System.out.println("Enter second name : ");
		int num2 = sc.nextInt();
		
		
		max(num1,num2); //actual parameter pass by value
		System.out.println("End Program");
		
	}
	public static void max(int n1, int n2) { //formal parameter
		if ( n1 > n2 )
			System.out.println("Maxinum value= " + n1);
		else 
			System.out.println("Maxinum value= " + n2);
	}

}
