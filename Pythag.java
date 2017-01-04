import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pythag {
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int a,sum,product=0;
	
		System.out.println("Enter the no=");
		a = Integer.parseInt(in.readLine());
		
		sum = Integer.parseInt(in.readLine());
		product = Integer.parseInt(in.readLine());
		
		for (a = 1; a <= sum/3; a++)
        {
            int b;
            for (b = a + 1; b <= sum/2; b++)
            {
                int c = sum - a - b;
                if ( c > 0 && (a*a + b*b == c*c) )
                   System.out.printf("a=%d, b=%d, c=%d\n",a,b,c);
                    product = a * b * c;
            }
        }
        System.out.println(product);
}
}
