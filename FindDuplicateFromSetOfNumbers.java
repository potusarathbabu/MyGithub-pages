
public class FindDuplicateFromSetOfNumbers {

	public static void main(String[] args) {

		int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 7 };

		int sum = 0;

		int partialSum = 0;

		for (int i = 0; i < intArray.length; i++) {

			sum = sum + i;

		}

		for (int j = 0; j < intArray.length - 1; j++) {

			partialSum = partialSum + j;

		}

		int duplicateNumber = sum - partialSum;

		System.out.println("The duplicate number in the numbers: " + duplicateNumber);

	}

}
