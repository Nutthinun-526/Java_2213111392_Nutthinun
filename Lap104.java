import javax.swing.*;

import java.text.DecimalFormat;
import java.util.*;

public class Lap104 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("###");
		
		/*String productName = JOptionPane.showInputDialog("Input product name: ");
		String productUnitstr=JOptionPane.showInputDialog("Input product unit: ");
		int productUnit = Integer.parseInt(productUnitstr);
		
		float productPriceperUnit = Float.parseFloat(
				JOptionPane.showInputDialog("Input price per unit: "));
		
		float totalPrice = productUnit*productPriceperUnit;
		float totalwithVat = totalPrice+(totalPrice*7/100);
		
		JOptionPane.showMessageDialog(null, 
				"Total Price is "+totalPrice+" baht."+
				"\nAdd VAT 7% is "+totalwithVat+" baht.");*/
		
		String point = JOptionPane.showInputDialog("Input your point:");
		Double _point = Double.parseDouble(point);
		// if _point = 2970
        Double SmokyBike = _point/1000;// 2970/1000=2.******
               Double _SmokyBike = Math.floor(SmokyBike);// 2        
        Double _SmokyBike_ = _point-(_SmokyBike*1000);// 2970-(2*1000)=970

        
        Double Hamburger = _SmokyBike_/600;//970/600 = 1.******
               Double _Hamburger = Math.floor(Hamburger);// 1        
        Double _Hamburger_ = _SmokyBike_-(_Hamburger*600);// 970-(1*600) = 370
        
        Double ChocoStick = _Hamburger_/100;// 370/100 = 3.*******
               Double _ChocoStick = Math.floor(ChocoStick);// 3          
        Double _ChocoStick_ = _Hamburger_-(_ChocoStick*100);// 370-(3*100) = 70
        
        
        JOptionPane.showMessageDialog(null, "You point : "+point+",You can exchange..."
        		+ "\n"+frm.format(_SmokyBike)+" of SMOKYBIKE COUPON"
        				+ "\n"+frm.format(_Hamburger)+" of HAMBURGER COUPON"
        						+ "\n"+frm.format(_ChocoStick)+" of CHOCO STICK COUPON"
        								+ "\n"
        								+ "Point Balance : "+frm.format(_ChocoStick_));
        
		
	}// Match.floor()// 2.4567845 = 2

}
