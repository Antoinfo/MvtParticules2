
public class Calcul1ForceParticule implements Runnable { 
	
	
	Particule A;
	Particule B;
	Force f;



	
	Calcul1ForceParticule(Particule a, Particule b ) { 
	this.A = a;
	this.B = b ;
	
	}
	
	public void run ( ) {
		f= Particule.force(this.A,this.B);
	
	}
}
