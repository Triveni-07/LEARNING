import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a two numbers");
		long num1=scan.nextLong();
		long num2=scan.nextLong();
		System.out.println(galaticAddition(num1,num2));

	}
	public static long galaticAddition(long num1,long num2) {
		return num1+num2;
	}

}
