

public class Configuration {

	//main class
	//Ce qui est comment est inutile mais pas encore supprimé
	//je vais créer une autre thread pour calculer les nouvelles positions, que Config lancera

	//final int N=1000; 
	//nombre de particules
	//inutile, contenu dans la taille du tableau


	// il faut rajouter un public final static int float G quelque part

	//Particule[] config= new Particule[N];
	//double[] a= new double[N];

	Particule[] Particules;
	public double pas;
	//pas de temps utilis�
	final int N=Particules.length;



	public Configuration ( Particule [] entre, double pas){

		this.Particules=entre;
		this.pas=pas;

	}



	public void nextConfig(){
		//calcule la nouvelle configuration � partir de l'ancienne


		Thread[] tabthread= new Thread [N]; // on va faire 2 fois les mêmes calculs pour l'instant
		for (int j=0;j<N;j++){


			GrosThread s= new GrosThread(Particules, j );
			tabthread[j]=new Thread(s);
			tabthread[j].start();
		}


		for (int j=0;j<N;j++){



			try {
				tabthread[j].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		// tous les tableaux de forces sont fait à cette étapes

		// nbr de thread à lancer à déterminer

		//pour l'instant une thread par particules, après il faudra diviser par log(n)

		for (int j=0;j<N;j++){


			NewPos s= new NewPos(Particules, j,pas );
			tabthread[j]=new Thread(s);
			tabthread[j].start();
		}
		for (int j=0;j<N;j++){
			try {
				tabthread[j].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}





	}

	/*public void Affichage (Graphics g){
		for (int i=0; i<this.Particules.length; i++){
			this.Particules[i].Affiche(g);
		}

	}*/
	
    public static void main (String args[]){
    	Force[] initial= {new Force(0,0),new Force(0,0),new Force(0,0),new Force(0,0)};
		Particule P1=new Particule(1,2,1,5,4,initial);
		Particule P2=new Particule(0,3,1,5,4,initial);
		Particule P3=new Particule(1,3,1,5,4,initial);
		Particule P4=new Particule(0,2,1,5,4,initial);
		Particule[] entre={P1,P2,P3,P4};
		Configuration init= new Configuration(entre,1);
		init.nextConfig();
		System.out.println(init);
    }
	
	}

