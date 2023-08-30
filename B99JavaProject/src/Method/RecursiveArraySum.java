package Method;

import java.util.Scanner;

public class RecursiveArraySum {
	static Scanner sc = new Scanner (System.in);
	
	
	public static void main(String[] args) {
		int [] A = new int [5];
		input(A,A.length);
	}
	
	public static void input(int[]a,int n) {
		for(int i = 0; i < n; i-- ) {
			System.out.print("Enter (5) value: ");
			a[i]= sc.nextInt();
		}
	}
	public static int Sum (int s) {
		if (s == 0)
			return 0;
		else
			return s + Sum(s-1);
	}

}
