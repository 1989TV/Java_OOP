package OOP;

class Calculation {
	int z;
	public void addition (int x, int y) {
		z = x+y;
		System.out.println("The sum o the given numbers "+z);
	}
	
	public void subtraction (int x, int y) {
		z = x-y;
		System.out.println("The different between two numbers "+z);
	}
}
class My_Caculation extends Calculation{
	public void multiplition(int x , int y) {
		z = x*y;
		System.out.println("The multiplition between two numbers "+z);
	}
	public static void main(String[] args) {
		int a = 20; 
		int b = 10;
		My_Caculation demo = new My_Caculation();
		demo.addition(a,b);
		demo.subtraction(a,b);
		demo.multiplition(a, b);
	}


}