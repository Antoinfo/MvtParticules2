
public class SautDepointeurs implements Runnable{

Force[]t1;
Force []t2;
int i;
int k;

 SautDepointeurs( Force[] t1,Force[] t2, int i, int k){
	this.t1=t1;
	this.t2=t2;
	this.i=i;
	this.k=k;
}

public void run(){
	
	if((i+(int)Math.pow(2, k))<=this.t1.length-1){
		Force f=t1[i];
		Force g=t1[i+(int)Math.pow(2, k)];
		t2[i+(int)Math.pow(2, k)]=new Force(f.Fx+g.Fx, f.Fy+g.Fy);
		
	}
	
}
	
	
	
}
