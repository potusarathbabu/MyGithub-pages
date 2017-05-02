package patternsTriangles;

import java.util.Scanner;

public class SumOfDigits {
	
	public static void main(String[] args) 
	{
	int a,n,sum=0;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter any number: ");
	n=s.nextInt();
	while(n>0)
	{
	a=n%10;
	n=n/10;
	System.out.println("a="+a);
	sum=sum+a;
	}
	System.out.println("Sum of Digits :"+sum);
	}
	}


