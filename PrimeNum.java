package Basic;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
       
        int i;
        System.out.print("2");
        
        for(i =3; i<=num; i++)
        {
            boolean flag = false;
            for(int j=2; j<i; j++)
            {
                 
                if(i%j==0)
                {
                    flag=true;
                    break;
                }
                
            }  
            if(!flag)
               System.out.print( "," +i);
            
        }

	}

}
