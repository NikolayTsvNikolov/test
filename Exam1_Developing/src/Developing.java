import java.util.Scanner;


public class Developing {

	public static boolean checkData(int test) {

		boolean validData;
		if (test < 1 || test > 1000) {
			validData = false;
		} else {
			validData = true;
		}
		return validData;
	}

	public static int[] sortNumbers(int[] duration) {

		for (int i = 0; i < duration.length - 1; i++) {
			for (int j = i + 1; j < duration.length; j++) {
				int swap;
				if (duration[i] < duration[j]) {
					swap = duration[i];
					duration[i] = duration[j];
					duration[j] = swap;
				}
			}
		}
		return duration;

	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Please enter number of days: ");
		int t = input.nextInt();

		if (checkData(t) == false) {
			System.out.println("-----------------");
			System.out.println("Out of Range Data");
			System.out.println("-----------------");
		} else {

			for (int i = 0; i < t; i++) {

				System.out.print("Please enter number of tasks and priority: ");
				int n = input.nextInt();
				int k = input.nextInt();
				if (n < k || (checkData(n) == false || checkData(k) == false)) {
					System.out.println("-----------------");
					System.out.println("Out of Range Data");
					System.out.println("-----------------");
					i--;
				} else {

					int[] Ai = new int[n];
					boolean isValid = true;
					System.out.print("Please enter duration of tasks in minutes: ");
					for (int j = 0; j < Ai.length; j++) {
						Ai[j] = input.nextInt();
					}
					for (int l = 0; l < Ai.length; l++) {
						if (checkData(Ai[l]) == false) {
							isValid = false;
							break;
						}
					}
					if (isValid == false) {
						System.out.println("-----------------");
						System.out.println("Out of Range Data");
						System.out.println("-----------------");
						i--;
					} else {
						sortNumbers(Ai);
						System.out.println("-----------------------------------------------");
						System.out.println("Duration of priority task is "+ Ai[k - 1] + "  minutes");
						System.out.println("-----------------------------------------------");

					}

				}

			}
		}
		input.close();
	}
}
