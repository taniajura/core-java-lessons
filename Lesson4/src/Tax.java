
public class Tax {

	double grossIncome;
	String state;
	int dependents;
	static int customerCounter;
	
	Tax (double pGrossIncome, String pState, int pDependents) {
		grossIncome = pGrossIncome;
		state = pState;
		dependents = pDependents;
		customerCounter++;
		
		System.out.println("Preparing the tax data for customer #" + customerCounter);
	}
	
	double calcTax () {
		return (grossIncome * 0.33 - dependents * 100);
	}
	
	public static void convertToEuros(double taxInDollars) {
		System.out.println("Tax in Euros: " + taxInDollars/1.25);
	}
	
}
