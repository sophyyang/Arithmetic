
import java.math.*;
import java.util.*;

/*
 * parseDouble
 * MAX_VALUE
 * MIN_VALUE
 * parseInt
 * PI abs cos exp log log10 max min pow rond sin sqrt tan toDegrees to Radians
 * add multiply sbutract //java.math.BigDecimal java.math.BigInteger
 * prime number: 2,3,5,7,11.....
 * 2015-12-21 checkin to GitHub repository Arithmetic
 * https://github.com/sophyyang/Arithmetic/blob/master/Arithmetic/src/Arithmetic.java
 * https://github.com/sophyyang/Arithmetic.git
 */
import java.util.Arrays;

public class Arithmetic {

	public static void main(String[] args) {
		int [] primes = {2,3,5,7,11};
		System.out.println("First 5 prime number: " + Arrays.toString(primes));

		double x1 = 3;
		double y1 = 4;
		double x2 = 3;
		double y2 = 3;

		double distance1 = Math.sqrt((Math.pow(x1 - x2, 2) + Math.pow((y1 - y2), 2)));

		System.out.print("Distance: ");
		System.out.println(distance1);

		int h1 = 0;
		int v1 = 0;
		int h2 = 6;
		int v2 = -4;

		int distance = Math.abs(h2 - h1) + Math.abs(v2 - v1);

		System.out.print("Distance(" + h1 + "," + v1 + ") to (" + h2 + "," + v2 + "): ");
		System.out.println(distance);

		Random randomGenerator = new Random();
		int randomInt = 0;

		for (int i = 1; i < 10; i++) {
			randomInt = randomGenerator.nextInt(10);
			h1 = randomInt;
			randomInt = randomGenerator.nextInt(10);
			v1 = randomInt;
			randomInt = randomGenerator.nextInt(10);
			h2 = randomInt;
			randomInt = randomGenerator.nextInt(10);
			v2 = randomInt;

			distance = Math.abs(h2 - h1) + Math.abs(v2 - v1);

			System.out.print("Distance(" + h1 + "," + v1 + ") to (" + h2 + "," + v2 + "): ");
			System.out.println(distance);
		}

		int index = 10;
		double[] n1 = { 0, 0, 0, 0, 0, 0, 0,0,0,0 };

		n1[0] = Math.pow(10, 3);
		n1[1] = Math.sqrt(100);
		n1[2] = Math.abs(3 - 10);
		n1[3] = Math.log10(1000);
		n1[4] = Math.max(3, -10);
		n1[5] = Math.log(1000);
		n1[6] = Math.sqrt(4);
		n1[7] = Math.round(-24.8f);
		n1[8] = Math.min(24, 240);
		n1[9] = Math.random();

		for (int i = 0; i < index; i++) {
			System.out.println("Math " + i + ". " + n1[i]);
		}

		System.out.println("===========================");

		int m = 2;
		int n = 2;
		if (m * m == n) {
			System.out.println("2 times 2 is four.");
		}

		double x = Math.sqrt(2);
		double y = 2.0;
		if (x * x == y) { // floating-point number common error
			System.out.println("sqrt(2) times sqrt(2) is 2");
		} else {
			System.out.printf("sqrt(2) times sqrt(2) is not two but %.18f\n", x * x);
		}

		final double EPSILON = 1E-14; // epsilon used to denote a very small
										// quantity.
		// It is command to set to 1E-14
		if (Math.abs(x * x - y) < EPSILON) {
			System.out.println(
					"sqrt(2) times sqrt(2) is approximately 2. (" + Math.abs(x * x - y) + ") Epsilon = " + EPSILON);
		}

		String s = "120";
		String t = "20";
		int result = s.compareTo(t);
		String comparison;
		if (result < 0) {
			comparison = "comes before"; // string 120 < string 20
		} else if (result > 0) {
			comparison = "come after";
		} else {
			comparison = "is the same as";
		}
		System.out.printf("The strings \"%s\" %s the string \"%s\"\n", s, comparison, t);

		String u = "1" + t; // s= string 120 u = string 120 equals not == same
		System.out.printf("The strings \"%s\" and \"%s\" are ", s, u);
		if (s != u) {
			System.out.print("not ");
		}
		System.out.print("identical. They are ");
		if (!s.equals(u)) {
			System.out.print("not ");
		}
		System.out.println("equal.");
		
		System.out.println("Return random number between a and b-a, a= 1 b= 5  ( 5 * Math.random() + 1 ): " +( 5 * Math.random()) );

		System.out.println("===========================");

	}
}