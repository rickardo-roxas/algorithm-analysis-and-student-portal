/**
 * Year and Block: BSCS 2-1
 * Class Code: 9342-CS211/CS211L
 * Activity:  Comparative Analysis of Algorithms Group Project
 * Group Name: Ramonsters
 * Group Members:
 *      De Torres, John Rey
 *      Jasmin, Ramon Emmiel
 *      Lacanilao, Marvin Patrick
 *      Roxas, Johan Rickardo
 *      Siccuan, Sebastian
 *      Tank, Rithik
 *      Tolentino, Shyra Monique
 *      Urbiztondo, Karl Jasper
 */

import java.lang.*;
import java.util.*;
import java.io.*;

public class CompareSort implements SortingAlgorithms{

    public final File bestCase = new File("res/best-case.txt");
    public final File averageCase = new File("res/average-case.txt");
    public final File worstCase = new File("res/worst-case.txt");

    /**
     * @author Ramon Emmiel Jasmin
     * @param args
     */
    public static void main(String[] args) {
        try{
            CompareSort program = new CompareSort();
            program.run();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * @author Jasper
     * @throws Exception
     * Algorithm:
     *      1. Populate array with data files by calling the populate method
     *      2. Populate bestCase array with best-case datafiles
     *      3. Populate averageCase array with average-case datafiles
     *      4. Populate worstCase array with worst-case datafiles
     *      5. Sort each case with bubble, selection, and insertion sort
     */
    public void run() throws Exception{
        String[] bestCase10K = populate(bestCase,10000);
        String[] bestCase50K = populate(bestCase, 50000);
        String[] bestCase200K = populate(bestCase, 200000);
        String[] bestCase500K = populate(bestCase, 500000);
        String[] bestCase1M = populate(bestCase, 1000000);

        String[] averageCase10K = populate(averageCase,10000);
        String[] averageCase50K = populate(averageCase, 50000);
        String[] averageCase200K = populate(averageCase, 200000);
        String[] averageCase500K = populate(averageCase, 500000);
        String[] averageCase1M = populate(averageCase, 1000000);

        String[] worstCase10K = populate(worstCase,10000);
        String[] worstCase50K = populate(worstCase, 50000);
        String[] worstCase200K = populate(worstCase, 200000);
        String[] worstCase500K = populate(worstCase, 500000);
        String[] worstCase1M = populate(worstCase, 1000000);
        
        bubbleSort(bestCase10K);
        bubbleSort(bestCase50K);
        bubbleSort(bestCase200K);
        bubbleSort(bestCase500K);
        bubbleSort(bestCase1M);
        bubbleSort(averageCase10K);
        bubbleSort(averageCase50K);
        bubbleSort(averageCase200K);
        bubbleSort(averageCase500K);
        bubbleSort(averageCase1M);
        bubbleSort(worstCase10K);
        bubbleSort(worstCase50K);
        bubbleSort(worstCase200K);
        bubbleSort(worstCase500K);
        bubbleSort(worstCase1M);

        selectionSort(bestCase10K);
        selectionSort(bestCase50K);
        selectionSort(bestCase200K);
        selectionSort(bestCase500K);
        selectionSort(bestCase1M);
        selectionSort(averageCase10K);
        selectionSort(averageCase50K);
        selectionSort(averageCase200K);
        selectionSort(averageCase500K);
        selectionSort(averageCase1M);
        selectionSort(worstCase10K);
        selectionSort(worstCase50K);
        selectionSort(worstCase200K);
        selectionSort(worstCase500K);
        selectionSort(worstCase1M);

        insertionSort(bestCase10K);
        insertionSort(bestCase50K);
        insertionSort(bestCase200K);
        insertionSort(bestCase500K);
        insertionSort(bestCase1M);
        insertionSort(averageCase10K);
        insertionSort(averageCase50K);
        insertionSort(averageCase200K);
        insertionSort(averageCase500K);
        insertionSort(averageCase1M);
        insertionSort(worstCase10K);
        insertionSort(worstCase50K);
        insertionSort(worstCase200K);
        insertionSort(worstCase500K);
        insertionSort(worstCase1M);
    }

    /**
     * @authour Ramon John Rey
     * @param file
     * @param lines
     * @return
     * @throws FileNotFoundException
     * Algorithm:
     *      1. Create a Scanner object and pass in file
     *      2. Create a new String array object and pass in the lines variable
     *      3. Create an index variable
     *      4. Create a while loop to iterate while file has a line
     *      5. Add each line of the file to the String array objecy
     *      6. Increment index variable
     *      7. Close Scanner object
     *      8. Return populated String array object
     */
    public String[] populate(File file, int lines) throws FileNotFoundException{
        Scanner fileScanner = new Scanner(file);                // Creates Scanner to read the file
        String[] populated = new String[lines];                 // Create a new String object and pass in the lines variable

        int index = 0;                                          // Initialize an index to keep track of array posiiton

        while (fileScanner.hasNextLine() && index < lines){
            populated[index] = fileScanner.nextLine();
            index++;                                          // Read files from the line and populate array
        }

        fileScanner.close();                                  // Close the file Scanner

        return populated;                                      // Return the populated string array
    }
    /**
     * @author Jasper
     * @throws Exception
     * Algorithm:
     *       1. Create variable 'copied' as an array of string
     *       2. Create new array object
     *       3. Set the new array with a length equal 'arr'
     *       4. Make a for loop to run all its iterations
     *       5. Create a duplicate of the input array to the new array
     *       6. Return the copied array
     */
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
     * Algorithm:
     *      1. Accept an array as parameters
     *      2. Create a copy of arr by calling copyArray() method
     *      3. Create a for loop to iterate till nameList.length -1 (x as increment value)
     *      4. Create a for loop to iterate  till nameList.length -1 - x(y as increment value)
     *      5. Create an if statement to check if a condition is true
     *      6. Create a temp variable and assign it the value of arr[x]
     *      7. Set arr[x] equal to arr[y]
     *      8. Set arr[y] to the temp variable
     *      9. Return the sorted array
     */
    public String[] bubbleSort(String[] arr){
        long outerLoopCount = 0;
        long innerLoopCount = 0;
        long comparisonCount = 0;
        long swapCount = 0;
        long declareCount = 0;
        long statementsCount = 0;

        String[] sorted = copyArray(arr);
        declareCount = 3;                                   // Deals with the i and j declared and the sorted variable

        for (int i = 0; i < sorted.length-1; i++) {
            outerLoopCount+=2;                                  // Deals with the 2 statements executed in the for loop above it
            for (int j = 0; j<sorted.length-1-i; j++) {
                innerLoopCount+=2;                              // Deals with the 2 statements executed in the for loop above it
                comparisonCount++;                              // Deals with the comparison done below
                if (sorted[j].compareToIgnoreCase(sorted[j+1])>0) {
                    String temp = sorted[j];
                    sorted[j] = sorted[j+1];
                    sorted[j+1] = temp;
                    swapCount+=3;                               // Deals with the three switch statements above
                }
            }
            innerLoopCount +=1;                                 // Add 1 to innerLoopCount for when the condition is checked and it is not true
        }
        outerLoopCount++;                                       // Add 1 to outerLoopCount for when the condition is checked and it is not true
        statementsCount = outerLoopCount + innerLoopCount + comparisonCount + swapCount + statementsCount + declareCount + 1;
        // +1 because of the return sorted statement below

        System.out.println("The total number of executed statements are " + statementsCount + ".");
        return sorted;
    }

    /**
     * @author PATRICK
     * @param arr
     * @return
     * Algorithm by SHYRA MONIQUE TOLENTINO:
     *      1. Define a method named selectionSort that takes an array of strings as input.
     *      2. Initialize counters for different operations:
     *              outerLoopCount: Count of iterations in the outer loop.
     *              innerLoopCount: Count of iterations in the inner loop.
     *              comparisonCount: Count of string comparisons.
     *              swapCount: Count of element swaps.
     *              declareCount: Count of variable declarations.
     *              changeIndexCount: Count of times minIndex is updated.
     *              statementsCount: Total count of executed statements.
     *      3. Create a copy of the input array and assign it to sorted.
     *      4. Initialize integer variable i as 0.
     *      5. Run an outer loop while i is less than sorted.length - 1:
     *              5.1. Initialize minIndex as i.
     *              5.2. Run an inner loop with j starting from i + 1 to sorted.length - 1:
     *                      Compare sorted[j] with sorted[minIndex].
     *                      If sorted[j] is smaller, update minIndex to j.
     *                      Increment innerLoopCount and comparisonCount.
     *              5.3 Swap the elements at indices i and minIndex in the sorted array.
     *              5.4 Increment swapCount.
     *      6. Print the total number of executed statements.
     *      7. Return the sorted array.
     */
    public String[] selectionSort(String[] arr){

        // Counters
        long outerLoopCount = 0;
        long innerLoopCount = 0;
        long comparisonCount = 0;
        long swapCount = 0;
        long declareCount = 0;
        long changeIndexCount = 0;
        long statementsCount = 0;
        String[] sorted = copyArray(arr);
        int i = 0;
        int j;
        declareCount = 3;                                            // Deals with the i and j declared and the sorted variable


        for (; i < sorted.length - 1; i++) {
            outerLoopCount +=2;                                     // Deals with the 2 statements executed in the for loop above it

            int minIndex = i;
            changeIndexCount +=1;                                   // minIndex value changes each time the statement above is reached thus the plus 1
            for (j = i + 1; j < sorted.length; j++) {
                innerLoopCount +=2;                                 // Deals with the 3 statements executed in the for loop above it
                comparisonCount +=1;                                // Deals with the comparison done below
                if (sorted[j].compareTo(sorted[minIndex]) < 0) {
                    minIndex = j;
                    changeIndexCount +=1;                           // minIndex value changes each time the statement above is reached thus the plus 1
                }
            }
            innerLoopCount +=1;                                     // Add 1 to innerLoopCount for when the condition is checked and it is not true
            String temp = sorted[i];
            sorted[i] = sorted[minIndex];
            sorted[minIndex] = temp;
            swapCount += 3;                                         // Deals with the three switch statements above
        }
        outerLoopCount +=1;                                          // Add 1 to outerLoopCount for when the condition is checked and it is not true

        statementsCount = outerLoopCount + innerLoopCount + comparisonCount + swapCount + statementsCount + declareCount + changeIndexCount + 1;
        // +1 because of the return sorted statement below

        System.out.println("The total number of executed statements are " + statementsCount + ".");
        return sorted;
    }

    /**
     * @author JOHAN RICKARDO A. ROXAS
     * @param arr given array
     * @return
     *
     * STATUS: WORKING
     */

    /**
     * @author SEBASTIAN SICCUAN
     * Algorithm:
     *      1. Make a copy of the input array called "sorted".
     *      2. Setup counters to monitor what is happening.
     *      3. Go through each element in the "sorted" array, starting from the first element (index 0)
     *      4. Pick the current element and call it "key", note its position with a marker called "j."
     *      5. Compare the "key" with the elements to the left (the ones that are sorted already.'
     *      6. If the "key" is smaller, shift those larger elements to the right to make room for the "key".
     *      7. Place the "key in the correct spot within the sorted part of the array.
     *      8. Repeat the process until the elements are sorted.
     *      9. Print out the total number of operations.
     *      10. Return the sorted array.
     */

    public String[] insertionSort(String[] arr){

        // Counters
        long outerLoopCount = 0;
        long outerLoopIndexSetCount = 0;
        long comparisonCount = 0;
        long swapCount = 0;
        long declareCount = 0;
        long whileStatementCondition = 0;
        long statementsCount = 0;

        String[] sorted = copyArray(arr);
        int j = 0;
        String key = "";
        declareCount = 4;                                   // Deals with the i, j, key, sorted

        for (int i = 0; i < sorted.length; i++) {
            outerLoopCount +=2;                             // Deals with the 2 statements executed in the for loop above it
            key = sorted[i];
            j = i - 1;
            outerLoopIndexSetCount +=3;                      // key and j value changes each time the statement above is reached thus the plus 2

            whileStatementCondition += 2;                      // Increment 1 for when the while statement is checked
            while (j >= 0 && key.compareToIgnoreCase(sorted[j]) < 0) {
                sorted[j+1] = sorted[j];
                j = j - 1;
                swapCount+=3;
            }
            sorted[j + 1] = key;
            swapCount++;                                    // Deals with the switch statement above
        }
        outerLoopCount +=1;

        statementsCount = outerLoopCount + outerLoopIndexSetCount + comparisonCount + swapCount + declareCount + whileStatementCondition + statementsCount + 1;
        // +1 because of the return sorted statement below

        System.out.println("The total number of executed statements are " + statementsCount + ".");

        return sorted;
    }
}
