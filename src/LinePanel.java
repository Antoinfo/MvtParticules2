import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * panneau de 300x200 pixels ou on dessine une ligne diagonale 
 * 
 * @author jonathan
 */
public class LinePanel extends JPanel {

public static void main(String[] args) {

JFrame frame = new JFrame(); // creation de la fenetre
JPanel panel = new LinePanel(); // creation du panneau

frame.setContentPane(panel); // integration du panneau dans la fenetre
frame.pack(); // ajustement de la taille de la fenetre au contenu
frame.setLocationRelativeTo(null); // centrage
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // quand on clique sur la croix, ca quitte le programme (ce n'est pas le cas par defaut)
frame.setVisible(true); // rend la fenetre visible (ce n'est pas le cas par defaut)
}


/**
 * constructeur du panneau
 */
public LinePanel() {
setPreferredSize(new Dimension(300, 200)); // ajustement de la taille "preferee" du panneau
}


@Override
public void paintComponent(Graphics graphics) {

int width = getWidth();
int height = getHeight();
graphics.drawLine( 1, 1, 200, 200);
}



public void afficherp(Graphics graphics, Particule p) {

int width = getWidth();
int height = getHeight();
graphics.drawLine( 1, 1, 2, 2);
}

}