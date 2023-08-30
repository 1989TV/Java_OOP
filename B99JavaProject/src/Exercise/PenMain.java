package Exercise;

public class PenMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pen P = new Pen ();
		System.out.println(P.color);
		System.out.println(P.point);
		System.out.println(P.size);
		
		System.out.println(P.Clicked);
		
		P.Click();
		
		System.out.println(P.Clicked);
		
		P.Unclick();
		
		System.out.println(P.Clicked);
		
		Game G = new Game();
		System.out.println(G.Game_name);
		System.out.println(G.Game_size);
		System.out.println(G.Game_Charactar); // Why ?
		
		System.out.println(G.entered);
		
		G.enter();
		
		System.out.println(G.entered);
		
		G.unenter();
		
		System.out.println(G.entered);
		
		System.out.println(G.levels);
		
		G.level_up();
		
		System.out.println(G.levels);
		
		G.level_down();
		
		System.out.println(G.levels);
		
		Lux_Dark LD = new Lux_Dark();
		
		System.out.println(LD.ILoveLux());
		
		Anti_Hero AH = new Anti_Hero();
		AH.Taylor();
	}

}
