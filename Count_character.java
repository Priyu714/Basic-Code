import java.util.*;
public class Count_character
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
		System.out.println("ENTER YOUR STRING :");
		String str= sc.nextLine();
		int count =0;
		for(int i=0;i<str.length();i++)
		{
		    if(str.charAt(i) !=' ')
		    {
		        count++;
            }
		}
		System.out.println(count);
	}
}