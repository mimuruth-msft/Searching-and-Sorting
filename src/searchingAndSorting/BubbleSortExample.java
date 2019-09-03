package searchingAndSorting;

public class BubbleSortExample {

	public static void main(String[] args) 
	{
		// This is unsorted array
		int[] arr = new int[] { 12, 80, 13, 24, 10, 3, 6, 90, 70, 29,
				                93, 49, 33, 4, 64, 55, 37, 77, 100 };
		
		// Sort using bubble sort
		BubbleSort ob = new BubbleSort();
		BubbleSort2 ob2 = new BubbleSort2();
		
		ob.bubbleSort(arr);
		ob2.bubbleSort2(arr, 0, arr.length);
		
		// Prints the sorted array
		ob.printArray(arr);
		
		System.out.println();
		
		// Prints the sorted array
		ob2.printArray(arr);
		
		System.out.println();
		// Prints the sorted array
		ob2.printArraytoString(arr);
	}

}
