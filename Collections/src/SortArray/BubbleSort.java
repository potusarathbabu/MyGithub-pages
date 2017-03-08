package SortArray;

import java.util.Scanner;

public class BubbleSort {
	static void bubbleSort(int[] arr) {
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}

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
		bubbleSort(arr);
		System.out.println("Array after bubble sort");
		for (i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}

	}

}
