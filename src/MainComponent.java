
import java.awt.Color;
import java.awt.Graphics;
import java.util.LinkedList;

import javax.swing.JPanel;

public class MainComponent extends JPanel
{
	Particule[] circles ;
	int N;
	public MainComponent ()
	{
		this.circles = new Particule [N] ;
	}
	
    @Override
    public void paintComponent(Graphics g)
    {
    	g.setColor (new Color (75, 75, 75)) ;
    	g.fillRect(0, 0, this.getWidth(), this.getHeight());
    	g.setColor (new Color (255, 0, 0)) ;
    	drawCircles(7);
    }
    private void drawCircles (int size)
    {
    	
    }
}