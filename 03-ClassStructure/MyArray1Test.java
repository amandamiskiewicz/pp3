import java.util.*;

public class MyArray1Test {
    public static void main(String[] args) {
        int[] a1={1,2,3,4};
        System.out.println("a) " + MyArray1.even(a1));

        int[] b1={-2,-1,0,1,2};
        System.out.println("b) " + MyArray1.positiveOdd(b1));

        int[] c1={-2,-1,0,1,2};
        System.out.println("c) " + Arrays.toString(MyArray1.reverse(c1)));

        int[] d1={-2,-1,0,1,2};
        int[] d2t={-2,-1,0,1,2};
        int[] d2f={-2,-1,0,1,3};
        System.out.println("d1) " + MyArray1.compare(d1,d2t));
        System.out.println("d2) " + MyArray1.compare(d1,d2f));

        int[] e1={-2,-1,0,1,2,3,4};
        int[] e2={-2,-1,0,1,2};
        System.out.println("e) " + MyArray1.different(e1, e2));

        int[] f1={-2,-1,0,1,2};
        System.out.println("f) " + MyArray1.exist(-2, f1));

        int[] g1={-2,-1,0,1,2};
        System.out.println("g) " + MyArray1.secondMax(g1));

        int[][] h1={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("h) " + MyArray1.lastColumn(h1));

        int[][] i1={{1,2,3},{4,5,6},{7,8,9}};
        MyArray1.printArray(MyArray1.swap(i1));

        int[][] j1={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("j) " + MyArray1.two2one(j1));


    }
}
