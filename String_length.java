import java.util.*;

public class String_length
{
	public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str= sc.nextLine();
        
        int i = 0;
        try {
                while (true) {
                str.charAt(i);
                i++;
            }
        } catch (IndexOutOfBoundsException e) {
        System.out.println(i);
       }
	}

}
