import java.util.*;

public class Reverse_save_string
{
	public static void main(String[] args) 
	{
	    
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str= sc.nextLine();
        String result="";

        for(int i=str.length()-1;i>=0;i--)
            result=result+str.charAt(i);
            
        System.out.println(result);
	}
}
