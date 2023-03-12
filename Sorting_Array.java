package Assignment_All;

public class Sorting_Array 
{

	public static void main(String[] args)
	{
		//Initialize the array with element 
		int arr[]=new int[] {22,50,4,21,3,70,1};
		
		//before sorting
		System.out.println("Array elements before sorting:"); 
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");  
		}
		
		//Sorting logic:
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				int temp=0;
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}	 
		}
		//After sorting 
		System.out.println("\n\nArray elements after sorting:"); 
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
