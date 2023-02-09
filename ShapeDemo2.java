import java.util.*;

public class ShapeDemo2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("[1] Input radius : ");
		double radius1 = sc.nextDouble();
		System.out.print("[1] Input height : ");
		double height1 = sc.nextDouble();
		System.out.print("[2] Input radius : ");
		double radius2 = sc.nextDouble();
		System.out.print("[2] Input height : ");
		double height2 = sc.nextDouble();
		System.out.print("[3] Input radius : ");
		double radius3 = sc.nextDouble();
		System.out.print("[3] Input height : ");
		double height3 = sc.nextDouble();
		System.out.print("[4] Input radius : ");
		double radius4 = sc.nextDouble();
		System.out.print("[4] Input height : ");
		double height4 = sc.nextDouble();
		System.out.print("[5] Input radius : ");
		double radius5 = sc.nextDouble();
		System.out.print("[5] Input height : ");
		double height5 = sc.nextDouble();
		System.out.println();
		
		Cylinder cylinder1 = new Cylinder(radius1, height1, null);
		System.out.println("Cylinder 1, volume = "+cylinder1.getVolume());
		Cylinder cylinder2 = new Cylinder(radius2, height2, null);
		System.out.println("Cylinder 2, volume = "+cylinder2.getVolume());
		Cylinder cylinder3 = new Cylinder(radius3, height3, null);
		System.out.println("Cylinder 3, volume = "+cylinder3.getVolume());
		Cylinder cylinder4 = new Cylinder(radius4, height4, null);
		System.out.println("Cylinder 4, volume = "+cylinder4.getVolume());
		Cylinder cylinder5 = new Cylinder(radius5, height5, null);
		System.out.println("Cylinder 5, volume = "+cylinder5.getVolume());
		

	}

}
