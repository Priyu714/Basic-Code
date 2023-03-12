import java.util.*;

public class Word_separator
{
	public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str= sc.nextLine();

        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=' ') 
                System.out.print(str.charAt(i));
            else
                System.out.println(str.charAt(i));
                
        }
	}
}
