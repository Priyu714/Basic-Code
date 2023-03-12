import java.util.*;
public class Countdigit
{
	public static void main(String[] args) 

	{
	    int count=0;
	    Scanner sc=new Scanner (System.in);
	    
		System.out.println("Enert the number");
		int num = sc.nextInt();
		
		while(num!=0)
		{
		    count++;
		    num=num/10;
		       
		}
		System.out.println(count);
	}
}