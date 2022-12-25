import java.util.*;
import java.text.NumberFormat;

public class Example3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); //define object of input data
		NumberFormat f1 = NumberFormat.getInstance();//#,###
		
		System.out.print("Input product name   : ");
		String productName = scan.nextLine();
		System.out.print("Input product unit   : ");
		int productUnit = scan.nextInt();
		System.out.print("Input price per unit : ");
		float pricePerUnit = scan.nextFloat();
		System.out.println();
		
		float totalPrice = productUnit*pricePerUnit;
	    System.out.println("Total Price is "+f1.format(totalPrice)+" baht.");
	    float totalwithVat = totalPrice+(totalPrice*7/100);
	    System.out.println("Add Vat 7%  is "+f1.format(totalwithVat)+" baht.");

	}

}
