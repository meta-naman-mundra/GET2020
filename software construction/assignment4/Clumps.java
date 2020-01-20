import java.util.*;

/**
 * Function to find number which are in series of 2 or more adjacent elements of
 * the same value
 * 
 * @param integer
 *            array return count of number
 */
class ArrayClumps {
	public static int countClumps(int[] arr) throws Exception {
		if (arr.length == 0) {
			throw new Exception("Empty Array");
		}
		int countClumps = 0;

		Boolean newAppearence = true;
		for (int i = 1; i < arr.length; i++) {
			if (newAppearence) {
				if (arr[i] == arr[i - 1]) {
					countClumps++;
					newAppearence = false;
				}
			} else {
				if (arr[i] != arr[i - 1]) {
					newAppearence = true;
				}
			}
		}
		return countClumps;
	}
}

class Clumps {
	public static void main(String args[]) throws Exception {
		try {
			System.out.println(ArrayClumps.countClumps(new int[] { 1, 2, 2, 3,
					4, 4 }));
			System.out.println(ArrayClumps.countClumps(new int[] { 1, 1, 2, 1,
					1 }));
			System.out.println(ArrayClumps.countClumps(new int[] { 1, 1, 1, 1,
					1 }));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}