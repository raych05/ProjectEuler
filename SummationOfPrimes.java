
/**
 * Project Euler problem for CS 196:
 * 
 * Problem 10: Summation of primes
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17. Find the sum of all the primes below
 * two million.
 * 
 * @author Raymond Cheng
 * @date Sunday, February 1, 2015
 *
 */

public class SummationOfPrimes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//note: using long rather than int because of the really large numbers
		long endValue=2000000;
		long valueToCheck=2;
		long tempToCheckPrime=valueToCheck-1;
		long sum=0;
		boolean isPrime=true;
		while(valueToCheck<endValue) {
			while(tempToCheckPrime<((valueToCheck/2)+1) && isPrime==true && tempToCheckPrime>1) {
				if(valueToCheck%tempToCheckPrime==0) {
					isPrime=false;
				}
				if(tempToCheckPrime%2==0) { //to reduce run time by a bit by skipping numbers that are multiples of 2
					tempToCheckPrime++;
				}
				else {
					tempToCheckPrime+=2;
				}
				if(tempToCheckPrime>11) { //to reduce run time by a bit by skipping numbers that are multiples of 3, 5, 7, or 11
					if(tempToCheckPrime%3==0 || tempToCheckPrime%5==0 || tempToCheckPrime%7==0 || tempToCheckPrime%11==0) {
						tempToCheckPrime+=2;
					}
				}
			}
			if(isPrime==true) {
				sum=sum+valueToCheck;
			}
			isPrime=true;
			if(valueToCheck%2==0) { //to reduce run time by a bit by skipping numbers that are multiples of 2
				valueToCheck++;
			}
			else {
				valueToCheck+=2;
			}
			if(valueToCheck>11) { //to reduce run time by a bit by skipping numbers that are multiples of 3, 5, 7, or 11
				if(valueToCheck%3==0 || valueToCheck%5==0 || valueToCheck%7==0 || valueToCheck%11==0) {
					valueToCheck+=2;
				}
			}
			System.out.println(valueToCheck);
			tempToCheckPrime=2;
		}
		System.out.println(sum);
	}

}
