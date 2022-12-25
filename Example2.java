import javax.swing.*;
import java.text.*;

public class Example2 {

	public static void main(String[] args) {
		
		
	  /*final float buffetPrice = 299;
		DecimalFormat frm = new DecimalFormat("#,###.00");
	    int numberofCustomer = 5;
	    float totalPrice = buffetPrice * numberofCustomer;
	    System.out.println("Buffet of "+numberofCustomer+
			    " customer is "+frm.format(totalPrice));
	 
	    float serviceCharge = totalPrice+(totalPrice*3/100);
    	System.out.println("TotalPrice with ServiceCharge is"+frm.format(serviceCharge));
	 
	    JOptionPane.showMessageDialog(null,
			    "Buffet of "+numberofCustomer+
	            " customer is "+totalPrice+
	            "\nTotalPrice with ServiceCharge is "+serviceCharge);*/
	    
	    final float buffetPrice = 299;
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
	    int numberofCustomer = 5;
	    float totalPrice = buffetPrice * numberofCustomer;
	    System.out.println("Buffet of "+numberofCustomer+
			    " customer is "+frm.format(totalPrice));
	 
	    float serviceCharge = totalPrice+(totalPrice*3/100);
    	System.out.println("TotalPrice with ServiceCharge is "+frm.format(serviceCharge));
	 
	    JOptionPane.showMessageDialog(null,
			    "Buffet  of   "+numberofCustomer+
	            "   customer is  "+frm.format(totalPrice)+
	            "\nAdd Service Charge 3% is  "+frm.format(serviceCharge));

	}

}
