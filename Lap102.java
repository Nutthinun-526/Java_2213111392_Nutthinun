import java.util.*;

public class Lap102 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("How many product in basket : ");
		int product = scan.nextInt();
		System.out.println();
		int paid = (product/2)+1 ;
		int free = product-paid ;
		System.out.print("You have "+product+" unit in basket."
				+ "\nPaid "+paid+" unit."
						+ "\nFree "+free+" unit.");
		

	}

}
