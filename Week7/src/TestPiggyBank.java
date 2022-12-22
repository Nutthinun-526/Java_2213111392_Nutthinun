import java.util.*;

public class TestPiggyBank {

	/*public static void main(String[] args) {
		PiggyBank pb = new PiggyBank();
		pb.setPiggyBank(500);
		System.out.println("Money Total: "+pb.getTotal());
		pb.addOne(300);
		System.out.println("Add 1 Baht Money : "+300);
		System.out.println("Money Total: "+pb.getTotal());
		
		pb.AddTwo(100);
		System.out.println("Add 2 Baht Money : "+100);
		System.out.println("Money Total: "+pb.getTotal());
		
		pb.AddTen(10);
		//System.out.println("Add 2 Baht Money : "+100);
		//System.out.println("Money Total: "+pb.getTotal());

	}*/
	
	static Scanner scan = new Scanner(System.in);
	static PiggyBank pb = new PiggyBank();
	
	public static void main(String[] args) {
		inputSizeofPiggyBank();
		
	}//end of main()
	
	public static void inputSizeofPiggyBank() {
		System.out.println("Money Total : "+pb.getTotal());
		System.out.println("Please define size of PiggyBank : ");
		//int size = scan.nextInt();
		//pb.setPiggyBank(size);		
		pb.setPiggyBank(scan.nextInt());
		System.out.println("Size of your PiggyBank : "+pb.getPiggyBank());
		
		inputCoin();
		
	}//end of inputSizeofPiggyBank
	
	public static void inputCoin() {
		while(true) {
		System.out.println("\n================================");
		System.out.println("Menu of PiggyBank");
		System.out.println("\n================================");
		System.out.println("[1]  one  baht.");
		System.out.println("[2]  two  baht.");
		System.out.println("[3]  five baht.");
		System.out.println("[4]  ten  baht.");
		System.out.println("[5]  Exit");
		System.out.println("==================================");
		System.out.print("Please select choice[1-5] : ");
		int choice = scan.nextInt();
		
		if(choice == 1) {
			System.out.print("Insert 1 baht money : ");
			pb.addOne(scan.nextInt());
			System.out.println("Money Total : "+pb.getTotal());
			
		}
		else if(choice == 2) {
			System.out.print("Insert 2 baht money : ");
			pb.addTwo(scan.nextInt());
			System.out.println("Money Total : "+pb.getTotal());
			
		}
		else if(choice == 3) {
			System.out.print("Insert 5 baht money : ");
			pb.addFive(scan.nextInt());
			System.out.println("Money Total : "+pb.getTotal());
			
		}
		else if(choice == 4) {
			System.out.print("Insert 10 baht money : ");
			pb.addTen(scan.nextInt());
			System.out.println("Money Total : "+pb.getTotal());
			
		}
		else if(choice == 5) {
			System.out.print("Bye Bye");
			break;
			
		}
	}
}
}
