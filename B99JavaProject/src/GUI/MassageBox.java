package GUI;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MassageBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner sc = new Scanner (System.in);
		System.out.println("Enter username: ");
		String username = sc.nextLine();
		System.out.println("Enter Password: ");
		String pw  = sc.next();*/
		
		String username = "Admin";
		String pw = "34!@#";
		
		if(username.equals("Admin") && pw.equals("123!@#"))
			JOptionPane.showMessageDialog(null, "Login Successfully");
		
		else {
			JOptionPane.showConfirmDialog(null, "Invalid Login", "Login Error", JOptionPane.ERROR_MESSAGE);
			JOptionPane.showConfirmDialog(null, "Info", "Login Error", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showConfirmDialog(null, "plain", "Login Error",JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
			JOptionPane.showConfirmDialog(null, "ques", "Login Error", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
			JOptionPane.showConfirmDialog(null, "aa");
			
	}
		int option = JOptionPane.showConfirmDialog(null, "Do another yes/no ? ");
		if(option == 0)
			JOptionPane.showConfirmDialog(null, "Do you remove item? ", "Delete title", JOptionPane.OK_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
		
		else if (option == 1)
			JOptionPane.showConfirmDialog(null, "No");
		
		else if (option == 2)
			JOptionPane.showConfirmDialog(null, "Cancel");
		
		int yes = JOptionPane.YES_OPTION;
		int no  = JOptionPane.NO_OPTION;
		int cancel = JOptionPane.CANCEL_OPTION;
		JOptionPane.showMessageDialog(null, yes+" "+no+" "+cancel);
		
		String name =  JOptionPane.showInputDialog(null, "Enter your name");
		String age = JOptionPane.showInputDialog(null, "Enter your age", "Age title", JOptionPane.INFORMATION_MESSAGE);
		
		if(name.equals("Admin")&& age.equals("34"))
			JOptionPane.showMessageDialog(null, "Login successfully");
	}
	
	

}
