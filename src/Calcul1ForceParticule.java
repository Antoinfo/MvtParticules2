
public class Calcul1ForceParticule implements Runnable { 
	
	
	Particule A;
	Particule B;
	double [] Force;



	
	Calcul1ForceParticule(Particule a, Particule b ) { 
	this.A = a;
	this.B = b ;
	
	}
	
	public void run ( ) {
		Force= Force(this.A,this.B);
	
	}
}
