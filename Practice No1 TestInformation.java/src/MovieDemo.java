import java.util.Scanner;

public class MovieDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
	System.out.print("Input movie id   : ");
	String id = sc.nextLine();
	System.out.print("Input movie name : ");
	String name = sc.nextLine();
	System.out.println();	
	
	System.out.print("Input director name   : ");
	String Direcname = sc.nextLine();
	System.out.print("Input director e-mail : ");
	String Direcemail = sc.nextLine();
	System.out.print("Input director gender : ");
	String Direcgender = sc.nextLine();
	System.out.println();
	
	System.out.println("Input movie theater no.  : ");
	System.out.println();
	
	Theater a1 = new Theater();
	System.out.println(a1);
	
	
	
	}
	
}