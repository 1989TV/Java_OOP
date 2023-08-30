package SampleProgram;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter length : ");
		int length = sc.nextInt();
		System.out.println("Enter width : ");
		int width = sc.nextInt();
		int area = length * width;
		System.out.println("Area of rectangle " + area);
		

	}

}
