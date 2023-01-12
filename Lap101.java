import java.text.DecimalFormat;
import java.util.Scanner;

public class Lap101 {

	public static void main(String[] args) {
		
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Scanner scan = new Scanner(System.in);
        System.out.print("Input Product Name    : ");
        String a = scan.next();
        System.out.print("Input Product Unit    : ");
        int unit = scan.nextInt();
        System.out.print("Input Price per unit  : ");
        float pricePer = scan.nextFloat();
        System.out.println("---------------------------------");
       
        float total = unit*pricePer;
        System.out.println("Total Price is "+frm.format(total)+" baht.");
        System.out.println("---------------------------------");
        System.out.print("How many discount (%) : ");
        int discount = scan.nextInt();        
        System.out.println("---------------------------------");
        
        System.out.print("Discount from "+discount+"%    "+frm.format((total*discount)/100)+" baht.");
        System.out.print("\nAmount to be paid    "+frm.format(total-(total*discount)/100)+(" baht."));


	}

}
