import java.util.Scanner;

public class FahrenheitToCelciusCelciusToFahrenheit {
	public static void main(String[] args) {

		System.out.println("What do you want to do?");
		Scanner keyboard = new Scanner(System.in);
		String answer = keyboard.nextLine();
		
		try {

		if (answer.equalsIgnoreCase("F")) {

			System.out.println("I want to convert Fahrenheit to Celcius.");

			System.out.println("  ");

			System.out.println("What Fahrenheit value do you want to convert?");

			double value = keyboard.nextDouble();
			double convertedValue = (value - 32) * 5 / 9;
			System.out.print("The value of: " + value + " Fahrenheit" + " in Celcius is: ");
			// System.out.println(Math.round(convertedValue));
			System.out.println(convertedValue);
		} else if (answer.equalsIgnoreCase("C")) {
			System.out.println("I want to convert Celcius to Fahrenheit.");
			System.out.println("  ");

			System.out.println("What Celcius value do you want to convert?");

			double value = keyboard.nextDouble();
			double convertedValue = (value * 9 / 5) + 32;
			System.out.print("The value of: " + value + " Celcius" + " in Fahrenheit is: ");
			// System.out.println(Math.round(convertedValue));
			System.out.println(convertedValue);

		} else {

			System.out.println(
					"There is no provision for that choice.You may want to enter 'F' for Fahrenheit or 'C' for Celsius.");
		}

	}

catch(Exception e) {
	System.out.println(e.getLocalizedMessage());
}
}}
