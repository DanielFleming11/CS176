
public class ArrayAssignment1 {

	public static void main(String[] args) {

		double[] values = new double[] {25.3, 100, -10, -1.5, 13, 98.6, 17, 123.145, 125.6, 123.146};
		
// Print all values
		for(double num: values) {
			System.out.print(num + " ");
		}
		
// Print max
		double max = 0;
		for(double num: values) {
			if(num > max) {
				max = num;
			}
		}
		System.out.println("");
		System.out.println("");
		System.out.println("The max number is: " + max);
		
//Negative Numbers
		int count = 0;
		for(double num: values) {
			if(num < 0) {
				count ++;
			}
		}
		System.out.println("");
		System.out.println("There are " + count + " negative numbers in the array.");
	}

}
