import java.util.Scanner;

public class Polyndrome {
 
		 public static void main(String args[]){  
		  int r,sum=0,temp;    
		  int n;
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter ur number ");
		  n=sc.nextInt();
		  temp=n;    
		  while(n>0){    
		   r=n%10;   
		   System.out.println("R value is"+r);
		   sum=(sum*10)+r; 
		   System.out.println("Sum value is"+sum);
		   n=n/10;
		   System.out.println("n value is"+n);
		  }    
		  if(temp==sum)    
		   System.out.println("Ur number is Palindrome number ");    
		  else    
		   System.out.println("Ur number is not a Palindrome");    
		}  
		

}
