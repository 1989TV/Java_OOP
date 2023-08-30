package OOP;

public class Puppy {
	
	private int puppyAge;

	public static void main(String name) {
		System.out.println("Name chosen is " + name);
	}
	
	public void setAge(int age) {
		puppyAge = age;
	}
	public int getAge() {
		return puppyAge;
	}
	
	public static void main(String[] args) {
		Puppy myPuppy = new Puppy();
		
		myPuppy.setAge(2);
		
		System.out.println("Puppy's age is "+ myPuppy.getAge());
	}
}
