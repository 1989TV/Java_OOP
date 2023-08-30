package SampleProgram;

import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Base : ");
		int Base = sc.nextInt();
		System.out.println("Enter Hight : ");
		int Hight = sc.nextInt();
		int area = (Base * Hight)/2;
		System.out.println("Area of triangle : " + area);
		
	}

}
