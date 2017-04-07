
public class Force {
	double Fx;
	double Fy;
	
	Force (double x,double y){
		Fx=x;
		Fy=y;
	}
	
	public Force moins(){
		return new Force(-this.Fx,-this.Fy);
		
	}
	public static Force somme(Force f, Force g){
		return new Force(f.Fx+g.Fx, f.Fy+g.Fy);
	}
	 public static Force force (Particule P1, Particule P2) {
	    	//calcul de la force entre deux particules, gravitationelle par d�faut
	    	//de 2 sur 1
		    
	    	if (P1.num==P2.num){
	    		return new Force(0,0);
	    	}
	    	
	    	double d= Particule.distance(P1,P2);
	    	double Fx=-6*P1.masse*P2.masse*(P1.x-P2.x)/(d*d*d);
	    	double Fy=-6*P1.masse*P2.masse*(P1.y-P2.y)/(d*d*d);
	    	return new Force(Fx,Fy);
	    	
	    }
	 

}
