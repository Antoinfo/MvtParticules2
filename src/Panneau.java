import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Color;


public class Panneau extends JPanel {
	private int[] X;	
	private int[] Y;
	
	
	public void setX(int[] X){
		this.X=X;
	}
	public void setY(int[] Y){
		this.Y=Y;
	}
	
	
	public void paintComponent(Graphics g){
		g.setColor(Color.white);
		g.fillRect(0, 0, this.getWidth(),this.getHeight());
		g.setColor(Color.red);
		for (int i=0; i<X.length; i++){
			
			g.fillOval(X[i],Y[i], 10, 10);
		}
	}
		//this.config.nextConfig();
		
	
}

