package Swings;
import java.awt.*;
import javax.swing.*;

public class Jpanel extends JFrame 
{
	public Jpanel()
	{
		JPanel p = new JPanel();
		p.setBounds(100,100,200,200);
		p.setBackground(Color.BLACK);
		p.setLayout(null);
		setContentPane(p);
		add(p);
		
		setSize(400,400);
		setLayout(null);
		setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new Jpanel();
	}

}
