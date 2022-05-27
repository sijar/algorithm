/**
 * The class FermatLastTheorem is reposibile for...
 *
 * <p>
 * Sijar Ahmed (sijar.ahmed@gmail.com), created on 10/2/2020 at 1:57 PM
 * Copyright
 */
public class FermatLastTheorem {

	//a^n+b^n=c^n (no solution for n>2)
	// where a,b,c and n are all integers
	private static void printFermatRoots() {
		try {
			for (int n = 3; ; ++n) {
				for (long c = 1; c < Long.MAX_VALUE; ++c) {
					for (long a = 1; a < Long.MAX_VALUE; ++a) {
						for (long b = 1; b < Long.MAX_VALUE; ++b) {
							long bpow = (int) Math.pow(b, n);
							long apow = (int) Math.pow(a, n);
							long cpow = (int) Math.pow(c, n);
							//a^n+b^n=c^n
							if (apow + bpow > Long.MAX_VALUE) break;
							else if (apow + bpow > cpow) break;
							else if (apow + bpow == cpow) System.out.println(apow + " + " + bpow + " <EQUALS> " + cpow + " a=" + a + ", b=" + b + ", c=" + c + ", n=" + n);
							//else System.out.println(apow + " + " + bpow + " <NOT-EQUAL> " + cpow + " a=" + a + ", b=" + b + ", c=" + c + ", n=" + n);
						}
					}
				}
			}
		} catch (Exception e) {
			System.out.println("exception occurred!, will continue..." + e.getMessage());
		}
	}

	public static void main(String[] args) {
		FermatLastTheorem.printFermatRoots();
	}

}
