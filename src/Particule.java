import com.sun.prism.Graphics;

public class Particule {
	
	public int num;
    public double x;
    public double y;
    public double vx;
    public double vy;
    public int masse;
    public Force[] force; // toutes les forces et une case de plus pour la somme ?
   
    
    public Particule (int x, int y)
    {
    	this.x = x ; this.y = y ;
    }
    public void setCoord (int x, int y)
    {
    	this.x = x ;
    	this.y = y ;
    }
    
    public Particule (double x, double y, int i, double vx, double vy, Force[] force){
    	this.x=x;
    	this.y=y;
    	this.vx=vx;
    	this.vy=vy;
    	this.force=force;
    	this.num=i;
    }
    
    public static double distance (Particule P1, Particule P2){
    	//calcul de la distance entre deux particules
    	return (Math.sqrt(Math.pow((P1.x-P2.x),2) +Math.pow((P1.y-P2.y),2)));
    }
    public static Force force (Particule P1, Particule P2) {
    	//calcul de la force entre deux particules, gravitationelle par d�faut
    	//de 2 sur 1
    	if (P1.num==P2.num){
    		return new Force(0,0);
    	}
    	
    	double d= distance(P1,P2);
    	double Fx=-6*P1.masse*P2.masse*(P1.x-P2.x)/(d*d*d);
    	double Fy=-6*P1.masse*P2.masse*(P1.y-P2.y)/(d*d*d);
    	return new Force(Fx,Fy);
    	
    }
    
    public void UpdatePosSpeed( Force f, double pas){
    	
    	x+=vx*pas;
    	y+=vy*pas;
    	vx=+f.Fx*pas;
    	vy+=f.Fy*pas;
    	
    }
    

    /*public void Affiche(Graphics g){
    	
    	g.drawLine((Math.round((float)(this.x))), Math.round((float)this.y), Math.round((float)(this.x)), Math.round((float)this.y));
    }*/


}
