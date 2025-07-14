import java.util.*;

public class Two_D_Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows needed: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns needed: ");
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Enter the number to be entered at coordinates (" + i + "," + j + "): ");
                numbers[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        // If you want to search for a number
        System.out.print("Enter the number you want to search for: ");
        int x = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (numbers[i][j] == x) {
                    System.out.println("The required number is found at these coordinates: (" + i + "," + j + ")");
                }
            }
        }

        System.out.println(Arrays.deepToString(numbers));

        // Jagged Array

        // it is the comdition when we know the number of rows but are not sure about
        // the number of columns
        int[][] arr = new int[3][];
        arr[0] = new int[3];
        arr[1] = new int[4];
        arr[2] = new int[2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) ((Math.random()) * 101);
            }
        }

        // here we will use enhanced for loop which will detect size automatically
        // we can we it for printing only
        for (int n[] : arr) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
