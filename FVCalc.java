// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int current = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]) / 100;
		int years = Integer.parseInt(args[2]);

		double future = current * Math.pow((1 + rate), years);

		System.out.println("After " + years + " years, $" + current +
							 " saved at " + rate * 100 + "% will yield $" +
							  (int) future);

	}
}