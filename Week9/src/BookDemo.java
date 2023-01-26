import java.util.*;
public class BookDemo {

	public static void main(String[] args) {

		/*Book bk1 = new Book();
		bk1.setTitle("The Blue Moon");
		bk1.setPrice((float) 290.15);
		bk1.setPublishyear(2011);

		System.out.println("Input book title   : "+bk1.getTitle());
		System.out.println("Input book price   : "+bk1.getPrice());
		System.out.println("Input publish year : "+bk1.getPublishyear());		
	    System.out.println();
	    System.out.println(bk1.toString());*/
		
		Book bk1 = new Book();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input book title   : ");
		bk1.setTitle(sc.nextLine());
		System.out.print("Input book price   : ");
		bk1.setPrice(sc.nextFloat());
		System.out.print("Input publish year : ");
		bk1.setPublishyear(sc.nextInt());
	    System.out.println();
	    System.out.println(bk1.toString());
	    
	}

}
