import java.util.*;

public class Power
{
	public static void main(String[] args) 
	{
	    int result=1;
	    Scanner sc= new Scanner(System.in);
		System.out.println("Enter the 1st Number:");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the 2nd Number:");
		int num2= sc.nextInt();
		
		for(int i=1;i<=num2;i++)
		{
		    result=result*num1;
		}
			System.out.println(result);
		
	}
}