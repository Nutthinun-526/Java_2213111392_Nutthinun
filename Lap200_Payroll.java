import javax.swing.JOptionPane;
import java.text.*;

public class Lap200_Payroll {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.0");
		JOptionPane.showMessageDialog(null, "Welcome to the payroll application");
		String name = JOptionPane.showInputDialog("Enter employee name");
		String hours = JOptionPane.showInputDialog("Enter total hours for this employee.");
		Double _hours = Double.parseDouble(hours);
		
		Double grossEarnings = _hours*7.5;
		Double tax = grossEarnings*0.15;
		Double netEarnings = grossEarnings-tax;
		
		JOptionPane.showMessageDialog(null, "Employee name: "+name+""
				+ "\nHours worked: "+frm.format(_hours)+""
						+ "\nHourly wage: $ 7.5"
						+ "\nGross earnings: $ "+grossEarnings+""
								+ "\nTax rate: 0.15"
								+ "\nTax: $ "+tax+""
										+ "\nNet earnings: $ "+netEarnings);

	}

}
