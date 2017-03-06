
public class Force {
	double Fx;
	double Fy;
	
	Force (double x,double y){
		Fx=x;
		Fy=y;
	}
	
	public Force moins(){
		return new Force(-this.Fx,-this.Fy);
		
	}

}
