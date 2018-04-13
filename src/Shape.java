
public abstract class  Shape {

	
	double area = -1;
	
	public double getArea(){
		
		if(area==-1){
			countArea();
		}
		return area;
		
	}
	
	protected abstract void countArea();
	
	public String toString(){
	return "area" + getArea();
	}
}
