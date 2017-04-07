//import com.sun.prism.Graphics;

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
    
    public Particule (double x, double y, int i, double vx, double vy, Force[] force,int m){
    	this.x=x;
    	this.y=y;
    	this.vx=vx;
    	this.vy=vy;
    	this.force=force;
    	this.num=i;
    	this.masse=m;
    	
    }
    public void setvX(double vx) {
    	this.vx=vx;
    	
    }
    public void setvY(double vy) {
    	this.vy=vy;
    	
    }
    
    public static double distance (Particule P1, Particule P2){
    	//calcul de la distance entre deux particules
    	return (Math.sqrt(Math.pow((P1.x-P2.x),2) +Math.pow((P1.y-P2.y),2)));
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
    public static void impressParticule (Particule p) {
    	System.out.println(p.x +","+ p.y);
    }


}
