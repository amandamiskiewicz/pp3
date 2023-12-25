/*2.	Define an Arrays class that contains a static method arr(int[] arr1, int[] arr2). 
The method returns true if the number of two-digit numbers contained in arr1 and arr2 are the same or false otherwise. Example:
int[] arr1 = {15,8,2,37,49,117}
int[] arr2 = {9,6,7,12,48,4,6,90,5}
arr(arr1,arr2)  true
 */

public class Arrays {

    static boolean arr(int[] arr1, int[] arr2){
        int flag1 = 0;
        int flag2 = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i]>9 && arr1[i]<100){
                flag1++;
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i]>9 && arr2[i]<100){
                flag2++;
            }
        }
        if (flag1==flag2){
            return true;
        } else{
            return false;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {15,8,2,37,49,117};
        int[] arr2 = {9,6,7,12,48,4,6,90,5};
        System.out.println(arr(arr1, arr2));
        
    }
}
