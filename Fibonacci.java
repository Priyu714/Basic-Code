import java.util.*;

public class Fibonacci
{
	public static void main(String[] args) {
		
		int a,b,c;
        a=0;
        b=1;
        
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the nuber ");
        int n = sc.nextInt();
        System.out.println("FIBONACCI SERIES : ");
        
         System.out.print("0,1");
        for(int i=0;i<=n;i++)
        {
            c = a + b;
        
            System.out.print( "," + c );
            a = b;
            b = c;
        }
          
          
	}
}
