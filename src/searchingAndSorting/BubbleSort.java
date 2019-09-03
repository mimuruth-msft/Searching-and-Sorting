// Implementation of Bubble Sort

package searchingAndSorting;

public class BubbleSort 
{
	public void bubbleSort(int[] arr)
	{
		int n = arr.length;
		
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n - i -1; j++)
			{
				//If elements are in the wrong order, swap them
				if (arr[j] > arr[j + 1])
				{
					// swap arr[j+1] and arr[j]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
	
	public void printArray(int[] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}

}
