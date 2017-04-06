
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main 
{
	public static void main (String[] argv)
	{
		 JFrame window = new JFrame();
		 window.setTitle("Motion simulator");
		 window.setResizable (false) ;
		 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 window.setBounds(30, 30, 300, 300);
		 MainComponent c = new MainComponent() ;
		 window.setContentPane (c) ;
		 window.setVisible(true);

		 
		 
	}
}
