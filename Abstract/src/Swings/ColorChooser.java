package Swings;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ColorChooser implements ActionListener
{

	JFrame f ;
	JButton b;
	JTextArea ta;
	ColorChooser()
	{
		f = new JFrame("ColorChooser");
		b = new JButton("Fill Color");
		b.setBounds(200, 300, 100, 40);
		ta = new JTextArea();
		ta.setBounds(10, 10, 250, 250);
		ta.setToolTipText("Enter Text");
		f.add(b);f.add(ta);
		b.addActionListener(this);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		Color c = JColorChooser.showDialog(ta,"Chose",Color.BLUE);
		ta.setBackground(c);
		
	}
	public static void main(String[] args) {
		new ColorChooser();

	}

}
