package ReStudying;

public class Nested_For_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i =1; i <=5; i++) {
			for (int j = 1; j<=10;j++) {
				System.out.print("*");
			}System.out.println();
		}
		
		//program execution
		for (int i = 0; i<=5;i++) {
			for (int j =1; j <=i; j++) {
				System.out.print("*");
			}System.out.println();
		}
		System.out.println("--------------------");
		
		for (int i = 0; i <= 10; i++) {
			for (int j = 10; j >= i; j--) {
				System.out.print("*");
			}System.out.println();
		}
	}

}
