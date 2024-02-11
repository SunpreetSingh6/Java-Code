package Swings;
    import javax.swing.*;  
    import java.awt.event.*;
    
    public class SimpleCalculator implements ActionListener
    {  
    	JTextField t1,t2,t3;
    	JButton b1,b2,b3,b4,n1,n2,n3,n4,n5,n6,n7,n8,n9;
    	JLabel num1,num2;
    	
    	public SimpleCalculator()
    	{
	    	JFrame j = new JFrame("Simple Calculator");
	    	num1 = new JLabel("Number 1");
	    	num1.setBounds(50,35,100,10);
			t1 = new JTextField();
			t1.setBounds(50,50,230,20);
			num2 = new JLabel("Number 2");
	    	num2.setBounds(50,85,100,10);
			t2 = new JTextField();
			t2.setBounds(50,100,230,20);
			t3 = new JTextField();
			t3.setBounds(50,150,230,20);
			t3.setEditable(false);
			
			n1 = new JButton("1");
			n1.setBounds(50,190,50,30);
			n2 = new JButton("2");
			n2.setBounds(140,190,50,30);
			n3 = new JButton("3");
			n3.setBounds(230,190,50,30);
			
			n4 = new JButton("4");
			n4.setBounds(50,250,50,30);
			n5 = new JButton("5");
			n5.setBounds(140,250,50,30);
			n6 = new JButton("6");
			n6.setBounds(230,250,50,30);
			
			n7 = new JButton("7");
			n7.setBounds(50,310,50,30);
			n8 = new JButton("8");
			n8.setBounds(140,310,50,30);
			n9 = new JButton("9");
			n9.setBounds(230,310,50,30);
			
			b1 = new JButton("+");
			b1.setBounds(50,370,50,30);
			b2 = new JButton("-");
			b2.setBounds(110,370,50,30);
			b3 = new JButton("*");
			b3.setBounds(170,370,50,30);
			b4 = new JButton("/");
			b4.setBounds(230,370,50,30);
			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
			b4.addActionListener(this);
			
			j.add(num1);j.add(num2);
			j.add(n1);j.add(n2);j.add(n3);j.add(n4);j.add(n5);j.add(n6);j.add(n7);j.add(n8);j.add(n9);
			j.add(t1);j.add(t2);j.add(t3);j.add(b1);j.add(b2);j.add(b3);j.add(b4);
			j.setSize(380,500);
			j.setLayout(null);
			j.setVisible(true);
    	}         
        public void actionPerformed(ActionEvent e) {  
        	
        	
        	
            String s1=t1.getText();  
            String s2=t2.getText();  
            int a=Integer.parseInt(s1);  
            int b=Integer.parseInt(s2);  
            float c=0;  
            if(e.getSource()==b1)
            {  
                c=a+b;  
            }
            else if(e.getSource()==b2)
            {  
                c=a-b;  
            }  
            else if(e.getSource()==b3)
            {  
                c=a*b;  
            }  
            else if(e.getSource()==b4)
            {  
                c=a/b;  
            }  
            String result=String.valueOf(c);  
            t3.setText(result);  
        }  
    public static void main(String[] args) {  
        new SimpleCalculator();  
    } }  