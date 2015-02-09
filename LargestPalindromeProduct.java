
/**
 * Project Euler problem for CS 196:
 * 
 * Problem 4: Largest palindrome product
 * A palindromic number reads the same both ways. The largest palindrome made from the product of
 * two 2-digit numbers is 9009 = 91 × 99. Find the largest palindrome made from the product of
 * two 3-digit numbers.
 * 
 * @author Raymond Cheng
 * @date Sunday, February 1, 2015
 *
 */

public class LargestPalindromeProduct {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//UNSOLVED!
		int firstNumber=100;
		int secondNumber=100;
		int product=-1;
		int largestPalindrome=0;
		while(firstNumber<1000) {
			while(secondNumber<1000) {
				product=firstNumber*secondNumber;
				//check if product is palindrome (by going through number with /10 or %10 and changing to another reversed number and comparing?)
				secondNumber++;
			}
			secondNumber=100;
			firstNumber++;
		}

	}

}
