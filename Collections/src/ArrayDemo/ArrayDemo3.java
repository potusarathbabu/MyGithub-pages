package ArrayDemo;

public class ArrayDemo3 {
	 static void min(int arr[]){
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
			//System.out.println(arr.length);
			if(min>arr[i])
				min=arr[i];
		System.out.println(min);
	}
	
	
	
public static void main(String args[]){
	int a[]={33,3,4,5};
	min(a);
}
}
