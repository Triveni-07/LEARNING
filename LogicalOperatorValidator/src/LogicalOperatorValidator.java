import java.util.Scanner;

public class LogicalOperatorValidator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        System.out.println("Is input valid (true/false): ");
        boolean m1 = scan.nextBoolean();

        System.out.println("Does input meet a certain condition (true/false): ");
        boolean m2 = scan.nextBoolean();
        isValidInput(m1,m2);
	}
	public static void isValidInput(boolean m1, boolean m2) {
		if(m1 && m2) {
			System.out.println("Input is Valid");
		}
		else {
			System.out.println("Input is invalid");
		}
         
    }

}
