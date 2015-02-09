
/**
 * Project Euler problem for CS 196:
 * 
 * Problem 6: Sum square difference
 * The sum of the squares of the first ten natural numbers is: 1^2 + 2^2 + ... + 10^2 = 385
 * The square of the sum of the first ten natural numbers is: (1 + 2 + ... + 10)^2 = 55^2 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the
 * square of the sum is 3025 - 285 = 2640. Find the difference between the sum of the squares of the
 * first one hundred natural numbers and the square of the sum.
 * 
 * @author Raymond Cheng
 * @date Sunday, February 1, 2015
 *
 */

public class SumSquareDifference {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sumOfSquares=0;
		int squareOfSums=0;
		int difference=0;
		for(int i=1;i<101;i++) {
			sumOfSquares=sumOfSquares+(i*i);
			squareOfSums=squareOfSums+i;
		}
		squareOfSums=squareOfSums*squareOfSums;
		difference=squareOfSums-sumOfSquares;
		System.out.println(difference);

	}

}
