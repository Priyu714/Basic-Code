import java.util.*;

class prime_123
{
	public static void main(String[] args) 
	{
	    while (true)
	    {
	    boolean flag = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numer ");
        int num = sc.nextInt();

        for(int i = 2; i <= num/2 ; ++i)
        {
            if(num % i == 0)
                {
                    flag = false;
                    break;
                }
            //else 
            //    continue;
        }
        
        if(num == 1 || num == 0) 
            System.out.println(num +" is neither prime nor composite");
            
        else if(num ==2 || flag)
            System.out.println(num +" is prime num");
        
        else
            System.out.println(num + "is not prime number i.e. its composite number");
		
	}
}
}