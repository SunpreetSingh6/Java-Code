package Swings;
import javax.swing.*;
import java.awt.event.*;

public class FoodOrder extends JFrame implements ActionListener {
	
	JLabel l;
	JButton b;
	JCheckBox c1,c2,c3,c4,c5;
	JRadioButton rb1,rb2;
	public FoodOrder()
	{
		l = new JLabel("Food Ordering system ");
		l.setBounds(100,50,150,40);
		b = new JButton("Order");
		b.setBounds(100, 250, 70, 40);
		rb1=new JRadioButton("Male"); 
		rb1.setBounds(100, 80, 70, 40);
		rb2=new JRadioButton("Female"); 
		rb2.setBounds(170, 80, 70, 40);
		ButtonGroup bg=new ButtonGroup();    
		b.addActionListener(this);
		c1 = new JCheckBox("Burger @ 145");
		c1.setBounds(100, 120, 150, 20);
		c2 = new JCheckBox("Pizza @ 350");
		c2.setBounds(100, 140, 150, 20);
		c3 = new JCheckBox("Sandwich @155");
		c3.setBounds(100, 160, 150, 20);
		c4 = new JCheckBox("Drinks @150");
		c4.setBounds(100, 180, 150, 20);
		c5 = new JCheckBox("IceCreame @100");
		c5.setBounds(100, 200, 150, 20);
		add(l);add(b);add(c1);add(c2);add(c3);add(c4);add(c5);bg.add(rb1);bg.add(rb2);add(rb1);add(rb2);
		setSize(400,400);
		setLayout(null);
		setVisible(true);
	}
		
		public void actionPerformed(ActionEvent e)
		{
			float amt=0;
			String msg="";
			if(rb1.isSelected())
			{
				msg += "Male\n";
			}
			if(rb2.isSelected())
			{
				msg += "Female\n";
			}
			if(c1.isSelected())
			{	amt += 145;
				msg += "Burger @145\n";
			}
			if(c2.isSelected())
			{	amt += 350;
				msg += "Pizza @350\n";
			}
			if(c3.isSelected())
			{	amt += 155;
				msg += "Sandwich @155\n";
			}
			if(c4.isSelected())
			{	amt += 150;
				msg += "Drinks @150\n";
			}
			if(c5.isSelected())
			{	amt += 100;
				msg += "IceCreame @100\n";
			}
			msg += "-------------------------\n";
			JOptionPane.showMessageDialog(this,msg+"Total: "+amt); 
	}

	public static void main(String[] args) {
		
	new FoodOrder();	

	}

}
