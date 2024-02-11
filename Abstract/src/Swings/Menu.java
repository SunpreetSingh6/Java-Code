package Swings;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Menu implements ActionListener{

	JMenu file,edit,help;
	JMenuItem i1,i2,i3,i4; 
	JTextArea ta;
	Menu()
	{
		JFrame f = new JFrame("MENU PRACTICE");
		JMenuBar mb = new JMenuBar();
		file = new JMenu("File");
		edit = new JMenu("Edit");
		help = new JMenu("Help");
		i1 = new JMenuItem("Copy");
		i2 = new JMenuItem("Cut");
		i3 = new JMenuItem("Paste");
		i4 = new JMenuItem("Select all");
		i1.addActionListener(this);
		i2.addActionListener(this);
		i3.addActionListener(this);
		i4.addActionListener(this);
		edit.add(i1);edit.add(i2);edit.add(i3);edit.add(i4);
		mb.add(file);
		mb.add(edit);
		mb.add(help);
		f.add(mb);
		ta = new JTextArea();
		ta.setBounds(40, 30, 300, 300);
		f.add(ta);
		f.setJMenuBar(mb);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
		}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==i1)
			ta.copy();
		if(e.getSource()==i2)
			ta.cut();
		if(e.getSource()==i3)
			ta.paste();
		if(e.getSource()==i4)
			ta.selectAll();
	}
	
	public static void main(String[] args) {
		new Menu();

	}

}
