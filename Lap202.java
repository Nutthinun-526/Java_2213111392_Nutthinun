import java.util.*;
import java.text.*;
public class Lap202 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("###");
		
		System.out.print("Input the number of minutes: ");
		Double minutes = sc.nextDouble();
		
		Double year = Math.floor(minutes/525600);
		Double day = Math.floor((minutes-(525600*year))/1440);
		
		System.out.print(frm.format(minutes)+" minutes is approximately "+frm.format(year)+" years and "+frm.format(day)+" days");

	}

}
