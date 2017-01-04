import java.util.Scanner;

public class PolyndromeNumber {
	public static void main(String[] args){
		int n,sum=0,temp,r;
		System.out.println("Enter number");;
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		temp=n;
		while(n>0)
			{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
			}
		if(temp==sum)
			System.out.println("ur numer is Polyndrome");
		else 
			System.out.println("ur numberis not a Polyndrome");
	}

}
