package OOP;

public class Animal {
	private String name;
	private int height;
	
	private String gender;
	
	public String getgender(String something) {
		this.gender = something;
		return this.gender;
	}
	
	public void getAnimal() {
		name = "Aung Net";
		height = 4;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog = new Animal();
		dog.getAnimal();
		System.out.println(dog.name);
		System.out.println(dog.height);
		dog.getgender("male");
		System.out.println(dog.getgender("female"));
		
	}

}
