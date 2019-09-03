package searchingAndSorting;

public class BubbleSortExample {

	public static void main(String[] args) 
	{
		// This is unsorted array
		int[] arr = { 112, 80, 13, 24, 10, 3, 6, 90, 70, 29,
				      93, 49, 33, 4, 64, 55, 37, 77, 100 };
		
		// Sort using bubble sort
		BubbleSort bubbleSort = new BubbleSort();
		BubbleSort2 bubbleSort2 = new BubbleSort2();
		
		// sorting array elements using bubble sort 
		bubbleSort.bubbleSort(arr);
		bubbleSort2.bubbleSort2(arr, 0, arr.length);
		
		// Display all the sorted elements using BubbleSort
		bubbleSort.printArray(arr);
		
		System.out.println();
		
		// Display all the sorted elements using BubbleSort2
		bubbleSort2.printArray(arr);
		
		System.out.println();
		// Display string representation of all sorted 
		// elements using BubbleSort2
		bubbleSort2.printArraytoString(arr);
	}

}
