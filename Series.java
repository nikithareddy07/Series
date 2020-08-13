/*Author:Passya.Nikitha Reddy
 * Date:09/29/18
 *Time:10.00 pm
 *Purpose:Assignment 4
 */

package DriverSeries;

public class Series {

	public static int nSum(int n) {
		// Java Program to find Sum of N Natural Numbers
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum = sum + i;
		}
		return sum;
	}

	public static int factorial(int n) {
		// Java Program to find the factorial of N Numbers
		int c, fact = 1;
		if (n == 0)
			return 0;
		for (c = 1; c <= n; c++)
			fact = fact * c;

		return fact;

	}

	public static int fibonacci(int i) {
		// Java Program to find the fibonacci number
		int previousNumber = 0;
		int nextNumber = 1;
		int sum = 0;
		if (i == 0)
			return 0;
		if (i == 1)
			return 1;
		for (int j = 2; j <= i; ++j) {
			/*
			 * On each iteration, we are assigning second number to the first number and
			 * assigning the sum of last two numbers to the second number
			 */
			sum = previousNumber + nextNumber;
			previousNumber = nextNumber;
			nextNumber = sum;
		}
		return sum;
	}
}
