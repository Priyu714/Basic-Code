import java.util.*;

public class Count_vowels_consonant
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
		System.out.println("ENTER YOUR STRING :");
		String str= sc.nextLine();
		int vcount =0, ccount=0;
		for(int i=0;i<str.length();i++)
		{
		    if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u')
		    {
		        vcount++;
		    }
		    
		    else if(str.charAt(i)>='a' &&str.charAt(i)<='z')
		    {
		        ccount++;
		    }
		}
		System.out.println("vowels: " +vcount);
		System.out.println("consonant: " +ccount);
	}
}

