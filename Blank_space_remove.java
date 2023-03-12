import java.util.*;
public class blank_space_remove
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
		System.out.println("ENTER YOUR STRING :");
		String str= sc.nextLine();
		String str2= "";
		for(int i=0;i<str.length();i++)
		{
		    if(str.charAt(i)!=' ')
		    {
		       str2=str2+str.charAt(i);
		    }
		    else 
		       continue;
		}
	    System.out.println(str2);
	}
}