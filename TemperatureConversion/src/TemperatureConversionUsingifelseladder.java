import java.util.Scanner;

public class TemperatureConversionUsingifelseladder {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
        
        System.out.println("Welcome to the Temperature Conversion Tool!");
        System.out.println("Select an option:\n1. Convert Celsius to Fahrenheit\n2. Convert Fahrenheit to Celsius");
        System.out.println("Enter your choice: ");
        int choice = scan.nextInt();
        
        if (choice == 1) {
            System.out.println("Enter the temperature in Celsius: ");
            double celsius = scan.nextDouble();
            double fahrenheit = celsiusToFahrenheit(celsius);
            System.out.printf("%.1f°C is equivalent to %.1f°F%n", celsius, fahrenheit);
        } else if (choice == 2) {
            System.out.println("Enter the temperature in Fahrenheit: ");
            double fahrenheit = scan.nextDouble();
            double celsius = fahrenheitToCelsius(fahrenheit);
            System.out.printf("%.1f°F is equivalent to %.1f°C%n", fahrenheit, celsius);
        } else {
            System.out.println("Invalid choice. Please select either 1 or 2.");
        }
        scan.close();
	}
	public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

}
