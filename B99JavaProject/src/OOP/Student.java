package OOP;

public class Student {

	public Student() {
		System.out.println("This is constractor");
	}
	public Student(String name) {
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		Student st = new Student(); 
	}
	
	
	
}
