import com.practicaljava.lesson6.Contractor;
import com.practicaljava.lesson6.Employee;
import com.practicaljava.lesson6.ForeignContractor;
import com.practicaljava.lesson6.Payable;

public class TestPayIncreaseolyError {

	public static void main(String[] args) {

		Payable workers[] = new Payable[3];

		workers[0] = new Employee("John");
		workers[1] = new Contractor("Paul");
		workers[2] = new ForeignContractor("Siva");

		for (Payable p: workers) {
			
			p.increasePay(30);
		}
		
	}

}
