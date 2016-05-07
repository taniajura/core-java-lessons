
public class TestTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tax t = new NJTax(); // creating an instance
		
		// assigning values to the class members
		t.grossIncome = 50000;
		t.dependents = 2;
		t.state = "NJ";
		
		double yourTax = t.calcTax(); // calculating tax
		
		// printing the result
		
		System.out.println("Your tax is " + yourTax);
	}

}
