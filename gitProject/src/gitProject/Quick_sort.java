package gitProject;

import java.util.Scanner;

public class Quick_sort 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<a;i++)
		{
			arr[i]=sc.nextInt();
		}
		int pivot=arr[0],j=0;
	       int res[]=new int[arr.length];
	        for(int i=0;i<arr.length;i++)
	         if(arr[i]<pivot)
	              res[j++]=arr[i];
	        
	         for(int i=0;i<arr.length;i++)
	         if(arr[i]==pivot)
	              res[j++]=arr[i];
	        
	         for(int i=0;i<arr.length;i++)
	         if(arr[i]>pivot)
	              res[j++]=arr[i];
	        
	        for(int i=0;i<a;i++)
	        {
	        	System.out.print(res[i]+" ");
	        }
	}  	


}
