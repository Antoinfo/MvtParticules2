
public class Calcul1ForceParticule implements Runnable { 
	
	
	int k;
int pos,i; 
int a[][];
	Multred(Particule [] A, int position , int ab[][]) { k = kk;
	pos = position ;
	a=ab;
	}
	
	public void run ( ) {
	int i,j;
	// suffix scan for multiply (a coefficients)
	for (i=1;i<=k;i++) {
	j = pos+(1<<(i −1)); // j=next [ pos ] if (j<(1<<k)) {
	while (a[j][i−1]==−1) { System.out. print(”.”);
	} // ugly active polling − should be wait()
	a[pos][i] = a[pos][i−1]∗a[j][i−1]; } else
	a[pos][i] = a[pos][i−1] ;
	} }
	}
}
