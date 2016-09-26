
public class Manifold {
	private Ball a;
	private Ball b;
	double penetration;
	Vector2D normal;
	
	public Manifold(Ball a, Ball b){
		this.a = a;
		this.b = b;
		penetration = 0;
		normal = null;
	}
	
	public void setBallA(Ball b){
		a = b;
	}
	
	public void setBallB(Ball b){
		this.b = b;
	}
	
	public Ball getA(){
		return a;
	}
	
	public Ball getB(){
		return b;
	}
	
	public double getPen(){
		return penetration;
	}
	
	public Vector2D getNorm(){
		return normal;
	}
	
	public void setPen(double p){
		penetration = p;
	}
	
	public void setNorm(Vector2D n){
		normal = n;
	}
}
