
public class TestTax {

	public static void main(String[] args) {
		
		if (args.length != 3) {
			System.out.println("Please enter gross income, state and number of dependents");
			System.exit(0);
		}
		
		double grossIncome = Double.parseDouble(args[0]);
		String state = args[1];
		int dependents = Integer.parseInt(args[2]);
				
		Tax t1 = new Tax(grossIncome, state, dependents);
		double yourTax = t1.calcTax();
		System.out.println("Your tax is " + yourTax);
		Tax.convertToEuros(yourTax);		

		Tax t2 = new Tax(65000, "TX", 4);
		yourTax = t2.calcTax();
		System.out.println("His tax is " + yourTax);
		Tax.convertToEuros(yourTax);
	}
}
