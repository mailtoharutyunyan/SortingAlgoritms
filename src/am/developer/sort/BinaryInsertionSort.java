/*
Binary Insertion Sort find use binary search to find the proper location to insert the selected item at each iteration. 
In normal insertion, sort it takes O(i) (at ith iteration) in worst case. we can reduce it to O(logi) by using binary search.
 */
package am.developer.sort;

// Java Program implementing
// binary insertion sort
 
import java.util.Arrays;
/**
 *
 * @author haykh
 */
public class BinaryInsertionSort {
    public static void main(String[] args)
    {
        final int[] arr = {37, 23, 0, 17, 12, 72, 31,
                             46, 100, 88, 54 };
 
        new BinaryInsertionSort().sort(arr);
 
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i]+" ");
    }
 
    public void sort(int array[])
    {
        for (int i = 1; i < array.length; i++)
        {
            int x = array[i];
 
            // Find location to insert using binary search
            int j = Math.abs(Arrays.binarySearch(array, 0, i, x) + 1);
 
            //Shifting array to one location right
            System.arraycopy(array, j, array, j+1, i-j);
 
            //Placing element at its correct location
            array[j] = x;
        }
    }
}
