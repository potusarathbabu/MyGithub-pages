package SortArray;

import java.util.Scanner;

public class InsertionSort {
	public static void insertionSort(int array[]) {
		int n = array.length;
		for (int j = 1; j < n; j++) {
			int key = array[j];
			int i = j - 1;
			while ((i > -1) && (array[i] > key)) {
				array[i + 1] = array[i];
				i--;
			}
			array[i + 1] = key;
		}
	}

	public static void main(String args[]) {
		int n, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of the elements u want");
		n = sc.nextInt();
		System.out.println("Enter the array elements");

		int arr[] = new int[n];
		for (i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			System.out.println(arr[i] + " ");
		}
		System.out.println();

		insertionSort(arr);
		System.out.println("Array after bubble sort");
		for (i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}

	}

}
