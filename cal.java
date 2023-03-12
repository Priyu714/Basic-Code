import java.util.*;

public class cal
{
	public static void main(String[] args) 
	{
	    
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter First number:");
	    int num1=sc.nextInt();
	    System.out.println("Enter second number:");
	    int num2=sc.nextInt();
	    
	     System.out.println("Enter operator:");
	     char test=sc.next().charAt(0);
	     
         switch(test)
         {
            case '+' :
                System.out.println("Addition of " + num1 + " and " + num2 + " is "+(num1+num2));
                break;
            
            case '-' :
                System.out.println("substraction of " + num2 + " and " + num1 + " is "+(num2-num1));
                break;
            
        
            case '*' :
                System.out.println("multiplication of " + num1 + " and " + num2 + " is" +(num1*num2));
                break;
        
            case '/' :
                System.out.println("division of " + num1 + " and " + num2 + " is "+(num1/num2));
                break;
        
            default :
                System.out.println("Invalid operator");
         }
	     
	}
}
