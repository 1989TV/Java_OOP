package ReStudying;

import java.util.Scanner;

public class TypeConvention {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a = 1;
		//double b = a;
		//System.out.println(b);
		
		//float b = 35;
		//double z = b ;
		
		Scanner sc = new Scanner (System.in);
		
		
		
			System.out.println("Enter Username");
			String username = sc.nextLine();
			System.out.println("Enter Password");
			String password = sc.nextLine();
			if (username.equals("maungmaung") && password.equals( "123")) {
				System.out.println("Correct !");
			
			
		}
		
	}

}
