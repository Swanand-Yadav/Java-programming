package gitProject;

import java.util.Scanner;

public class Min_Max_sum 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		long temp=0;
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
			temp=temp+arr[i];
		}
		long max=Integer.MIN_VALUE, add,add1,min=temp-arr[0];
		for(int i=0;i<arr.length;i++)
		{
			add=temp-arr[i];
		
			if(add>max)
			{
				max=add;
			}
			else if(add <min)
			{
				min = add;
			}
			
		}
		System.out.println(min+" "+max);

	}

}
