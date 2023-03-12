import java.util.*;

public class Prime_num_fun
{
	public static void main(String[] args)
	{
	    
	    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numer ");
        int num = sc.nextInt();

        if(num == 1 || num == 0) 
            System.out.println(num +" is neither prime nor composite");
            
        else
        {
            
           boolean result= prime(num);
       
           if(result)
              System.out.println(num +" is prime num");
        
           else
              System.out.println(num + " is not prime number i.e. its composite number");
            
        }
        
    }
    
    static boolean prime(int num)
    {
        boolean flag = true;
        
        for(int i = 2; i <= num/2 ; ++i)
        {
            if(num % i==0)
            {
                flag=false;
                break;
            }
            else
                continue;
            
        }
        return flag;
    }

}