// Implementation of Bubble Sort

package searchingAndSorting;

import java.util.Arrays;

public class BubbleSort2 
{
	@SuppressWarnings({"rawtypes", "unchecked"})
	public void bubbleSort2(int arr[], int fromIndex, int toIndex)
	{
		int n;
		
		for (int i = toIndex - 1; i > fromIndex; i-- )
		{
			boolean isSorted = true;
			for (int j = fromIndex; j < i; j++)
			{
				//If elements are in the wrong order, swap them
				if (((Comparable) arr[j]).compareTo(arr[j + 1]) > 0)
				{
					isSorted = false;
					n = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1 ] = n;
				}
			}
			
			//If no swapping then array is already sorted
			if (isSorted)
				break;
		}
	}
	
	public void printArray(int[] arr)
	{
		// Enhanced for loop
		for (int val : arr )
		System.out.print(val + " ");
	}
	
	// Using Arrays.toString()
	public void printArraytoString(int[] arr)
	{
		System.out.print(Arrays.toString(arr));
	}

}
