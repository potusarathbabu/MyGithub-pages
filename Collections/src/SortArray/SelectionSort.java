package SortArray;

import java.util.Scanner;

public class SelectionSort {

	public static void selectionSort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
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
		selectionSort(arr);
		System.out.println("Array after bubble sort");
		for (i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}

	}

}
