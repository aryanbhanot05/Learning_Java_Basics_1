import java.util.Arrays;
import java.util.Scanner;

public class Array_Alter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input of an array
        System.out.print("how many numbers are to be stored in 1D array: ");
        int z = sc.nextInt();
        int a1[] = new int[z];
        for (int i = 0; i < z; i++) {
            System.out.print("Enter the number at " + (i + 1) + " place is: ");
            a1[i] = sc.nextInt();
        }
        for (int e : a1) {
            System.out.print(e);
        }
        System.out.println();

        // Sum of all numbers in a array

        float[] num = { 50.6f, 64.5f, 25.7f, 93.5f, 19.2f };
        float n = 0;
        // for (int i = 0; i < num.length; i++) {
        for (float i : num) {
            n = n + i;
        }
        System.out.println("Sum of all floats is: " + n);

        // Is a number present in the array

        boolean isInArray = false;
        float n1 = 19.4f;
        for (float i : num) {
            if (n1 == i) {
                isInArray = true;
            }
        }
        if (isInArray == true) {
            System.out.println("The number is in the array.");
        } else {
            System.out.println("The number is not in the array.");
        }
        // If we apply single '=' , answer would always be true

        // Sum of two matrices

        int[][] mat1 = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] mat2 = { { 7, 8, 9 }, { 10, 15, 36 } };
        int[][] result = { { 0, 0, 0 }, { 0, 0, 0 } };
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        // reverse print an array

        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int l = arr.length;
        int m = Math.floorDiv(l, 2);
        int temp;
        for (int i = 0; i < m; i++) {
            temp = arr[i];
            arr[i] = arr[l - i - 1];
            arr[l - i - 1] = temp;
        }
        for (int e : arr) {
            System.out.print(e + " ");
        }

        // find the max. number

        int maxi = arr[0];
        int mini = arr[0];
        for (int e : arr) {
            if (e > maxi) {
                maxi = e;
            }
            if (e < mini) {
                mini = e;
            }
        }
        System.out.println("The maximum number in the Array is " + maxi);
        System.out.println("The minimum number in the Array is " + mini);

        // max and min int

        int maxi1 = Integer.MAX_VALUE;
        int mini1 = Integer.MIN_VALUE;
        System.out.println(maxi1);
        System.out.println(mini1);

        // array is sorted or not ie. is increasing or not

        int[] arr1 = { 0, 1, 3, 4, 6, 7, 8, 9 };
        int[] arr2 = { 2, 5, 7, 4, 2, 9 };
        boolean isSorted = true;
        for (int i = 0; i < arr1.length - 1; i++) {
            if (arr1[i] > arr1[i + 1]) {
                System.out.println(arr1[i]);
                System.out.println(arr1[i + 1]);
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("the string is sorted!");
        } else {
            System.out.println("the string is not sorted!");
        }

        for (int i = 0; i < arr2.length - 1; i++) {
            if (arr2[i] > arr2[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("the string is sorted!");
        } else {
            System.out.println("the string is not sorted!");
        }

        // print array without using any loops
        int abc[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(Arrays.toString(abc));

        // print 2D array without using any loops
        int[][] abced = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 } };
        System.out.println(Arrays.deepToString(abced));

        sc.close();
    }
}