import java.util.*;

public class Vowel_low_to_upper
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter the String :");
		String str=sc.nextLine();
		char[] ch=str.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
		    if(ch[i]=='a')
		      ch[i]='A';
		    else if(ch[i]=='e')
		      ch[i]='E';
		    else if(ch[i]=='i')
		      ch[i]='I';
		    else if(ch[i]=='o')
		      ch[i]='O';
		    else if(ch[i]=='u')
		      ch[i]='U';
		    else
		      continue;
		}
		System.out.print(ch);
	}
}
