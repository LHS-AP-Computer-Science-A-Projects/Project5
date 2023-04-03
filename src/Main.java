import java.util.Scanner;
import java.util.ArrayList;

/**
 * Class that calculates the pay of an employee based on hours and overtime
 * hours worked.
 */
public class Main {

	// Compiler constructor.
	public static void main(String[] args) {
		// Instantiates the scanner object.
		Scanner scanner = new Scanner(System.in);

		// Request the user input their hourly wage.
		System.out.println("What is your hourly wage?");
		// Assign the inputted double as the hourly wage doube value.
		double hourlyWage = scanner.nextDouble();
		/**
		 * Initialize the hours worked as zero to avoid unassigned er
		 */
		double regularHours = 0;
		double overtimeHours = 0;

		// Instantiate a String ArrayList with each of the five workdays stored within
		// the list.
		ArrayList<String> days = new ArrayList<String>() {
			{
				add("Monday");
				add("Tuesday");
				add("Wednesday");
				add("Thursday");
				add("Friday");
			}
		};

		// The loop iterates through each of the days stored in the ArrayList, calling
		// on two separate methods to prompt the user for regular and overtime hours,
		// then adds those hours to the total.
		for (int i = 0; i < 5; i++) {
			regularHours += getRegularHours(days.get(i));
			overtimeHours += getOvertimeHours(days.get(i));
		}
		// Calculates total pay.
		double totalPay = hourlyWage * regularHours + hourlyWage * overtimeHours * 1.5;

		// Outputs the total pay in the command line.
		System.out.println("Your pay this week totals $" + totalPay + ".");
		// Ends the scanner runnable.
		scanner.close();
	}

	// Returns a double value based on the amount of regular hours an individual
	// works in the inputted day.
	private static double getRegularHours(String day) {
		// Suppress warnings so that the scanner does not spam console with runnable
		// errors.
		@SuppressWarnings("all")
		// Instantiates the scanner object.
		Scanner scanner = new Scanner(System.in);

		/**
		 * Requests the user to input the amount of regular hours worked, then returns
		 * that value.
		 */
		System.out.println("How many regular hours did you work on " + day + "?");
		return scanner.nextDouble();
	}

	// Returns a double value based on the amount of overtime hours an individual
	// works in the inputted day.
	private static double getOvertimeHours(String day) {
		// Suppress warnings so that the scanner does not spam console with runnable
		// errors.
		@SuppressWarnings("all")
		// Instantiates the scanner object.
		Scanner scanner = new Scanner(System.in);

		/**
		 * Requests the user to input the amount of overtime hours worked, then returns
		 * that value.
		 */
		System.out.println("How many overtime hours did you work on " + day + "?");
		return scanner.nextDouble();
	}
}