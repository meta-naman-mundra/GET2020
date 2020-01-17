import java.util.*;

/**
 * Design a class that perform following operations on Strings, without using
 * Java APIs. Assume strings to be not null and case sensitive.
 * 
 * 
 */
class String_operation {
	/**
	 * comparison of the strings
	 * 
	 * @param str
	 *            strings
	 * @param str1
	 *            strings
	 * @return boolean value
	 */
	boolean compare(String str, String str1) {
		if (str.length() != str1.length()) {
			return false;
		} else {
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) != str1.charAt(i)) {
					return false;
				}
			}
			return true;
		}
	}

	/**
	 * String reverse function
	 * 
	 * @param str
	 *            String
	 * @return reverse string
	 */
	public String reverse(String str) {
		String reverse = new String();
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		return reverse;
	}

	/**
	 * String transformation
	 * 
	 * @param str
	 *            String
	 * @return Transformed string
	 */
	public String transform(String str) {
		String transform = new String();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				transform += (char) (str.charAt(i) - 32);
			} else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				transform += (char) (str.charAt(i) + 32);
			} else {
				transform += str.charAt(i);
			}

		}
		return transform;

	}

	/**
	 * String Function to calculate largest word in a string
	 * 
	 * @param str
	 *            string
	 * @return largest world
	 */
	public String Longest_string(String str) {
		String largest = new String();
		int length = 0;

		String localLargest = new String();
		int localLength = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ' && i + 1 < str.length()) {
				localLength++;
				localLargest += str.charAt(i);
			} else {
				if (str.charAt(i) != ' ') {
					localLength++;
					localLargest += str.charAt(i);
				}
				if (length <= localLength) {
					length = localLength;
					largest = localLargest;
				}
				localLength = 0;
				localLargest = "";
			}
		}
		return largest;
	}

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		String_operation s = new String_operation();
		Boolean active = true;
		while (true) {
			System.out.println("Enter Your Choice:");
			System.out.println("1. Compare two strings");
			System.out.println("2. Reverse a string");
			System.out.println("3. Transform a string");
			System.out.println("4. Find largest word in a string");
			System.out.println("5. Exit");

			int c = input.nextInt();
			input.nextLine();
			switch (c) {
			case 1: {
				System.out.println("Enter a string:");
				String str = input.next();
				System.out.println("Enter a string:");
				String str1 = input.next();
				System.out.println(s.compare(str, str1));
				break;
			}
			case 2: {
				System.out.println("Enter a string:");
				String str = input.next();
				System.out.println(s.reverse(str));
				break;
			}
			case 3: {
				System.out.println("Enter a string:");
				String str = input.next();
				System.out.println(s.transform(str));
				break;
			}
			case 4: {
				System.out.println("Enter a String:");
				String str = input.nextLine();
				System.out.println(s.Longest_string(str));
				break;
			}
			case 5: {
				active = false;
				break;
			}
			default: {
				System.out.println("Enter a valid choice");
			}

			}
		}
	}
}