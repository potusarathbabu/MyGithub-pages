package patternsTriangles;

import java.util.Scanner;

public class SumOfEven {
	
	
	public static void main(String args[]){
		int n,i,j,temp;
		System.out.println("Enter the value u want to upto to u");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		temp=n;
		j=n*(n+1);
		/*for(i=0;i<=n;i++)
		{
			n=n*(n+1);
		}*/
		System.out.println(j);
		i=temp*temp;
		System.out.println(i);
		
		
	}

}
