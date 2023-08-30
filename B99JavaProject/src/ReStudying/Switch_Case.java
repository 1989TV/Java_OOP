package ReStudying;

import java.util.Scanner;

public class Switch_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = true;
		Scanner sc = new Scanner (System.in);
		
		do {
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter Second number");
		int b = sc.nextInt();
		System.out.println("Chose one of the + , - , / , * ");
		String con = sc.next();
		switch(con) {
		case "+":
			int sum = a + b;
			System.out.println("The sum "+ sum);
			flag = false;
			break;
		case "-":
			int sub = a - b;
			System.out.println("The sub "+ sub);
			flag = false;
			break;
		case "*":
			int multi = a * b;
			System.out.println("The multi "+ multi);
			flag = false;
			break;
		case "/":
			int div = a / b;
			System.out.println("The div "+ div);
			flag = false;
			break;
			default:
				System.out.println("Wrong !!");
				flag = true;
			break;	
		}while(flag == true);		
		}
	}

}
