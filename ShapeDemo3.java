import javax.swing.JOptionPane;

public class ShapeDemo3 {

	public static void main(String[] args) {
		
		double radius1 = Double.parseDouble(
				JOptionPane.showInputDialog("[1] Input radius : "));
		double height1 = Double.parseDouble(
				JOptionPane.showInputDialog("[1] Input height : "));
		double radius2 = Double.parseDouble(
				JOptionPane.showInputDialog("[2] Input radius : "));
		double height2 = Double.parseDouble(
				JOptionPane.showInputDialog("[2] Input height : "));
		double radius3 = Double.parseDouble(
				JOptionPane.showInputDialog("[3] Input radius : "));
		double height3 = Double.parseDouble(
				JOptionPane.showInputDialog("[3] Input height : "));
		double radius4 = Double.parseDouble(
				JOptionPane.showInputDialog("[4] Input radius : "));
		double height4 = Double.parseDouble(
				JOptionPane.showInputDialog("[4] Input height : "));
		double radius5 = Double.parseDouble(
				JOptionPane.showInputDialog("[5] Input radius : "));
		double height5 = Double.parseDouble(
				JOptionPane.showInputDialog("[5] Input height : "));
		
		Cylinder cylinder1 = new Cylinder(radius1, height1, null);
		Cylinder cylinder2 = new Cylinder(radius2, height2, null);
		Cylinder cylinder3 = new Cylinder(radius3, height3, null);
		Cylinder cylinder4 = new Cylinder(radius4, height4, null);
		Cylinder cylinder5 = new Cylinder(radius5, height5, null);
		
		JOptionPane.showMessageDialog(null,"Cylinder 1, volume = "+cylinder1.getVolume()+""
				+ "\nCylinder 2, volume = "+cylinder2.getVolume()+""
						+ "\nCylinder 3, volume = "+cylinder3.getVolume()+""
								+ "\nCylinder 4, volume = "+cylinder4.getVolume()+""
								        +"\nCylinder 5, volume = "+cylinder5.getVolume());
		
		
		

	}

}
