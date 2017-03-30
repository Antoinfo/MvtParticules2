
public class NewPos implements Runnable  {


	Particule [] elements;
	int numero; // pour l'instant une thread= calcul pos une particule, plus tard faire num 1 , num 2 et i va de num 1 à num 2
	double pas;
	//on doit faire un saut de pointeur ensuite
	
	// calcule l'ensemble des forces s'appliquant à une particule de numéro=numero, 
	//en remplissant son tableau de forces, et églament les forces que cette particule applique au reste

	NewPos(Particule [] elements1,int p1,double t){
		elements=elements1;
		numero=p1;
		pas=t;

	}


	public void run ( ) {
		int n=elements.length;
		
		
		// faire le saut de pointeur sur les forces des particules: A FAIRE
		
		// puis faire postion après cette somme
		
		Force ftot=elements[numero].force[n];
		
		
		elements[numero].UpdatePosSpeed(ftot, pas);
		


	}

}



