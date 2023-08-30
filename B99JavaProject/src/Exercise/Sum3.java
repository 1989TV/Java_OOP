package Exercise;

import java.util.Scanner;

public class Sum3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the numbers of first number");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the numbers of second number");
		int num2 = sc.nextInt();
		int sum = num1 + num2;
		
		System.out.println("Answers : "+ sum);
		
		System.out.println("Enter the numbers of frist number : " + num1);
		System.out.println("Enter the numbers of second number : " + num2);
		
		for(int i = 1; i <=10 ; i++){
			System.out.print("*");
		}System.out.println();

	}
	
	
}
