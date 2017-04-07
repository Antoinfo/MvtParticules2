package Concurrent;
import java.math.*;

import Physics.Force;
import Physics.Particule;
public class NewPos implements Runnable  {


	Particule [] elements;
	Particule [] elements2;
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
		
		Force [] t2=new Force[n];
		//on crée ce tableau pour servir d'intermédiaire pendant le saut de pointeur
		//ce tableau a la meme valeur que elements[numero].force
		
		for (int j=0;j<n; j++){
			
				t2[j]=elements[numero].force[j];
		}
		
		//ici on lance à chaque fois des threads, il faudrait en réalité lancer n threads au début, puis modifier l'opération mais ne pas créer à chaque fois de nouvelle thread
		// a la place d'un join on implementerait un compteur (en utilisant les wait et notifyALl propre à tout objet java
		// a chaque étape on relance le compteur à zero, quand le compteur arrive à n on relance toutes les threads (équivalent à un join)
		for (int i=0;i<=k;i++){
			Thread[] tabthread= new Thread[n];
			for (int j=0;j<n; j++){
				SautDepointeurs sdp= new SautDepointeurs(elements[numero].force,t2, j,i);
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
			
			//pour respecter la complexité il faudrait lancer n thread (ou reprendre cella d'avant) et que chacune remplisse une case du tableau)
			//ici on le laisse tel quel par souci de simplicité
			for (int j=0;j<n; j++){
				
			
			elements[numero].force[j]=t2[j];
			}
			
		}
		Force ftot=elements[numero].force[n-1];
		
		
		elements[numero].UpdatePosSpeed(ftot, pas);
		


	}

}



