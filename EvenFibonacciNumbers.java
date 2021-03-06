
/**
 * Project Euler problem for CS 196:
 * 
 * Problem 2: Even Fibonacci numbers
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms.
 * By starting with 1 and 2, the first 10 terms will be: 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million,
 * find the sum of the even-valued terms.
 * 
 * @author Raymond Cheng
 * @date Sunday, February 1, 2015
 *
 */

public class EvenFibonacciNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int firstValue=1;
		int secondValue=2;
		int tempThirdValue=0;
		int sum=0;
		while(secondValue<4000000) {
			if(secondValue%2==0) {
				sum=sum+secondValue;
			}
			tempThirdValue=firstValue+secondValue;
			firstValue=secondValue;
			secondValue=tempThirdValue;
		}
		System.out.println(sum);
	}

}
