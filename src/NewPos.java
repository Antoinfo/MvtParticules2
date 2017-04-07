import java.math.*;
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


	public void run ( ) {//lance les n petits threads
		
		
		
		int n=elements.length;
		
		double k=Math.log(n)/Math.log(2);
		/*
		Force[][]  tableau = new  Force[n][(int) (k+1)];
		
		for (int i=0;i<n;i++){
			tableau[i][0]=elements[numero].force[i];
			for(int j=1; j<k+1;j++){
				tableau[i][j]=null;
			}
		}
		//initialisation de la premi�re ligne avec les forces puis du reste � 0.
		//Remarque: ici en initialisant le tableau on perd l'avantage du parall�lisme car l'initialisation est en  n*ln(n)
				
		
		Thread[] tab= new Thread[n];
		for (int i=0; i<n; i++){
			tab[i]=new SommePartielle(n,i,tableau);
			tab[i].start();
			
			}
		for (int i=0; i<n; i++){
			try {
				tab[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		//java voulait absolument mettre un try/catch ici
		}
	
		// faire le saut de pointeur sur les forces des particules: A FAIRE
		
		// puis faire postion apr�s cette somme
		*/
		for (int i=0;i<=k;i++){
			Thread[] tabthread= new Thread[n];
			for (int j=0;j<n; j++){
				SautDepointeurs sdp= new SautDepointeurs(elements[numero].force, j,i);
				tabthread[j]=new Thread(sdp );
				tabthread[j].start();
				
			}
			for (int j=0;j<n; j++){
				
				try {
					tabthread[j].join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			
		}
		Force ftot=elements[numero].force[0];
		
		
		elements[numero].UpdatePosSpeed(ftot, pas);
		


	}

}



