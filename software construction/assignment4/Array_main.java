import java.util.*;

/**
 * Function to find maximum pair of number which are repeating in a reverse
 * order
 * 
 * @param integer
 *            array return maximum length
 */
class Array {
	public static int maxMirror(int[] arr) throws Exception {
		if (arr.length == 0) {
			throw new Exception("Empty Array");
		}
		int maxLength = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr.length - 1, length = 0; j > i; j--) {
				int left = i, right = j;
				while (left <= j && arr[left] == arr[right]) {
					length++;
					left++;
					right--;
				}
				if (length > 1 && maxLength < length) {
					maxLength = length;
				}
			}
		}
		return maxLength;
	}
}

class Array_main {
	public static void main(String args[]) {
		try {
			System.out.println(Array.maxMirror(new int[] { 1, 2, 3, 8, 9, 3, 2,
					1 }));
			System.out.println(Array
					.maxMirror(new int[] { 7, 1, 4, 9, 7, 4, 1 }));
		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}
}
