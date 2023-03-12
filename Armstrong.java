import java.util.*;

public class Armstrong
{
	public static void main(String[] args) 
	{
		int rem,sum=0,count=0;
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number :");
        int num = sc.nextInt();
        int temp=num;
        //to count the digit 
        while(num!=0)
		{
		    count++;
		    num=num/10;
		}
		
		//to get the number 
		num=temp;
		for(;num!=0;)
		{
		    int result=1;
		    rem=num%10;
		    //to multiply the rem by no of count 
		    for(int i=1;i<=count;i++)
		        result *= rem;
		     
		    sum += result;
		    num /= 10;
		}
		   
       
        if(temp==sum)
            System.out.println(temp +"  is Armstrong number.");
            
            else
            System.out.println(temp +"  is not Armstrong number.");
        
	}
}