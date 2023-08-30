package Method;

import java.util.Scanner;

public class MethodExample2 {
	
	static int ft;
	static float inches;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float ft1 = InputData();
		float ft2 = InputData();
		
		float resultfeet = add (ft1, ft2);
		
		display (resultfeet);
	}
	public static float InputData(){
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter feet : ");
	ft =  sc.nextInt();
	System.out.print("Enter Inches : ");
	inches = sc.nextFloat();
	
	if(inches >= 12 ) {
		ft++; //ft +=1;
		inches-= 12;
	}
	
		float feet = convertFeet();
		return feet;
		//return convertFeet();
	}	
	public static float convertFeet() {
		return  ft + ( inches/12 );
	}
	public static float add(float ft1, float ft2) {
		return ft1+ft2;
	}
	public static void display (float resultfeet) {
		System.out.println("Result = "+ resultfeet);
	}
}
