import java.util.*;

public class Lap708_CheckStockProduct {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many product list in stock : ");
		int stock = sc.nextInt();
		Lap706_StockProduct ListStock[] = new Lap706_StockProduct[stock];
		
		for(int a = 0; a < stock; a++ ) {
			ListStock[a] = new Lap706_StockProduct();
			System.out.println();
			System.out.print("Input product Id   : ");
			ListStock[a].setId(sc.next());
			System.out.print("Input product Unit : ");
			ListStock[a].setUnit(sc.nextInt());
					
		}//end of for()
		
		System.out.println();
		System.out.println("--------------------------------------------------");
		System.out.println("List of product in 'LOW' status.");
		System.out.println("--------------------------------------------------");
		   for(int b = 0; b < ListStock.length; b++) {
			   if(ListStock[b].getUnit() < 5) {
				   System.out.println(">> "+ListStock[b].getId()+" has "+ListStock[b].getUnit()+" units");
			   }		
		   }//end of for(LOW)
		
		System.out.println("--------------------------------------------------");
		System.out.println("List of product in 'NORMAL' status.");
		System.out.println("--------------------------------------------------");
		   for(int b = 0; b < ListStock.length; b++) {
			   if(ListStock[b].getUnit() >= 5 && ListStock[b].getUnit() < 50) {
				   System.out.println(">> "+ListStock[b].getId()+" has "+ListStock[b].getUnit()+" units");
			   }		
		   }//end of for(NORMAL)
		
		System.out.println("--------------------------------------------------");
		System.out.println("List of product in 'HIGHT' status.");
		System.out.println("--------------------------------------------------");
		   for(int b = 0; b < ListStock.length; b++) {
			   if(ListStock[b].getUnit() >= 50) {
				   System.out.println(">> "+ListStock[b].getId()+" has "+ListStock[b].getUnit()+" units");
			   }		
		   }//end of for(HIGHT)

	}//end of main()

}
