public class Swapping_2_numbers {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;
        System.out.println("Before Swapping : num1 = " + num1 + " & num2 = " + num2);
        // Method 1 using temporary
        int temp = 0;
        temp = num1; // num1 -> temp
        num1 = num2; // 2 ->3
        num2 = temp;
        System.out.println("After Swapping : num1 = " + num1 + " & num2 = " + num2);

        // Method 2 without using temporary variables
        num1 = num1 + num2; // 2+3 = 5
        num2 = num1 - num2; // 5-3 = 2
        num1 = num1 - num2; // 5-2 = 3
        System.out.println("After Swapping : num1 = " + num1 + " & num2 = " + num2);
    }
}