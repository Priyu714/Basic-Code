import java.util.*;

public class Concatenation_strings
{
	public static void main(String[] args) 
	{
	    String result="";
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 1st string");
        String str1= sc.nextLine();
        System.out.println("enter the 2nd string");
        String str2= sc.nextLine();
        int len =str1.length()+str2.length();
      

        for(int i=0;i<len;i++)
        {
           result=str1+str2;
        }
         System.out.println("contenation of two Strings:");
        System.out.println(result);
	}
}
