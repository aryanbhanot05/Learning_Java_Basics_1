public class Sorting {
    public static void main(String[] args) {
        // // Bubble Sorting

        // int arr[] = { 7, 4, 2, 6, 8, 4 };
        // for (int i = 0; i < arr.length - 1; i++) {
        // for (int j = 0; j < arr.length - 1 - i; j++) {
        // if (arr[j] > arr[j + 1]) {
        // // the next 3 line display the swapping technique
        // int temp = arr[j];
        // arr[j] = arr[j + 1];
        // arr[j + 1] = temp;
        // }
        // }
        // }
        // for (int k = 0; k < arr.length; k++) {
        // System.out.print(arr[k] + " ");
        // }
        // System.out.println();

        // // Insertion Sorting

        int arr[] = { 7, 8, 1, 3, 2, 9 };
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // // Selection Sorting

        // int arr[] = { 7, 8, 3, 1, 2 };
        // for (int i = 0; i < arr.length - 1; i++) {
        // int sm = i;
        // for (int j = i + 1; j < arr.length; j++) {
        // if (arr[sm] > arr[j]) {
        // sm = j;
        // }
        // }
        // int temp = arr[sm];
        // arr[sm] = arr[i];
        // arr[i] = temp;
        // }

        // for (int k = 0; k < arr.length; k++) {
        // System.out.print(arr[k] + " ");
        // }
    }
}
