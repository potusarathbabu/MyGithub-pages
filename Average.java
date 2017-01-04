import java.util.Scanner;

public class Average {

	 public static void main(String[] args)
	    {
	       
	        Scanner input=new Scanner(System.in);                 

	        int a,b,c,d,e;

	        int avg;
	        System.out.println("Enter 5 numbers:");
	        
	        a=input.nextInt();
	        b=input.nextInt();
	        c=input.nextInt();
	        d=input.nextInt();
	        e=input.nextInt();
	        avg= (int) ((a+b+c+d+e)/5.0);
	        System.out.println("Largest Number is: "+avg);
	    }
	
	
}
