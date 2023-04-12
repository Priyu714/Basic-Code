import java.util.*;

public class Calci123 {
	public static void main(String[] args) {
		System.out.println("Welcome to my calci program");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number:");
		int num1 = sc.nextInt();
		System.out.println("Enter second number:");
		int num2 = sc.nextInt();

		System.out.println("Enter operator:");
		char test = sc.next().charAt(0);

		if (test == '+')
			System.out.println("Addition of " + num1 + " and " + num2 + " is " + (num1 + num2));
		else if (test == '-')
			System.out.println("substraction of " + num1 + " and " + num2 + " is " + (num2 - num1));
		else if (test == '*')
			System.out.println("multiplication of " + num1 + " and " + num2 + " is" + (num1 * num2));
		else
			System.out.println("division of " + num1 + " and " + num2 + " is " + (num1 / num2));

	}
}
