import java.util.Scanner;

public class Lap705_ClassTestStudentGrade {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("How many student in classroom : ");
		Lap703_ClassStudent[] std = new Lap703_ClassStudent[scan.nextInt()];
		System.out.println();

		for (int i = 0; i < std.length; i++) {

			std[i] = new Lap703_ClassStudent();

			System.out.print("Input student name  : ");
			std[i].setName(scan.next());
			System.out.print("Input student score : ");
			std[i].setScore(scan.nextInt());

			while (!std[i].checkScore()) {
				System.out.print("Input student score, again : ");
				std[i].setScore(scan.nextInt());

			} // end while
			System.out.println("-------------------------------");

		}

		for (Lap703_ClassStudent _std : std) {

			System.out.println(">> " + _std.getName() + (" get grade ") + _std.findGrade(_std.getScore()));

		}

	}
}
