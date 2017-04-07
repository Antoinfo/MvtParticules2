import javax.swing.JFrame;

public class Test {

	public static void main (String args[]){
		int n=16;
		Particule[] entre= new Particule[n];
		Force[] initial= new Force[n];
		for (int j=0; j<n;j++){
			initial[j]=new Force(0,0);
		}
		for (int j=0; j<n;j++){
			entre[j]=new Particule(j*10,j*10,j,0,0,initial);
		}
		Configuration init= new Configuration(entre,1);
		Fenetre fen=new Fenetre(init);
    	
		
		/*Force[] initial= {new Force(0,0),new Force(0,0),new Force(0,0),new Force(0,0)};
		Particule P1=new Particule(100,2,0,0,0,initial);
		Particule P2=new Particule(0,300,1,0,0,initial);
		Particule P3=new Particule(165,320,2,0,0,initial);
		Particule P4=new Particule(400,780,3,0,0,initial);
		Particule[] entre={P1,P2,P3,P4};
		Configuration init= new Configuration(entre,1);
		
		//double k=Math.log(n)/Math.log(2);
		//System.out.println(k);
		
		//System.out.println(initial.length);
		//Particule.impressParticule(P1);
		
		//impress (init);
		//init.nextConfig();
		//Fenetre fenetre = new Fenetre(init);
        for (int i=0; i<1000; i++){
        	Fenetre fenetre = new Fenetre(init);
			init.nextConfig();
			//fenetre.setConfig(init);
			//fenetre.pan.repaint();
			try{
				Thread.sleep(0);
				
			}catch (InterruptedException e){
				e.printStackTrace();
		//fenetre.go();
		}*/
    /*		
    Force[] tab=new Force[16];		
    for (int i=0; i<16; i++){ tab[i]=new Force(i,i);}
    
    int k=3;
	for (int i=0;i<=k;i++){
		Thread[] tabthread= new Thread[n];
		for (int j=0;j<n; j++){
			SautDepointeurs sdp= new SautDepointeurs(tab, j);
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
		for (int t=0; t<tab.length; t++){
		System.out.println(tab[t].Fx );
		}
		*/
		
	
	
	
	//}
	}
}


