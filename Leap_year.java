import java.util.*;
public class Leap_year
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner (System.in);
        System.out.println("enter the number :");
        int year = sc.nextInt();
        
        if( year % 4 !=0)
          System.out.println("it's not leap year.");
          
        else if( year % 100 != 0)
          System.out.println("it's  leap year.");
          
        else if(year % 400 != 0)
          System.out.println("it's not leap year.");
        
        else
          System.out.println("it's  leap year.");
          
	}
}