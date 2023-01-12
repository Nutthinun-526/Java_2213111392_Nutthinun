import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Lap203 {


	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
		System.out.println("Input two integers(a b):");
		int  numberOne = sc.nextInt();
		System.out.print("");
		int numberTwo = sc.nextInt();
				
		int sum = numberOne+numberTwo;
		System.out.println("Sum of two integers:"+sum);
		
		String digit = String.valueOf(sum);
			
			System.out.println("Digti number of sum of said two integers:");	
			System.out.println(digit.length());
		}//end of main()

	
}



