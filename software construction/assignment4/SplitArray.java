import java.util.*;

class Split {
	public static int splitArray(int arr[]) throws Exception {
		if (arr.length == 0) {
			throw new Exception("Empty Array");
		}
		int cumulativeArr[] = new int[arr.length];
		cumulativeArr[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			cumulativeArr[i] = cumulativeArr[i - 1] + arr[i];
		}
		int sum = cumulativeArr[arr.length - 1];
		for (int i = 0; i < arr.length; i++) {
			if (cumulativeArr[i] == sum - cumulativeArr[i]) {
				return i + 1;
			}
		}
		return -1;
	}
}

class SplitArray {
	public static void main(String args[]) {
		try {
			System.out.println(Split.splitArray(new int[] { 1, 1, 1, 2, 1 }));
			System.out.println(Split.splitArray(new int[] { 2, 1, 1, 2, 1 }));
			System.out.println(Split.splitArray(new int[] { 10, 10 }));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}