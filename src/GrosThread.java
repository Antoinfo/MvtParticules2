
public class GrosThread implements Runnable {

	Particule [] elements;
	int numero;
	// calcule l'ensemble des forces s'appliquant à une particule de numéro=numero, 
	//en remplissant son tableau de forces, et églament les forces que cette particule applique au reste

	GrosThread(Particule [] elements1,int p1){
		elements=elements1;
		numero=p1;

	}


	public void run ( ) {
		int n=elements.length;
		Thread[] tabthread= new Thread [n-numero+1];
		// on va jusqu'à N-num
		
		// le faire pour soi-même ?? j=numero ? le remettre à 0s

		for (int j=numero;j<n;j++){
			
			
			Calcul1ForceParticule s= new Calcul1ForceParticule(elements[numero], elements[j] );
			tabthread[j]=new Thread(s);
			tabthread[j].start();
		}
		
		for (int j=numero;j<n;j++){
			
			
			
			try {
				tabthread[j].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}


	}

}
