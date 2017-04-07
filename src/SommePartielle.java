
public  class SommePartielle extends Thread {

    int k;
    int pos;
    Force[][] t;
    
    SommePartielle(int n, int position, Force[][] tab){
    k=n;
    pos=position;
    t=tab;
    }
    
    public void run(){
    	
    	
    for(int i=1;i<k; i++){
    	int j= pos-(1<<(i-1));
    	if (j>=0){
    		while(t[j][i-1]==null){}
    		Force f=t[pos][i-1];
    		Force g=t[j][i-1];
    		t[pos][i]= new Force(f.Fx+g.Fx, f.Fy+g.Fy);
    	}
    	else {
    		System.out.println(pos);
    		System.out.println(i);
    		t[pos][i]=t[pos][i-1];
    	}
    		
    	}
    	
    	
    	
    	
    	
    }
    }
    		
    
