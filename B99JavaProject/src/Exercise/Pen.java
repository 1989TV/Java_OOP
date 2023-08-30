package Exercise;

public class Pen {

	int size = 5;
	String color = "Dark Cosmic";
	int point = 10;
	static boolean Clicked = false;
	
	public static void Click() {
		Clicked = true;
}
	public static void Unclick() {
		Clicked = false;
	}
}
