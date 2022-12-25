
public class Example1 {

	public static void main(String[] args) {
		
		String isbn = "IB2-6325-85-4-1";
	     String title = "Basic Java Programming";
	     int unit = 5;
	     float price = 225.75f;
	     System.out.println("Book ISBN  : "+isbn);
	     System.out.println("Book Title : "+title);
	     System.out.println("Book Unit  : "+unit+" Books.");
	     System.out.println("Book Price : "+price+" Baht.");
	     System.out.println("--------------------------------------");
		 
	     float totalPrice = price*unit;
	     System.out.println("Total Price is "+totalPrice);
	     float totalwithVat = totalPrice+(totalPrice*7/100);
	     System.out.println("Add Vat 7%  is "+totalwithVat);
	     
		}


	}



