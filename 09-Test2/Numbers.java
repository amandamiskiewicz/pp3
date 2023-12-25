 /*1.	Define a Numbers class that contains a constructor with five int parameters that allows you to pass 5 integers to the object. 
Add a different() method that returns true if all numbers are different or false otherwise. Example:
sample five numbers: 3 4 2 1 6
different()  true
sample five numbers: 9 7 4 3 7
different()  false
 */
public class Numbers {
    int n1,n2,n3,n4,n5;

    public Numbers(int n1, int n2, int n3, int n4, int n5) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        this.n5 = n5;
    }

    public boolean different(){
        int flag = 0;
        int[] arr = {n1, n2, n3, n4, n5};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++){
                if (arr[i]==arr[j]){
                    flag++;
                }
            }
        }
        if (flag==arr.length){
            return true;
        } else{
            return false;
        }
    }

    public static void main(String[] args) {
        Numbers num1 = new Numbers(3, 4, 2, 1, 6);
        System.out.println(num1.different());

        Numbers num2 = new Numbers(9, 7, 4, 3, 7);
        System.out.println(num2.different());

        Numbers num3 = new Numbers(1,2,3,4,5);
        System.out.println(num3.different());

        Numbers num4 = new Numbers(1,2,3,4,4);
        System.out.println(num4.different());
    }
    
}