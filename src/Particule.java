public class Particule {
	
	public int num;
    public double x;
    public double y;
    public double vx;
    public double vy;
    public Force[] force;
   
    
    public Particule (double x, double y, int i, double vx, double vy, Force[] force){
    	this.x=x;
    	this.y=y;
    	this.vx=vx;
    	this.vy=vy;
    	this.force=force;
    	this.num=i;
    }
    
    public double distance (Particule P1, Particule P2){
    	//calcul de la distance entre deux particules
    	return (Math.sqrt(Math.pow((P1.x-P2.x),2) +Math.pow((P1.y-P2.y),2)));
    }
    public static Force force (Particule P1, Particule P2) {
    	//calcul de la force entre deux particules, gravitationelle par d�faut
    	if (P1.num==P2.num){
    		return new Force(0,0);
    	}
    	return new Force(0,0);
    	
    }

}
