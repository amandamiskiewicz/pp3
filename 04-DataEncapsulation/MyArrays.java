/*21.	Define a MyArrays class that contains two static methods: odd(int[] array), 
which returns the number of positive odd values in the array, and above(int[] array), 
which returns the sum of the numbers in the array that are greater than the arithmetic mean of the array elements. Sample result:
arr1 = {3,2,-5,4,1,-7}
arr2 = {5,2,7,4,2}
MyArrays.odd(arr1) returns 2
MyArrays.above(arr2) returns 12
 */

 public class MyArrays {

    // Metoda do zliczania dodatnich liczb nieparzystych w tablicy
    public static int odd(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    // Metoda do obliczania sumy liczb w tablicy większych od średniej arytmetycznej
    public static int above(int[] array) {
        int sum = 0;
        int count = 0;

        // Oblicz średnią arytmetyczną
        double average = average(array);

        // Dodaj do sumy elementy większe od średniej
        for (int i = 0; i < array.length; i++) {
            if (array[i] > average) {
                sum += array[i];
                count++;
            }
        }

        return sum;
    }

    // Metoda do obliczania średniej arytmetycznej elementów w tablicy
    private static double average(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        int sum = 0;
        for (int value : array) {
            sum += value;
        }

        return (double) sum / array.length;
    }

    public static void main(String[] args) {
        // Przykładowe użycie
        int[] arr1 = {3, 2, -5, 4, 1, -7};
        int[] arr2 = {5, 2, 7, 4, 2};

        // Wywołanie metod
        int oddResult = odd(arr1);
        int aboveResult = above(arr2);

        // Wyświetlenie wyników
        System.out.println("MyArrays.odd(arr1) returns " + oddResult);
        System.out.println("MyArrays.above(arr2) returns " + aboveResult);
    }
}
