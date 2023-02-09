import java.util.*;

public class ShapeDemo1 {
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	     System.out.print("Input radius : ");
	     double radius = sc.nextDouble();
	     System.out.print("Input height : ");
	     double height = sc.nextDouble();
	     System.out.println();
	     
	     Circle circle = new Circle(radius, null);
	     Cylinder cylinder = new Cylinder(radius, height, null);
	     
	     System.out.print("Circle [radius = "+ circle.getRadius() +"]"+""
	     		+ "\nCircle [ area = "+ circle.getArea() + "]");	     
	     System.out.println();

	     System.out.println();
	     System.out.print("Cylinder [height = "+ cylinder.getHeight()+",radius = "+ cylinder.getRadius() +"]"+""
	     		+ "\nCylinder [ area = "+ cylinder.getArea() + "]"+""
	     				+ "\nCylinder [ volume = "+cylinder.getVolume() + "]");	     
	}

}
