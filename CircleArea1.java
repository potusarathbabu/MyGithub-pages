import java.util.Scanner;

public class CircleArea1 {
	public static void main(String[] args)
	{
		int r;
		double pi = 3.14,area;
		System.out. println("Enter radius of circle :");
		Scanner input = new Scanner(System.in);
		r=input.nextInt();
		area= pi * r * r;
		System.out.println("Area of circle is "+area);
	}

}



