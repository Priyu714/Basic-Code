package Assignment_All;

public class Odd_Even_Number_Array 
{

	public static void main(String[] args) 
	{
		int n, j = 0, k = 0;
		
		int a[]=new int[] {10,11,7,4,8,19,21,30}; //Original array
		
		n=a.length;
		
		int odd[]=new int[n];  //array for odd number
		int even[]=new int [n]; //array for even number
		
		for(int i=0;i<n;i++)
		{
			if(a[i] % 2 != 0)    //logic for Odd number 
            {
                odd[j] = a[i];   //storing odd number in odd array
                j++;
            }
            else                 // logic for even number 
            {
                even[k] = a[i];    //storing even number in even array
                k++;
            }
		}
      
		 System.out.print("Odd:");// printing odd Number
	        if(j > 1)
	        {
	            for(int i = 0;i < j-1; i++)
	            {
	                System.out.print(odd[i]+",");
	            }
	       System.out.print(odd[j-1]);
	        }
	        
	        System.out.println("");
	        System.out.print("Even:");   //Printing Even number
	        if(k > 1)
	        {
	            for(int i = 0; i < (k-1); i++)
	            {
	                System.out.print(even[i]+",");
	            }
	        System.out.print(even[k-1]);
	        }       
	}

}
