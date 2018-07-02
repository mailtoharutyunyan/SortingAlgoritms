/*
n\log n
variation is {\displaystyle n} n	{\displaystyle n\log n} n\log n	{\displaystyle n^{2}} n^{2}	{\displaystyle \log n} \log n on average, 
worst case space complexity is {\displaystyle n} n; 
Sedgewick variation is {\displaystyle \log n} \log n worst case.	
Typical in-place sort is not stable; stable versions exist.	
Partitioning	Quicksort is usually done in-place with O(log n) stack space


Quicksort first divides a large array into two smaller sub-arrays: 
the low elements and the high elements. Quicksort can then recursively sort the sub-arrays.
 */
package am.developer.sort;

import java.util.Arrays;

/**
 *
 * @author haykh
 */
public class QuickSort
{
    public static void main(String[] args)
    {
        // This is unsorted array
        Integer[] array = new Integer[] { 12, 13, 24, 10, 3, 6, 90, 70 };
 
        // Let's sort using quick sort
        quickSort( array, 0, array.length - 1 );
 
        // Verify sorted array
        System.out.println(Arrays.toString(array));
    }
 
    public static void quickSort(Integer[] arr, int low, int high)
    {
        //check for empty or null array
        if (arr == null || arr.length == 0){
            return;
        }
         
        if (low >= high){
            return;
        }
 
        //Get the pivot element from the middle of the list
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];
 
        // make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j)
        {
            //Check until all values on left side array are lower than pivot
            while (arr[i] < pivot)
            {
                i++;
            }
            //Check until all values on left side array are greater than pivot
            while (arr[j] > pivot)
            {
                j--;
            }
            //Now compare values from both side of lists to see if they need swapping
            //After swapping move the iterator on both lists
            if (i <= j)
            {
                swap (arr, i, j);
                i++;
                j--;
            }
        }
        //Do same operation as above recursively to sort two sub arrays
        System.out.println("low="+low+" j="+j);
        if (low < j){
            quickSort(arr, low, j);
        }
        System.out.println("high="+high+" i="+i);
        if (high > i){
            quickSort(arr, i, high);
        }
    }
     
    public static void swap (Integer array[], int x, int y)
    {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}
