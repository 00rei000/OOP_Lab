package Lab1;

import javax.swing.JOptionPane;

//Example 3: HelloNameDialog.java
public class HelloNameDialog {
	public static void main(String args[]) {
		String result;
		result = JOptionPane.showInputDialog("Phuc Thanh please enter your name:");
		JOptionPane.showMessageDialog(null, "Toi la Phuc Thanh. Hi " + result + "!");
		System.exit(0);
	}
}
