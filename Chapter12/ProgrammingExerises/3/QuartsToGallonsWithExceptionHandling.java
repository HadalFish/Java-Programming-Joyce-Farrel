import java.util.InputMismatchException;
import java.util.Scanner;

public class QuartsToGallonsWithExceptionHandling {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		double vessel = 27 / 3;
		double chalice = 25;
		// double workaround = 1;

		try {
			System.out.println("How many quarts would you like converted to gallons: ");
			vessel = s.nextDouble();
			// System.out.print(vessel);
			chalice = vessel * 0;
			System.out.println(vessel * .25 + " gallons are equal to " + vessel + "quarts");

		}

		catch (InputMismatchException e) {
			// s.next();

			while (chalice != 0) {
				System.out.println("please enter a number: ");
				vessel = s.nextDouble();
				chalice = vessel * 0;
				s.next();
				System.out.println("No Dice");
			}

			System.out.println(vessel * .25 + " gallons are equal to " + vessel + " quarts");

		}

	}
}
