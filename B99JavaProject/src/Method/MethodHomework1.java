package Method;

import java.util.Scanner;

public class MethodHomework1 {
	static int hour;
	static int min;
	static int second;
	static boolean continute = false;

	public static void main(String[] args) {
		do {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter hour");
		hour = sc.nextInt();
		System.out.println("Enter min");
	    min = sc.nextInt();
		System.out.println("Enter second");
	    second = sc.nextInt();
	    System.out.println("The format of the User :  "+hour+":"+min+":"+second);
	    
	    long totalTime = hms_to_secs(hour,min,second);
	    System.out.println("The total second :  "+ totalTime);
	    
	    
	    System.out.println("Want to continute Y/N");
	    int continued = sc.nextInt();
	    
	    if(continued=='y') {
	    	continute = false;
	    }else
	    System.out.println("Okey !!");
	    
	    
	    
		}while(continute==false);  
	}
	
	public static long hms_to_secs (int Hour, int Min, int Second ){
		long totalSecond = (Hour*3600) + (Min*60) + Second;
		
		return totalSecond;
	}

}
