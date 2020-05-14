
import java.util.Arrays;

public class PrintArray{
    public static void main (String[] args) {
        int[] ns = { 1, 4, 9, 16, 25 };
        for (int i = (ns.length-1); i >= 0; i --) {
            System.out.println(ns[i]);
        }


        int[] ns2 = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
        Arrays.sort(ns2);
        System.out.println(Arrays.toString(ns2));


        int[][] ns22 = {
            { 1, 2, 3, 4 },
            { 5, 6, 7, 8 },
            { 9, 10, 11, 12 }
        };
        System.out.println(ns22.length); // 3



        int[][] ns23 = {
            { 1, 2, 3, 4 },
            { 5, 6, 7, 8 },
            { 9, 10, 11, 12 }
        };
        int[] arr1 = ns23[1];
        int[] arr2 = ns23[2];
        System.out.println(arr1.length); // 4
        System.out.println(arr2.length);



        int[][] ns24 = {
            { 1, 2, 3, 4 },
            { 5, 6, 7, 8 },
            { 9, 10, 11, 12 }
        };
        System.out.println(Arrays.deepToString(ns24));



        for (String arg : args) {
            if ("-version".equals(arg)) {
                System.out.println("v 1.0");
                break;
            }
        }

    }
}