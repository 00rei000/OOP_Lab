package Lab1;

import javax.swing.JOptionPane;


public class ChoosingOption {
	public static void main(String args[]) {
		int option = JOptionPane.showConfirmDialog(null,
				"Phuc Thanh - Do you want to change to the first class ticket?");
		JOptionPane.showMessageDialog(null,
				"Phuc Thanh - You've chosen: " + (option == JOptionPane.YES_OPTION ? "Yes" : "NO"));
		System.exit(0);
	}
}