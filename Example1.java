import java.text.DecimalFormat;
import java.util.*;

public class Example1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		DecimalFormat frm = new DecimalFormat("#,###.00");
		DecimalFormat number = new DecimalFormat("###");

			System.out.print("Input number 1 : ");
			double numOne = sc.nextDouble();
			
			System.out.print("Input number 2 : ");
			double numTwo = sc.nextDouble();
			
			System.out.print("Input number 3 : ");
			double numThee = sc.nextDouble();

			System.out.println();
		Double sum = numOne+numTwo+numThee;
		System.out.print("Sum of "+number.format(numOne)+", "+number.format(numTwo)+" and "+number.format(numThee)+" is "+frm.format(sum)
		 +"\nAverage is "+frm.format(sum/3));

	}

}
