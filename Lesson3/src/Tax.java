
public class Tax {

	double grossIncome;
	String state;
	int dependents;
	
	public double calcTax() {
		
		double stateTax = 0;
		
		if (this.grossIncome > 30000) {
			stateTax = this.grossIncome * 0.05;
		}
		else {
			stateTax = this.grossIncome * 0.06;
		}
		
		return stateTax;
	}
}
