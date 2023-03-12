import java.util.*;

public class Prime_up2_N_fun
{
	public static void main(String[] args)
	{
	    
	    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numer ");
        int num = sc.nextInt();
        
        System.out.println("prime number from 1 to "+num);
        System.out.print("2");
        for(int i = 3; i <= num; i++)
        {
            if(Prime(i))
              System.out.print("," +i);
        }
	}
    
    static boolean Prime(int num)
    {
        boolean flag = true;
        for(int j = 2; j < num/2; j++)
        {
            if(num % j == 0)
            {
                flag = false;
                break;
            }
        }
        return flag;
    }
   
}
