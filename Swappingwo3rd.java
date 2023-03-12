import java.util.*;
public class Swappingwo3rd
{
	public static void main(String[] args) 
	{
        int temp;
	    Scanner sc=new Scanner (System.in);
	    
		System.out.println("Enert the 1st number");
		int num1 = sc.nextInt();
		
		System.out.println("Enert the 2nd number");
		int num2 = sc.nextInt();
		
		System.out.println("Before Swapping");
		System.out.println(num1);
		System.out.println(num2);
		System.out.println("-------------------------------------------");
		
	    num1=num1+num2;
	    num2=num1-num2;
	    num1=num1-num2;
		
		System.out.println("After swapping:");
		System.out.println(num1);
		System.out.println(num2);
	
    }
}
	