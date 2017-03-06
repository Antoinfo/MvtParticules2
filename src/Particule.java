public class Particule {
    public double x;
    public double y;
    public double vx;
    public double vy;
    
    public Particule (double x, double y, double vx, double vy){
    	this.x=x;
    	this.y=y;
    	this.vx=vx;
    	this.vy=vy;
    }
    
    public double distance (Particule P1, Particule P2){
    	//calcul de la distance entre deux particules
    	return (Math.sqrt(Math.pow((P1.x-P2.x),2) +Math.pow((P1.y-P2.y),2)));
    }
    public double force (Particule P1, Particule P2) {
    	//calcul de la force entre deux particules, gravitationelle par d�faut
    	return 0;
    	
    }

}
