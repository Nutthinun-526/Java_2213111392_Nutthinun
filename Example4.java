import javax.swing.*;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Example4 {

	public static void main(String[] args) {
		
		/*NumberFormat f1 = NumberFormat.getInstance();// #,###
		String productName = JOptionPane.showInputDialog
				("Input Product Name: ");
		String productUnitstr = JOptionPane.showInputDialog
				("Input Product Unit: ");
		int productUnit = Integer.parseInt(productUnitstr);
		
		float productPriceperUnit = Float.parseFloat
				(JOptionPane.showInputDialog
				("Input Price per unit: "));
		
		float totalPrice = productUnit*productPriceperUnit;
	    System.out.println("Total Price is "+f1.format(totalPrice)+" baht.");
	    float totalwithVat = totalPrice+(totalPrice*7/100);
	    System.out.println("Add Vat 7%  is "+f1.format(totalwithVat)+" baht.");*/
		
		//NumberFormat f1 = NumberFormat.getInstance();// #,###
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		String productName = JOptionPane.showInputDialog
				("Input Product Name: ");
		
		String productUnitstr = JOptionPane.showInputDialog
				("Input Product Unit: ");
		int productUnit = Integer.parseInt(productUnitstr);
		
		float productPriceperUnit = Float.parseFloat
				(JOptionPane.showInputDialog
				("Input Price per unit: "));
		
		float totalPrice = productUnit*productPriceperUnit;
        float totalwithVat = totalPrice+(totalPrice*7/100);
        
		JOptionPane.showMessageDialog(null, "Total Price is "+frm.format(totalPrice)+" baht."
				+"\nAdd Vat 7%  is "+frm.format(totalwithVat)+" baht.");

	}

}
