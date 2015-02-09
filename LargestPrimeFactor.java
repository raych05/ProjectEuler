
/**
 * Project Euler problem for CS 196:
 * 
 * Problem 3: Largest prime factor
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 * 
 * @author Raymond Cheng
 * @date Sunday, February 1, 2015
 *
 */

public class LargestPrimeFactor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//UNSOLVED!
		//to find prime number: check if number is divisible by any of all numbers below that number
		int initialNumber=13195;
		int factorToCheck=initialNumber-1;
		boolean numberDivisibleByFirstFactor=true;
		int factorOfFactor=factorToCheck-1;
		boolean firstFactorDivisibleBySecondFactor=true;
		int largestPrimeFactor=0;
		while(largestPrimeFactor==0) {
			while(factorToCheck>0 && numberDivisibleByFirstFactor==true) {
				if(initialNumber%factorToCheck!=0) {
					numberDivisibleByFirstFactor=false;
					firstFactorDivisibleBySecondFactor=false;
				}
				while(factorOfFactor>0 && firstFactorDivisibleBySecondFactor==true) {
					if(factorToCheck%factorOfFactor==0) {
						firstFactorDivisibleBySecondFactor=false;
					}
					if(factorOfFactor==1 && firstFactorDivisibleBySecondFactor==true) {
						largestPrimeFactor=factorToCheck;
						numberDivisibleByFirstFactor=false;
						firstFactorDivisibleBySecondFactor=false;
					}
					factorOfFactor--;
				}
				firstFactorDivisibleBySecondFactor=true;
				factorToCheck--;
			}
			numberDivisibleByFirstFactor=true;
		}
		System.out.println(largestPrimeFactor);
	}
}