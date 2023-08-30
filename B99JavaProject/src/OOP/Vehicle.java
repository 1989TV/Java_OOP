package OOP;

	class Vehicle{
		protected String brand = "Ford";
		public void honk() {
			System.out.println("Tuut , tuuut!!!");
		}
	}
	
	class Car extends Vehicle {
		private String modelName = "Mustang";
		public static void main(String[] args) {
			Car1 MyCar = new Car1();
			MyCar.honk();
			System.out.println(MyCar.brand+" "+MyCar.modelName);

		}
	}
	

