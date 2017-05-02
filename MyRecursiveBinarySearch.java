package searchTechniques;
public class MyRecursiveBinarySearch {
	public static int recursiveBinarySearch(int[] sortedArray, int start, int end, int key) {
		if (start < end) {
			int mid = start + (end - start) / 2;
			if (key < sortedArray[mid]) {
				return recursiveBinarySearch(sortedArray, start, mid, key);

			} else if (key > sortedArray[mid]) {
				return recursiveBinarySearch(sortedArray, mid + 1, end, key);

			} else {
				return mid;
			}
		}
		return -(start + 1);
	}

	public static void main(String[] args) {

		int[] arr1 = { 10,14,19,26,27,31,33,35,42,44};
		int index = recursiveBinarySearch(arr1, 0, arr1.length, 31);
		System.out.println("Found 31 at " + index + " index");
		index = recursiveBinarySearch(arr1, 0, arr1.length, 19);
		System.out.println("Found 19 at " + index + " index");
		index = recursiveBinarySearch(arr1, 0, arr1.length, 44);
		System.out.println("Found 44 at " + index + " index");
	}

}
