import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the name and year of birth");
		String name=scan.nextLine();
		int yob=scan.nextInt();
		greet(name);
		int res=Calculateage(yob);
		System.out.println("you are "+res+" years old");
	}
	public static void greet(String name) {
		System.out.println("Hello "+name);
	}
	public static int Calculateage(int yob) {
		return 2023-yob;
	}

}
