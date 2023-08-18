import java.util.Scanner;

public class TaxCalculator {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);

	        System.out.print("Enter the purchase amount: ");
	        double purchaseAmount = scan.nextDouble();

	        System.out.print("Enter the tax rate (in decimal form): ");
	        double taxRate = scan.nextDouble();
	        calculateTotalWithTax(purchaseAmount,taxRate);

	}
	 public static void calculateTotalWithTax(double purchaseAmount, double taxRate) {
		 double taxAmount = purchaseAmount * taxRate;
	     double totalCost = purchaseAmount + taxAmount;
	     System.out.println("Totalcost including tax:"+totalCost);
	 }

}
