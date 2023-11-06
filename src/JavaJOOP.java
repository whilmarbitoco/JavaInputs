/*
JavaJOOP -- Java JOptionPane
*/

import javax.swing.JOptionPane;

public class JavaJOOP {
	
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What is your name?");
		
		JOptionPane.showMessageDialog(null, "Hello, " + name);
	}

}
