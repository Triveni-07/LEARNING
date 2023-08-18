import java.util.Scanner;

public class TemperatureConversionusingSwitch {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome to the Temperature Conversion Tool!");
		System.out.println("Select an option: \n"+"1.Convert Celsius to Fahrenheit\n"+"2. Convert Fahrenheit to Celsius");
		System.out.println("Enter your choice: ");
		int ch=scan.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Enter the temperature in celsius: ");
			double celsius=scan.nextDouble();
			double res=celsiusToFahrenheit(celsius);
			System.out.println(celsius+"C is equivalent to "+res+"F");
			break;
		case 2:
			System.out.println("Enter the temperature in Fahrenheit: ");
			double fahrenheit=scan.nextDouble();
			double res1=FahrenheitTocelsius(fahrenheit);
			System.out.println(fahrenheit+"F is equivalent to "+res1+"C");
			break;
		default:
			System.out.println("Error...");
		}
		scan.close();
	}
	public static double celsiusToFahrenheit(double celsius) {
		return (celsius * 9/5)+32;
	}
	public static double FahrenheitTocelsius(double fahrenheit) {
		return(fahrenheit - 32)*5/9;
	}
}
