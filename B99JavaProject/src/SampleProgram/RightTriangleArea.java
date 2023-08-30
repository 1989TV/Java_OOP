package SampleProgram;

import java.util.Scanner;

public class RightTriangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Hypotenuse : ");
		int H = sc.nextInt();
		System.out.println("Enter Perpemdicular : ");
		int P = sc.nextInt();
		System.out.println("Enter Base : ");
		int B = sc.nextInt();
		
		if (H*H==(P*P)+(B*B)){
			System.out.println("Right Triangle");
		}
		else {
			System.out.println("Not Right Triangle");
		}
	}

}
