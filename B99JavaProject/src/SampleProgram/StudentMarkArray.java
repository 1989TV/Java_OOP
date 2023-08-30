package SampleProgram;

public class StudentMarkArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] name = {"Su Su","Aung Aung","Zin Zin","Min Min","Khin Thu"};
		int [] marks = {89,88,99,100,20};
		for(int i = 0; i < name.length; i ++) {
			if (marks [i] >= 50) {
				System.out.println(name[i]+" : pass");
			}
			else
				System.out.println(name[i]+ " : fail");
		}
		
		String data = "Su Su";
		String data2 = "su sU";
		if (data2.equalsIgnoreCase(data))
			System.out.println("true");
		else 
			System.out.println("fale");
	}

}
