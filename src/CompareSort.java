import java.lang.*;
import java.util.*;

public class CompareSort implements SortingAlgorithms {
    public static void main(String[] args) {
        try{
            CompareSort program = new CompareSort();
            program.run();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void run() throws Exception{

    }

    public String[] copyArray(String[] arr){
        String[] copied = new String[arr.length];

        for (int i = 0; i < copied.length; i++){
            copied[i] = arr[i];
        }

        return copied;
    }

    /**
     * @author RITHIK
     * @param arr
     * @return
     */
     /*
        Algorithm:
            1. Accept an ArrayList as parameters
            2. Create a copy of arr by calling copyArray() method
            3. Create a for loop to iterate till nameList.length -1 (x as increment value)
            4. Create a for loop to iterate  till nameList.length -1 - x(y as increment value)
            5. Create an if statement to check if a condition is true
            6. Create a temp variable and assign it the value of arr[x]
            7. Set arr[x] equal to arr[y]
            8. Set arr[y] to the temp variable
            9. Return the sorted array
     */
    public String[] bubbleSort(String[] arr){
        String[] sorted = copyArray(arr);
        String temp;
        for (int x = 0; x < arr.length-1; x++) {
            for (int y=0; y<arr.length-1-x; y++) {
                if (arr[x].compareToIgnoreCase(arr[y])>0) {
                    temp = arr[x];
                    arr[x] = arr[y];
                    arr[y] = temp;
                }
            }
        }

        //Bubble Sort Algorithm Here :)))

        return sorted;
    }

    /**
     * @author PATRICK
     * @param arr
     * @return
     */
    public String[] selectionSort(String[] arr){
        String[] sorted = copyArray(arr);

        //Selection Sort Algorithm Here :)))

        return sorted;
    }

    /**
     * @author JOHAN
     * @param arr
     * @return
     */
    public String[] insertionSort(String[] arr){
        String[] sorted = copyArray(arr);

        //Insertion Sort Algorithm Here :)))

        return sorted;
    }
}
