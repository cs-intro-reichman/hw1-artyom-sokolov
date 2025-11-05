// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		int num1 = (int)(Math.random() * lim);
		int num2 = (int)(Math.random() * lim);
		int num3 = (int)(Math.random() * lim);
		int temp;

		temp = Math.max(num1, num2);
		int maximum = Math.max(num3, temp);

		temp = Math.min(num1, num2);
		int minimum = Math.min(num3, temp);

		int mid = Math.min(Math.min(Math.max(num1, num2), 
							Math.max(num2, num3)), Math.max(num1, num2));

		System.out.println(minimum + " " + mid + " " + maximum);



	}
}
