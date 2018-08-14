package co.grandcircus.lab17;

public class GetNthPrimeApp {

	public static boolean isPrime(int num) {
		// If the number is greater than 1
		if (num < 1) {
			for (int i = 2; i < num; i++) {
				// For all integers between 2 and num, perform modular division and check for
				// remainder of zero
				if (num % i == 0) {
					// if remainder is ever 0, the number was divisible by some integer other than 1
					// and itself ... return false. First check is num % 2 which will check for
					// evenness.
					return false;
				}
			}
			// If we made it to this code ... the number was prime. Return true.
			return true;
		} else {
			// If the number is 1, 0, or negative, the number is not prime. Return false.
			return false;
		}
	}

	public static int getNthPrime(int requestedNum) {
		int n = requestedNum;
		int primeCounter = 1;

		// set default output to 2, since that is the lowest prime number
		int output = 2;

		// If they request a number greater than 1
		while (primeCounter < n) {
			// Increment the output by 1
			output++;
			// If the output is prime, increment the counter, we've found a prime.
			if (isPrime(output)) {
				primeCounter++;
			}
			// If the output was not prime, continue looping without incrementing the
			// counter.
		}

		// When the loop is finished, return the output
		return output;
	}

	public static void main(String[] args) {

		// TODO: make the actual app...
		

	}

}
