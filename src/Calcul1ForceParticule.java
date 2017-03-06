
public class Calcul1ForceParticule implements Runnable { 
	
	
	Particule A;
	Particule B;
	



	
	Calcul1ForceParticule(Particule a, Particule b ) { 
	this.A = a;
	this.B = b ;
	
	}
	
	public void run ( ) {
		A.force[B.num]=Particule.force(this.A,this.B).moins();
		B.force[A.num]=Particule.force(this.A,this.B);
	
	}
}
