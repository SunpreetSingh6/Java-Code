package Swings;
import javax.swing.*;
import java.awt.event.*;

public class LoginForm {

	public static void main(String[] args) {
		
		JFrame j = new JFrame("Login");
		JLabel label = new JLabel();
		JLabel usr = new JLabel("Username:-");
		JLabel pass= new JLabel("Password:-");
		JTextField tf = new JTextField();
		JPasswordField pf = new JPasswordField();
		JButton b = new JButton("Login");  
		usr.setBounds(50, 50, 100, 30);
		pass.setBounds(50, 100, 100, 30);
		label.setBounds(50, 200, 350, 30);
		tf.setBounds(120, 50, 150, 30);
		pf.setBounds(120, 100, 150, 30);
		b.setBounds(150, 150, 70, 30);
		b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String data= "Username- " + tf.getText() +  " , Password- " + new String(pf.getPassword());
				label.setText(data);
			}
		}  );
		j.add(pass);
		j.add(usr);
		j.add(label);
		j.add(pf);
		j.add(tf);
		j.add(b);
		j.setSize(400, 400);
		j.setLayout(null);
		j.setVisible(true);
		
	}

}
