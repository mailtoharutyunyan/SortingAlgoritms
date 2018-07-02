/*
n^{2}	
{\displaystyle n^{2}} n^{2}	{\displaystyle n^{2}} n^{2}
1	No	Selection	Stable with O(n) extra space, for example using lists.


Selection sort is an in-place comparison sort. 
It loops and find the first smallest value, 
swaps it with the first element; 
loop and find the second smallest value again, 
swaps it with the second element, repeats third, fourth, fifth smallest values and swaps it, 
until everything is in correct order.
 */
package am.developer.sort;

/**
 *
 * @author haykh
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        sort();
    }
    
    public static void sort(){
        int[] array = {10, 8, 99, 7, 1, 5, 88, 9};
        for(int i=0; i < array.length; i++){
            int min = array[i];
            int minIndex = i;
            for(int j=i+1; j < array.length; j++){
                if(array[j] < min){
                    min = array[j];
                    minIndex = j;
                    System.out.println("min="+min);
                }
            }    
            System.out.println("=======================");
            int tmp = array[i];
            array[i] = min;
            array[minIndex] = tmp;
            for(int k=0; k < array.length; k++){
                System.out.println(""+array[k]);
            }    
            System.out.println("=======================");
        }
        for(int i=0; i < array.length; i++){
            System.out.println(""+array[i]);
        }    
    }
}
