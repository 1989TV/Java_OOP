package AbstactClass;

public class MainClass {
	public static void main (String[] args) {
		Salary sa = new Salary ("Mg Mg", "Lan Gyo Lan Gar", 3, 10000);
		Employee em = new Salary ("Ma Ma", "Hledan", 5, 20000);
		System.out.println(sa.computePay());
		System.out.println(em.computePay());
		
	}
}
