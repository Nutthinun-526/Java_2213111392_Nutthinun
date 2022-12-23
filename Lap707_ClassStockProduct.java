import java.util.*;
import java.text.*;

public class Lap707_ClassStockProduct {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat coin = new DecimalFormat("#,###.00");
		
		Lap706_StockProduct[] sp = new Lap706_StockProduct[4];
		
		for(int i = 0;i < sp.length;i++) {
			sp[i] = new Lap706_StockProduct();
			System.out.print("Input product Id    : ");
			sp[i].setId(sc.next());
			
			System.out.print("Input product Unit  : ");
			sp[i].setUnit(sc.nextInt());
			
			System.out.print("Input product Price : ");
			sp[i].setPrice(sc.nextDouble());

			System.out.println();
			
			
		}//end of for()

		System.out.println("--------------------------------------------------");
		
		for(int i = 0;i < sp.length;i++) {
		System.out.println("Product ID : "+sp[i].getId()+", Total price = "+coin.format(sp[i].calculate())+" baht.");
		
		}

		
		System.out.println("--------------------------------------------------");	
		
		double sum = (sp[0].getUnit()*sp[0].getPrice()) + (sp[1].getUnit()*sp[1].getPrice()) 
				+ (sp[2].getUnit()*sp[2].getPrice()) + (sp[3].getUnit()*sp[3].getPrice());
		System.out.println("Total price of all products is "+coin.format(sum)+" baht.");
		
		
		
	}//end of main()

}
