/*13.	Define a MyArray class with some static methods:
a.	even(int[] array) that returns the number of even values in the array
b.	positiveOdd(int[] array) that returns the number of positive odd numbers in the array
c.	reverse(int[] array) that returns the array in reverse order
d.	compare(int[] array1, int[] array2) that returns ‘ture’ if both arrays are identical or ‘false’ otherwise
e.	different(int[] array1, int[] array2) that returns numbers from the first array that do not appear 
in the second array
f.	exist(int number, int[] array) that returns ‘true’ if the number is present in the array or ‘false’ otherwise
g.	secondMax(int[] array) that returns the second largest number in the array
h.	lastColumn(int[][] array) that returns the sum of values in the last column
i.	swap(int[][] array) that returns the array with the first and last column swapped
j.	two2one(int[][] array) that returns the 2D array converted to 1D array
Then, write a program in which use all defined methods. Display results.
 */

 import java.util.Arrays;

 public class MyArray {
     // a. Return the number of even values in the array
     static int even(int[] array) {
         int res = 0;
         for (int i = 0; i < array.length; i++) {
             if (array[i] % 2 == 0) {
                 res++;
             }
         }
         return res;
     }
 
     // b. Return the number of positive odd numbers in the array
     static int positiveOdd(int[] array) {
         int res = 0;
         for (int i = 0; i < array.length; i++) {
             if (array[i] > 0 && array[i] % 2 != 0) {
                 res++;
             }
         }
         return res;
     }
 
     // c. Return the array in reverse order
     static int[] reverse(int[] array) {
         int l = array.length;
         int[] reversed = new int[l];
 
         for (int i = 0; i < l; i++) {
             reversed[i] = array[l - 1 - i];
         }
         return reversed;
     }
 
     // d. Return 'true' if both arrays are identical or 'false' otherwise
     static boolean compare(int[] array1, int[] array2) {
         return Arrays.equals(array1, array2);
     }
 
     // e. Return numbers from the first array that do not appear in the second array
     static int[] different(int[] array1, int[] array2){
        int l1 = array1.length;
        int l2 = array2.length;

        Arrays.sort(array1);
        Arrays.sort(array2);

        int[] differentElements = new int[Math.max(l1,l2)];
        int count = 0;
        int i = 0; 
        int j = 0;

        while (i < l1 && j < l2) {
            if (array1[i] < array2[j]) {
                differentElements[count] = array1[i];
                count++;
                i++;
            } else if (array1[i] > array2[j]) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        while (i < l1) {
            differentElements[count] = array1[i];
            count++;
            i++;
        }

        differentElements = Arrays.copyOf(differentElements, count);

        return differentElements;
    }
    
 
     // f. Return 'true' if the number is present in the array or 'false' otherwise
     static String exist(int number, int[] array){
        for (int i : array){
            if (i == number){
                return "true";
            }
        }
        return "false";
    }  
 
     // g. Return the second largest number in the array
     static int secondMax(int[] array) {
         int firstMax = Integer.MIN_VALUE;
         int secondMax = Integer.MIN_VALUE;
 
         for (int num : array) {
             if (num > firstMax) {
                 secondMax = firstMax;
                 firstMax = num;
             } else if (num > secondMax && num < firstMax) {
                 secondMax = num;
             }
         }
         return secondMax;
     }
 
     // h. Return the sum of values in the last column
     static int lastColumn(int[][] array) {
         int sum = 0;
         int rows = array.length;
         int cols = array[0].length;
 
         for (int i = 0; i < rows; i++) {
             sum += array[i][cols - 1];
         }
         return sum;
     }
 
     // i. Return the array with the first and last column swapped
     static int[][] swap(int[][] array) {
         int rows = array.length;
         int cols = array[0].length;
         int[][] swappedArray = new int[rows][cols];
 
         for (int i = 0; i < rows; i++) {
             swappedArray[i][0] = array[i][cols - 1];
             swappedArray[i][cols - 1] = array[i][0];
             System.arraycopy(array[i], 1, swappedArray[i], 1, cols - 2);
         }
         return swappedArray;
     }
 
     // j. Return the 2D array converted to a 1D array
     static int[] two2one(int[][] array) {
         return Arrays.stream(array).flatMapToInt(Arrays::stream).toArray();
     }
 
     public static void main(String[] args) {
         int[] array1 = {1, 2, 3, 4, 5, 6};
         int[] array2 = {6, 5, 4, 3, 2, 1};
         int[] array3 = {1, 2, 3, 7, 8, 9};
 
         System.out.println("a. Number of even values: " + even(array1));
         System.out.println("b. Number of positive odd numbers: " + positiveOdd(array1));
         System.out.println("c. Reverse array: " + Arrays.toString(reverse(array1)));
         System.out.println("d. Compare arrays: " + compare(array1, array2));
         System.out.println("e. Different numbers: " + Arrays.toString(different(array1, array3)));
         System.out.println("f. Existence of number 4: " + exist(4, array1));
         System.out.println("g. Second largest number: " + secondMax(array1));
 
         int[][] array2D = {
             {1, 2, 3},
             {4, 5, 6},
             {7, 8, 9}
         };
 
         System.out.println("h. Sum of values in the last column: " + lastColumn(array2D));
         System.out.println("i. Array with first and last column swapped: ");
         int[][] swappedArray = swap(array2D);
         for (int[] row : swappedArray) {
             System.out.println(Arrays.toString(row));
         }
         System.out.println("j. 2D array converted to a 1D array: " + Arrays.toString(two2one(array2D)));
     }
 }
 