import java.util.*;

class Factor {
	/**
	 * 
	 * @param a
	 *            integer
	 * @param b
	 *            integer
	 * @return HCF
	 */
	public static int HCF(int a, int b) {
		if (a == 0)
			return b;
		if (b == 0)
			return a;
		if (a == b)
			return a;
		if (a > b)
			return HCF(a % b, b);
		return HCF(a, b % a);
	}

	/**
	 * 
	 * @param a
	 *            integer
	 * @param b
	 *            integer
	 * @return LCM
	 * @throws Exception
	 */

	public static int LCM(int a, int b) throws Exception {
		int hcf = HCF(a, b);
		if (hcf == 0) {
			throw new Exception("Divide By Zero");
		}
		return (a * b) / HCF(a, b);
	}
}
