package Method;

import java.util.Scanner;

public class MethodExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number : ");
		int num =sc.nextInt();
		
		mutiplication(num);
	}
	
	public static void mutiplication(int num ) {
		for ( int i= 1; i <=12 ; i++) {
			System.out.println(num + " * "+ i + " = " + (num*i));
		}
	}
	
}
