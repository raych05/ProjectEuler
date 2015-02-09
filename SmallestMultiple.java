
/**
 * Project Euler problem for CS 196:
 * 
 * Problem 5: Smallest multiple
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without
 * any remainder. What is the smallest positive number that is evenly divisible by all of the
 * numbers from 1 to 20?
 * 
 * @author Raymond Cheng
 * @date Sunday, February 1, 2015
 *
 */

public class SmallestMultiple {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int possibleMultiple=20;
		boolean isDivisible=true;
		int currentDividingNumber=1;
		int smallestMultiple=0;
		while(smallestMultiple==0) {
			while(currentDividingNumber<21 && isDivisible==true) {
				if(possibleMultiple%currentDividingNumber!=0) {
					isDivisible=false;
				}
				currentDividingNumber++;
			}
			if(isDivisible==true) {
				smallestMultiple=possibleMultiple;
			}
			possibleMultiple++;
			currentDividingNumber=1;
			isDivisible=true;
		}
		System.out.println(smallestMultiple);
	}

}
