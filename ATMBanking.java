import java.util.*;

public class ATMBanking {


	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		boolean check = false;
		System.out.print("Enter account number : ");
		String id = console.next();
		//while(id.length()!=14 && id.charAt(1)=='-' && id.charAt(5)=='-' && id.charAt(9)=='-' && id.charAt(12)=='-') {
			//System.out.print("Input wrong type, Enter account number : ");
			//id = console.next();
		if((id.length()!=14 && id.charAt(1)=='-' && id.charAt(5)=='-' && id.charAt(9)=='-' && id.charAt(12)=='-')){
			check = true;
		}
		else {
			System.out.print("Input wrong type, Enter account number : ");
			id = console.next();
		}
		System.out.print("Enter password : ");
		String pass = console.next();
		while(pass.length()!=4) {
			System.out.print("Enter password : ");
			pass = console.next();
		}
		System.out.print("Enter money : ");
	    int money = console.nextInt();
	}
}
