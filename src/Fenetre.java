import javax.swing.JFrame;
import javax.swing.JPanel;


public class Fenetre extends JFrame{
	Configuration config;
	public Panneau pan= new Panneau();
	
	
	public Fenetre(Configuration config){ 
		this.config=config;
	    this.setTitle("Mouvement des particules");
	    this.setSize(1000,1000);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	    this.setContentPane(pan);
	    this.setVisible(true);
	    go();
	}
	public void setConfig( Configuration config){
		this.config=config;
	}
	public void go(){
		
		for (int i=0; i<1000; i++){
			int[] X= new int[this.config.Particules.length];
			int[] Y= new int[this.config.Particules.length];
			for(int j=0; j<this.config.Particules.length; j++){
				X[j]=(int)(this.config.Particules[j].x);
				Y[j]=(int)(this.config.Particules[j].y);
			}
			 
			  
			
			  pan.setX(X);
			  pan.setY(Y);
			  
			  pan.repaint();
			  
				//}
			try{
				Thread.sleep(1);
				
			}catch (InterruptedException e){
				e.printStackTrace();
			}
		
			config.nextConfig();
		}
	}

}
