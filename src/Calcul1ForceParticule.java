
public class Calcul1ForceParticule implements Runnable { 
	
	
	Particule A;
	Particule B;
	

	// en vrai c'est pas rentable de lancer une thread juste pour faire une opération
	// il faudrait je pense supprimer cette thread et la grosse thread fait elle même les opérations, ou alors à la limite lance des threads
	// qui font des bouts mais pas juste une opération
	
	Calcul1ForceParticule(Particule a, Particule b ) { 
	this.A = a;
	this.B = b ;
	
	}
	
	public void run ( ) {
		A.force[B.num]=Force.force(this.A,this.B);
		B.force[A.num]=Force.force(this.A,this.B).moins();
	
	}
}
