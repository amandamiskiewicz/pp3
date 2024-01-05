import java.util.ArrayList;
import java.util.Arrays;

/*13.	Define a MyArray class with some static methods:
Then, write a program in which use all defined methods. Display results.
 */
public class MyArray1 {
    //a.	even(int[] array) that returns the number of even values in the array
    static int even(int[] array){
        int res=0;
        for (int i=0; i<array.length; i++){
            if (array[i]%2==0){
                res++;
            }
        }
        return res;
    }
    //b.	positiveOdd(int[] array) that returns the number of positive odd numbers in the array
    static int positiveOdd(int[] array){
        int res=0;
        for (int i=0;i<array.length;i++){
            if (array[i]>0 && array[i]%2!=0){
                res++;
            }
        }
        return res;
    }
    //c.	reverse(int[] array) that returns the array in reverse order
    static int[] reverse(int[] array){
        int[] res = new int[array.length];
        for (int i=0;i<array.length;i++){
            res[i]=array[array.length-1-i];
        }
        return res;
    }
    //d.	compare(int[] array1, int[] array2) that returns ‘ture’ if both arrays are identical or ‘false’ otherwise
    static boolean compare(int[] array1, int[] array2){
        int flag=0;
        if (array1.length==array2.length){
            for (int i=0; i<array1.length; i++){
                if (array1[i]==array2[i]){
                    flag++;
                }
            } 
        }
        if (flag==array1.length){
            return true;
        } else {
            return false;
        }
    }
    //e.	different(int[] array1, int[] array2) that returns numbers from the first array that do not appear in the second array
    static ArrayList<Integer> different(int[] array1, int[] array2){
        ArrayList<Integer> res = new ArrayList<Integer>();
        for (int i = 0;i<array1.length;i++){
            int flag=0;
            for (int j=0;j<array2.length;j++){
                if (array1[i]==array2[j]){
                    flag++;
                }
        }
        if (flag==0){
            res.add(array1[i]);
        }
        }
        return res;
    }
    //f.	exist(int number, int[] array) that returns ‘true’ if the number is present in the array or ‘false’ otherwise
    static boolean exist(int number, int[] array){
        boolean res=false;
        for (int i = 0; i<array.length;i++){
            if (number==array[i]){
                res=true;
            }
        }
        return res;
    }
    //g.	secondMax(int[] array) that returns the second largest number in the array
    static int secondMax(int[] array){
        Arrays.sort(array);
        return array[array.length-2];
    }
    //h.	lastColumn(int[][] array) that returns the sum of values in the last column
    static int lastColumn(int[][] array){
        int res=0;
        for (int i = 0; i<array.length;i++){
            res+=array[i][array.length-1];
        }
        return res;
    }
    //i.	swap(int[][] array) that returns the array with the first and last column swapped
    public static int[][] swap(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (j == 0) {
                    result[i][j] = array[i][cols - 1];
                } else if (j == cols - 1) {
                    result[i][j] = array[i][0];
                } else {
                    result[i][j] = array[i][j];
                }
            }
        }

        return result;
    }

    //j.	two2one(int[][] array) that returns the 2D array converted to 1D array
    public static ArrayList<Integer> two2one(int[][] array){
        int rows = array.length;
        int cols = array[0].length;

        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i=0;i<rows;i++){
            for (int j = 0;j<cols;j++){
                result.add(array[i][j]);
            }
        }
        return result;
    }



    public static void printArray(int[][] array) {
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }

}


