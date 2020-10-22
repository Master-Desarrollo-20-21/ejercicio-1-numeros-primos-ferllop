public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println(sumPrimesInFirst50Numbers());
		System.out.println(sumFirst50Primes());
	}

	private static int sumPrimesInFirst50Numbers() {
		int result = 0;

		for (int mayBePrime = 2; mayBePrime <= 50; mayBePrime++) {
			int primeTester = 2;
			while (mayBePrime % primeTester != 0 && primeTester < mayBePrime) {
				primeTester++;
			}

			if (primeTester == mayBePrime) {
				result += mayBePrime;
			}
		}

		return result;
	}

	private static int sumFirst50Primes() {
		int foundPrimesCounter = 0;
		int result = 0;

		for (int mayBePrime = 2; foundPrimesCounter < 50; mayBePrime++) {
			int primeTester = 2;
			while (mayBePrime % primeTester != 0 && primeTester < mayBePrime) {
				primeTester++;
			}

			if (primeTester == mayBePrime) {
				foundPrimesCounter++;
				result += mayBePrime;
			}
		}

		return result;
	}

}
