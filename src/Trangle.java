
public class Trangle extends Shape {

	private double base;
	private double height;
	
	
	public Trangle(double base, double height){
		this.base=base;
		this.height=height;
		
	}
	
	@Override
	protected void countArea() {
		// TODO Auto-generated method stub
		super.area = 0.5*base*height;
		
		
	}

	public String toString(){
		return super.toString() +"type: triangle";
	}
	
	
}
