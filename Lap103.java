import javax.swing.JOptionPane;

public class Lap103 {

	public static void main(String[] args) {
		
		int small = 30;
		int big = 60;
		
		String smallDish = JOptionPane.showInputDialog
				(null,"How many small dish:","Input",JOptionPane.QUESTION_MESSAGE);
		String bigDish = JOptionPane.showInputDialog
				(null,"How many big dish:","Input",JOptionPane.QUESTION_MESSAGE);
		int unitSmall = Integer.parseInt(smallDish);
		int unitBig = Integer.parseInt(bigDish);		

		int totalSmall = small*unitSmall;
		int totalBig = big*unitBig;
				
		JOptionPane.showMessageDialog
				(null,"You order "+smallDish+" small dish ("+totalSmall+")\nYou order "+bigDish+" big dish ("+totalBig+")\n\nAmount to be paid is "+(totalSmall+totalBig)+" baht.","Noodles",JOptionPane.WARNING_MESSAGE);
	}

	

}
