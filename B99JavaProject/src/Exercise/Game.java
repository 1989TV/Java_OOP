package Exercise;

public class Game {

	int Game_size = 10;
	String Game_name = "Wild Rift";
	String [] Game_Charactar = { "Lux", "Jinx", "Filora", "Sett", "Ahri" };
	
	static boolean entered = false;
	static int levels = 0;
	
	public static void enter () {
		entered = true;
	}
	
	public static void unenter () {
		entered = false;
	}
	
	public static void level_up() {
		levels++;
	}
	
	public static void level_down() {
		levels--;
	}
}
