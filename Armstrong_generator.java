import java.util.*;

public class Armstrong_generator
{
    public static void main(String[] args)
    {
        int count=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();

        System.out.println("Armstrong number from 1 to "+num);
        System.out.print("1");
        for(int i = 2; i <= num; i++)
        { 
            if(IsArmstrong(i))
            {
                count++;
                System.out.print("," +i);
            }     
        }
       //Counting the armstrong number 
        System.out.print("\nThere are "+count +" Armstrong");

    }

    static boolean IsArmstrong(int i)
    {
       int rem,sum=0,count=0;
       boolean flag=true;
        int temp=i;
        while(i!=0)
		{
		    count++;
		    i=i/10;
		}
        i=temp;
		for(;i!=0;)
		{
		    int result=1;
		    rem=i%10;
		    //to multiply the rem by no of count 
		    for(int j=1;j<=count;j++)
		        result *= rem;
		     
		    sum += result;
		    i /= 10;
        }
        if(temp!=sum)
           flag=false;
            
        
        return flag;        
    }
}
