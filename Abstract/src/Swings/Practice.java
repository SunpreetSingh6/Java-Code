package Swings;
import java.awt.event.*;
import javax.swing.*;

public class Practice  
{
	JFrame f;
	JButton b1,b2;
	JTextField tf;
	JTextArea ta;
	JLabel l1,l2,l3,l4;
	public Practice()
	{
		f = new JFrame("First Application");
		b1 = new JButton("Click Me :)");
		b2 = new JButton("Count Words");
		tf = new JTextField();
		ta = new JTextArea("Hello");
		l1 = new JLabel("Message");
		l2 = new JLabel("Characters :-");
		l3 = new JLabel("Words :-");
		tf.setBounds(130, 50, 180, 40);
		ta.setBounds(130, 100, 180, 100);
		l1.setBounds(30,50, 100,30);
		l2.setBounds(30,120, 100,30);
		l3.setBounds(30,100, 100,30);
		b1.setBounds(330,50,120,40);
		b2.setBounds(330,100,120,40);
		String country[] = {"America","USA","Canada","NewZealand","HongKong"};
		JComboBox cb = new JComboBox(country);
		cb.setBounds(130, 210, 100, 30);
		l4 = new JLabel("Country:- ");
		l4.setBounds(30, 210, 100, 30);
		b1.addActionListener(new ActionListener()
		{  
			 public void actionPerformed(ActionEvent e)
			 {  
				 tf.setText("Hello Ji SSA ");  
			 }  
		}			);
		b2.addActionListener(new ActionListener()
		{
			 public void actionPerformed(ActionEvent e)
			 {
				 String text = ta.getText();
				 String words[] = text.split("\\s");
				 l3.setText("Words :-"+ words.length);
				 l2.setText("Characters :-"+text.length());
				 
				 
			 }
		}	);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(tf);
		f.add(b1);
		f.add(b2);
		f.add(ta);
		f.add(cb);
		f.setSize(500, 500);
		f.setLayout(null);
		f.setVisible(true);

	}
	
	
	public static void main(String[] args) {
		new Practice();
	}
}
