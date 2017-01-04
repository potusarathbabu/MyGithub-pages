import java.util.Arrays;
import java.util.Scanner;

public class DuplicateNumber {
	public static void main(String a[]){
		
		int [] numbers;
		Arrays.sort(numbers);
		Scanner input=new Scanner(System.in);
		numbers a[] =input.nextInt();
		for(int i = 1; i < numbers.length; i++) {
			if(numbers[i] == numbers[i - 1]) {
				System.out.println("Duplicate: " + numbers[i]);
			}
		}
		}

		

}