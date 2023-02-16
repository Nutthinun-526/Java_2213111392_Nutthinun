
public class Cylinder extends Circle{

	private double height;
	
	public Cylinder(double radius, double height, String color) {
		super(radius, color);
		this.height = height;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public double getVolume() {
		return super.getArea()*this.height;
	}
	
	public double getArea() {
		return 2*Math.PI*(this.height+this.getRadius());
		
	}
	
	public String toString() {
		return "height = " + getHeight() + ", "+ super.toString();
	}
}
