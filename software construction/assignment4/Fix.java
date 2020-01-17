import java.util.*;

class Fix_array {
	public static int[] fixXY(int arr[], int X, int Y) throws Exception {
		if (arr.length == 0) {
			throw new Exception("Empty Array");
		} else if (arr[arr.length - 1] == X) {
			throw new Exception("X present at last");
		}
		int countX = 0, countY = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == X) {
				if (i > 0 && arr[i - 1] == X) {
					throw new Exception("Two X's are adjascent");
				}
				countX++;
			} else if (arr[i] == Y) {
				countY++;
			}
		}
		if (countX != countY) {
			throw new Exception("X's and Y's are not equal in number");
		}
		int inputIndex = 0;
		int result[] = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == X) {
				result[i] = X;
				result[++i] = Y;
			} else {
				while (arr[inputIndex] == X || arr[inputIndex] == Y) {
					inputIndex++;
				}
				result[i] = arr[inputIndex++];
			}
		}
		return result;
	}

	public static void printArray(int arr[]) {
		if (arr.length == 0)
			return;
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i + 1 < arr.length) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}

	class Fix {
		public void main(String args[]) throws Exception{
			try {
				printArray(Fix_array.fixXY(new int[] { 5, 4, 9, 4, 9, 5 }, 4, 5));
				printArray(Fix_array.fixXY(new int[] { 1, 4, 1, 5 }, 4, 5));
				printArray(Fix_array.fixXY(new int[] { 1, 4, 1, 5, 5, 4, 1 },4, 5));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}