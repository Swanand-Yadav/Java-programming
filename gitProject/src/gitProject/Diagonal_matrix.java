package gitProject;

import java.util.Scanner;

public class Diagonal_matrix {
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int a[][]=new int[num][num];
		int e=0;
		int r=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(i==a.length-(a.length-i) && j==i)
				{
					e=e+a[i][j];
				}
				
			
				if(i==(a.length-1)-j )
				{
					r=r+a[i][j];
				}
			}
			
		}
	
		int val=0;
		if(e<r)
		{
			val=r-e;
		}
		else if(e>r)
		{
			val=e-r;
		}
		else if(e==r)
		{
			val=e-r;
		}
		System.out.println(val);


}
}
