import java.util.*;

public class ClassTestStuedent {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ClassStudent[] std = new ClassStudent[3];

		for (int i = 0; i < std.length; i++) {

			std[i] = new ClassStudent(); // กำหนดค่าของ Array ให้เรียกใช้เมธอดในคลาสต้นแบบ
			System.out.println("INPUT INFORMATION OF STUDENT " + (i + 1));
			System.out.println("------------------------------");
			System.out.print("Input student name  : ");
			// std[i] = scan.next();
			std[i].setName(scan.next());
			System.out.print("Input student score : ");
			std[i].setScore(scan.nextInt());

			while (!std[i].checkScore()) {
				System.out.print("Input student score, again : ");
				std[i].setScore(scan.nextInt());

			} // end while
			System.out.println();

		} // end for()

		System.out.println();
		System.out.println("LIST OF PASS STUDENT (>=50) : ");
		System.out.println("-------------------------------");
		for (int i = 0; i < std.length; i++) {

			if (std[i].isPass()) {
				System.out.println(">> " + std[i].getName() + " " + " (" + std[i].getScore() + " )");

			}
		}

	}

}
