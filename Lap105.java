import javax.swing.JOptionPane;

public class Lap105 {

	public static void main(String[] args) {
		
		String time = JOptionPane.showInputDialog
				(null,"Input Time Parking (minute):","Input",JOptionPane.QUESTION_MESSAGE);
		int a = Integer.parseInt(time);
		int hour = a/60;
		int minute = a%60; 
		double price = (hour*50)+(minute*0.25) ;
		
		JOptionPane.showMessageDialog
		(null,"You parking "+hour+" Hour "+minute+" Minute.\nAmount to be paid is "+price+""
				+ " baht.");
	

	}

}
