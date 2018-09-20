import java.util.Scanner;

public class WeirdCalculator
{
	public static void main(String[] args)
	{
		{
		int number1 = 0, number2 = 0;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first integer: ");
		number1 = input.nextInt();
		System.out.print("Enter the second integer: ");
		number2 = input.nextInt();

		final int sum = number1 + number2;
		final int difference = number1 - number2;
		final int product = number1 * number2;
	 	final double average = (sum / 2.0);
		final int distance = Math.abs(difference);
		final int maximum = Math.max(number1, number2);
		final int minimum = Math.min(number1, number2);

		System.out.printf("\n%15s", "Sum: " + sum);
		System.out.printf("\n%15s", "Difference: " + difference);
		System.out.printf("\n%15s", "Product: " + product);
		System.out.printf("\n%17s", "Average: " + average);
		System.out.printf("\n%15s", "Distance: " + distance);
		System.out.printf("\n%15s", "Maximum: " + maximum);
		System.out.printf("\n%15s", "minimum: " + minimum);
		System.out.println();
      }
	}
}