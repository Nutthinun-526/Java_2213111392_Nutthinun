import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.text.NumberFormat;


public class MusicWorldApp {

	public static void main(String[] args) {
		
		//String cdId;
				//String cdTitle;
				//int cdQuantity;
				//double cdPrice;
				final double TAX_RATE = 0.0625;	
				
				NumberFormat f1 = NumberFormat.getCurrencyInstance();
				//DecimalFormat frmId = new DecimalFormat("0.00");
				DecimalFormat frmSub = new DecimalFormat("0.0");
				DecimalFormat frmTax = new DecimalFormat("0.00");
				DecimalFormat frmTal = new DecimalFormat("0.00000");
				//NumberFormat f1 = NumberFormat.getCurrencyInstance();
						
				String cdId = JOptionPane.showInputDialog(null,
						"This progarm calculates the total cost of a CD order"
						+ "\nPlease enter the ID of the CD");

				String cdTitle = JOptionPane.showInputDialog(null,
						"Please enter the title of the CD");

				String cdPrice = JOptionPane.showInputDialog(null,
						"Please enter the price of the CD in U.S. dollars");
				double price = Double.parseDouble(cdPrice);

				String cdQuantity = JOptionPane.showInputDialog(null,
						"Please enter the quantity to be purchased");
				double quantity = Double.parseDouble(cdQuantity);
				
			
				double cdSubtotal = (price*quantity);
				double cdTotal = cdSubtotal*(1+TAX_RATE);

				
				JOptionPane.showMessageDialog(null,"Summary of the transaction:"
						+ "\n\nCD ID: "+cdId+"\nCD Title: "+cdTitle+"\nCD Unit Price: "+cdPrice+""
								+ "\nCD Quantity: "+cdQuantity+"\n\nSubtotal: "+f1.format(cdSubtotal)+"\nTax rate: "
								+frmTax.format(TAX_RATE*100)+"%\nTotal: "+f1.format(cdTotal)+"\n\nEnd of Program");

	}

}
