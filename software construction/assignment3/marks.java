import java.util.*;

/**
 * Design a class marksheet, which reads in grades of n no of students. Assume n
 * as a positive integer and grades will be between 0 and 100 both inclusive.
 * 
 * 
 *
 */

class Marksheet {
	private int count;
	private int grades[];
	private static final int passingMark = 40;

	/**
	 * Takes input grades of n students
	 * 
	 * @param count
	 *            of students in class
	 */
	public Marksheet(int count, Scanner input) {
		this.count = count;
		grades = new int[count];
		System.out.println("Enter grade of student no.:");
		for (int i = 0; i < count; i++) {
			System.out.print((i + 1) + ". ");
			grades[i] = input.nextInt();
			input.nextLine();
		}
	}

	/**
	 * @return average of the student
	 * @throws Exception
	 */
	public float getAverage() throws Exception {
		if (count == 0) {
			throw (new Exception("divide by zero"));
		}
		int total=0;
		for(int g: grades){
			total+=g;
		}
		return total / count;
	}

	/**
	 * @return max_grade
	 */
	public float getMaximum() {
		int maximum=0;
		for(int g: grades){
			if(g>maximum){
			//	System.out.println(g);
				maximum=g;
			}
		}
		return maximum;
	}

	/**
	 * @return minimun grade
	 */
	public float getMinimum() {
		int minimum=100;
		for(int g: grades){
			if(g<minimum){
				minimum=g;
			}
		}
		return minimum;
	}

	/**
	 * @return percentage of the students
	 */
	public float getPassedPercentage() {
		int passed = 0;
		for(int g: grades){
			if(g>=passingMark){
				passed++;
			}
		}
		return ((float) passed * 100) / count;
	}
};

public class marks {
	public static void main(String args[]) throws Exception {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter no. of students:");
		int count = input.nextInt();
		input.nextLine();

		if (count == 0)
			throw (new Exception("Empty Class"));

		Marksheet m = new Marksheet(count, input);

		System.out.println("Average: " + m.getAverage());
		System.out.println("Maximum: " + m.getMaximum());
		System.out.println("Minimum: " + m.getMinimum());
		System.out.println("Percentage of passed students: "
				+ m.getPassedPercentage());
	}
}