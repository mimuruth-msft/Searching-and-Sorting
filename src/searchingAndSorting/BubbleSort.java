package searchingAndSorting;

public class BubbleSort {

	public static void main(String[] args) 
	{
		int[] arr = new int[] { 12, 80, 13, 24, 10, 3, 6, 90, 70, 93, 49, 33, 4, 64, 55 };
		
		bubbleSort(arr);
		
		printArray(arr);

	}
	
	public static void bubbleSort(int[] arr)
	{
		int n = arr.length;
		
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n - i -1; j++)
			{
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
	
	public static void printArray(int[] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}

}
