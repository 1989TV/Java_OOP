package SampleProgram;

import java.util.Scanner;

public class ArrayExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner (System.in);
		System.out.println("Enter the number of row : ");
		int row = sc.nextInt();
		System.out.println("Enter the number of column : ");
		int column = sc.nextInt();
		
		int[][]A = new int [row][column];
		
		for (int i= 0; i < row; i++) {
			for (int j= 0; j < column; j++) {
				System.out.print("Enter a value");
				A[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Display data array : ");
		for (int i= 0; i < A.length; i++) {	//A.length = the number of row
			for (int j= 0; j < A[i].length; j++)	//A[i].length = the number of column
				System.out.print(A[i][j]+" ");
			System.out.println();
		}

	}

}
