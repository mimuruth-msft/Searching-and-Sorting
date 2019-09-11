package searchingAndSorting;

//This program implements the merge sort algorithm for
//arrays of integers.

import java.util.Arrays;

public class MergeSortExample 
{
	public static void main(String[] args) 
	{
		// Unsorted array
		int[] list = { 38, 63, 46, 24, 39, 3, 11, 19, 9, 57, 79, 88, 91, 21, 1, 7, 18, 23, 51, 13, 2, 43, 17, 13, 5 };
		
		System.out.println("Before Sorting: " + Arrays.toString(list));
		
		// Call merge sort
		mergeSort(list);
		
		System.out.println("After Sorting: " + Arrays.toString(list));

	}
	
	// Places the elements of the given array into sorted order
    // using the merge sort algorithm.
    // post: array is in sorted (nondecreasing) order
	public static void mergeSort(int[] array)
	{
		if (array.length > 1)
		{
			// split array into two halves
         int[] left = leftHalf(array);
         int[] right = rightHalf(array);
         
         //System.out.println("left side: " + Arrays.toString(left));
         //System.out.println("right side: " + Arrays.toString(right));
         
         // recursively sort the two halves
         mergeSort(left);
         mergeSort(right);
        
         // merge the sorted halves into a sorted whole
         merge(array, left, right);
		}
		
	}
	
	// Returns the first half of the given array.
	private static int[] leftHalf(int[] array) 
	{
		int side1 = array.length / 2;
		int[] left = new int[side1];
		
		for (int i = 0; i < side1; i++)
		{
			left[i] = array[i];
		}
		
		return left;
	}
	
	// Returns the second half of the given array.
	private static int[] rightHalf(int[] array) 
	{
		int side1 = array.length / 2;
		int side2 = array.length - side1;
		int[] right = new int[side2];
		
		for (int i = 0; i < side2; i++)
		{
			right[i] = array[i + side1];
		}
		
		return right;
	}
	
	// Merges the given left and right arrays into the given 
    // result array.  Second, working version.
    // pre : result is empty; left/right are sorted
    // post: result contains result of merging sorted lists;
	public static void merge(int[] result, int[] left, int[] right)
	{
		int i1 = 0;     // index into left array
		int i2 = 0;     // index into right array
		
		for (int i = 0; i < result.length; i++)
		{
			if (i2 >= right.length || (i1 < left.length && left[i1] <= right[i2]))
			{
				result[i] = left[i1];    // take from left
				i1++;
			}
			else
			{
				result[i] = right[i2];   // take from right
				i2++;
			}
			
		}
	}
	
}
