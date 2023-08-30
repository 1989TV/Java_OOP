package SampleProgram;

import java.util.Scanner;

public class ExerciseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("How many day's temperature? ");
		int index = sc.nextInt();
		int [] high_temp = new int [index];
		
		for(int i = 0 ; i < 7 ; i++) {
			System.out.println("Enter temp of Day"+ (i+1) +":");
			high_temp[i]= sc.nextInt();
			System.out.println();
		}
	}
}
