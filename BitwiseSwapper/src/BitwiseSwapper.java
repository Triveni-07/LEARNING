import java.util.Scanner;

public class BitwiseSwapper {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first integer:");
		int num1=scan.nextInt();
		System.out.println("Enter the second integer:");
		int num2=scan.nextInt();
		swapUsingBitwise(num1,num2);
	}
	public static void swapUsingBitwise(int num1,int num2) {
		int temp=num1^num2;
		num2=num1^temp;
		num1=num2^temp;
		System.out.println("After swapping: first="+num2+", second ="+num1);
	}

}
