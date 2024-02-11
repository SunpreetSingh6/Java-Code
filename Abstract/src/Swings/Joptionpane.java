package Swings;
import javax.swing.*;

public class Joptionpane {

	Joptionpane()
	{
		JFrame f = new JFrame("JOptionPane");
		JOptionPane.showMessageDialog(f, "HELLO", "Joptionpane",JOptionPane.ERROR_MESSAGE);
		/*String msg = JOptionPane.showInputDialog(f, "Name", "InputJOptionPane", JOptionPane.ERROR_MESSAGE);
		System.out.println(msg);
		JOptionPane.showConfirmDialog(f, "Are you sure?", "Confirm", JOptionPane.YES_NO_CANCEL_OPTION);*/
	}
	public static void main(String[] args) {
		new Joptionpane();
	}

}
