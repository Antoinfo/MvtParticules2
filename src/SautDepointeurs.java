
public class SautDepointeurs implements Runnable{

Force[]t;
int i;
 SautDepointeurs( Force[] t, int i){
	this.t=t;
	this.i=i;
}

public void run(){
	if(this.i!=this.t.length-1){
		Force f=t[i];
		Force g=t[i+1];
		t[i+1]=new Force(f.Fx+g.Fx, f.Fy+g.Fy);
		i+=1;
	}
	
}
	
	
	
}
