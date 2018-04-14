//comments
//comments2
//comments3
import java.*;
import java.io.*;
import java.util.Scanner;
class helloworld
{
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		System.out.println("How many elements??");
		int e = s.nextInt();
		
		System.out.println("Enter the array elements");
	
		int num[] = new int[e];
		
				
		
		for(int i=0;i<e;i++)
		{
		num[i]= s.nextInt();
		}
		
		System.out.print("your entered list is : [ ");
		for(int i=0;i<e;i++)
			{
				System.out.print(+num[i]+" ");
			}
		System.out.print("]");
		
		
		
		
System.out.print("\n Your sorted list is : [ ");

for(int i=0;i<e;i++)
{
	for(int j=0;j<e-1;j++)
	{
		if(num[j]>num[i])
		{
			int temp=0;
			temp=num[j];
			num[j]=num[i];
			num[i]=temp;
			
		}
		
	}
	
	
	
}


for(int i=0;i<e;i++)
{
	System.out.print(+num[i]+" ");
}
System.out.print("]");

	}
}