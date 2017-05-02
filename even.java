package patternsTriangles;

import java.util.Scanner;

public class even {
	
	static void display(){
		int n,count=0;
		System.out.println("enter number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=n;i++){
			if(i%2==0)
			{
				count++;
			}
		
		
		System.out.println(count+" ");
		
		}
	}
	public static void main(String[] args){
		display();
		
	}
	

}
