package Method;



public class MethodExample6 {
	
	int a,b;
	
	public  MethodExample6 (int a , int b) {
		this.a = a;
		this.b = b;
	}
	
	public static void main(String[] args) {
		
		 MethodExample6 ME6 = new  MethodExample6 (10,20);
		 
		 System.out.println("Before Swapping");
		System.out.println("ME6 a = "+ME6.a+ " " +" ME6 b = "+ME6.b);
		 
		 swap (ME6);
		
		System.out.println("After Swapping");
		System.out.println(ME6.a+ " " +ME6.b);
	}
	
	public static void swap ( MethodExample6 ME6_1) {
		int temp = ME6_1.a;
		ME6_1.a = ME6_1.b;
		ME6_1.b = temp;
	}

}
