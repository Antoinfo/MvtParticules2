
public class SautDepointeurs implements Runnable{

Force[]t;
int i;
int k;

 SautDepointeurs( Force[] t, int i, int k){
	this.t=t;
	this.i=i;
	this.k=k;
}

public void run(){
	
	if((i+(int)Math.pow(2, k))<this.t.length-1){
		Force f=t[i];
		Force g=t[i+(int)Math.pow(2, k)];
		t[i+(int)Math.pow(2, k)]=new Force(f.Fx+g.Fx, f.Fy+g.Fy);
		i+=1;
	}
	
}
	
	
	
}
