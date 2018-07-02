/*
n	
{\displaystyle n^{2}} n^{2}	{\displaystyle n^{2}} n^{2}	{\displaystyle 1} 
1	Yes	Exchanging	Tiny code size.

Bubble sort is the simplest sorting algorithm, 
it compares the first two elements, 
if the first is greater than the second, swaps them, continues doing (compares and swaps) 
for the next pair of adjacent elements. 
It then starts again with the first two elements, 
compares, swaps until no more swaps are required.
 */
package am.developer.sort;

/**
 *
 * @author haykh
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = {99, 10, 8, 99, 7, 1, 5, 88, 9, 1};
        sortBad(array);//35
        sortGood(array);//7
    }

    public static void sortBad(int[] array) {

        int iterationCount = 0;
        boolean sorted = true;
        while (sorted) {
            sorted = false;
            for (int i = 0; i < array.length - 1; i++) {
                int one = array[i];
                int two = array[i + 1];

                if (one > two) {
                    array[i] = two;
                    array[i + 1] = one;
                    sorted = true;
                }
                iterationCount++;
            }
        }
        System.out.println("iterationCount=" + iterationCount);
        for (int i = 0; i < array.length; i++) {
            //System.out.println(""+array[i]);
        }
    }

    public static void sortGood(int[] array) {
        int iterationCount = 0;
        boolean sorted = false;

        for (int i = 0; i < array.length; i++) {
            int one = array[i];

            for (int j = 1; j < array.length - 1; j++) {
                int two = array[j];

                if (one > two) {
                    array[i] = two;
                    array[j] = one;
                    sorted = true;
                }
                iterationCount++;
            }
            if(!sorted) break;
        }
        System.out.println("iterationCount=" + iterationCount);
        for (int i = 0; i < array.length; i++) {
            System.out.println(""+array[i]);
        }
    }
    
      public static void sortOtherGood(int[] input) {
        int iterationCount = 0;
        int inputLength = input.length;
        int temp;
        boolean is_sorted;

        for (int i = 0; i < inputLength; i++) {

            is_sorted = true;

            for (int j = 1; j < (inputLength - i); j++) {

                if (input[j - 1] > input[j]) {
                    temp = input[j - 1];
                    input[j - 1] = input[j];
                    input[j] = temp;
                    is_sorted = false;
                }
                iterationCount++;
            }

            // is sorted? then break it, avoid useless loop.
            if (is_sorted) break;

            //System.out.println("\n");
            
        }
        System.out.println("iterationCount2="+iterationCount);
        
    }
}
