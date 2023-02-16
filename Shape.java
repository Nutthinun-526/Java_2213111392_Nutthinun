
public abstract class Shape {

	private String color;
	
	public Shape(String color) {
		this.color = color;
	}
	
	public Shape() {
		this.color = null;
		//this(null);
	}
	
	//abstract method
	public abstract double getArea();
	
	@Override
	//method return string in form "color = [color]"
	public String toString() {
		return "color = "+ this.color;
	}

}
