// import java.util.Scanner;

public class Nested_Loops {
    public static void main(String[] args) {
        // // 1

        // int i, j = 1;
        // for (i = 1; i < 5; i++) {
        // for (j = 1; j < 5; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // // 2

        // int i, j = 1;
        // for (i = 1; i < 5; i++) {
        // for (j = 1; j < 5; j++) {
        // if (i == 1 || i == 4 || j == 1 || j == 4) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // // 3

        // for (int i = 1; i < 5; i++) {
        // for (int j = 1; j < i; j++) {
        // System.out.print("*");
        // }
        // System.out.println("*");
        // }

        // // 4

        // for (int i = 5; i > 0; i--) {
        // for (int j = 0; j < i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // // 5

        // for (int i = 0; i < 5; i++) {
        // for (int j = 0; j < 5 - i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // // 6

        // for (int i = 0; i < 5; i++) {
        // for (int j = 0; j < 5 - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 0; j < i; j++) {
        // System.out.print("*");
        // }
        // System.out.println("*");
        // }

        // // 7

        // for (int i = 0; i < 5; i++) {
        // for (int j = 0; j < i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // // 8

        // for (int i = 5; i > 0; i--) {
        // for (int j = 0; j < i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // // 9

        // int num = 1;
        // for (int i = 0; i < 6; i++) {
        // for (int j = 0; j < i; j++) {
        // System.out.print(num + " ");
        // num = num + 1;
        // }
        // System.out.println();
        // }

        // // 10

        // for (int i = 0; i < 5; i++) {
        // for (int j = 0; j <= i; j++) {
        // if ((i + j) % 2 == 0) {
        // System.out.print("1");
        // } else {
        // System.out.print("0");
        // }
        // }
        // System.out.println();
        // }

        // // 11

        // for (int i = 0; i < 8; i++) {
        // for (int j = 0; j < 8; j++) {
        // if (i == j || j == 0 || j == 7) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // // 12

        // Scanner sc = new Scanner(System.in);
        // System.out.print("What must be the size of wing of butterfly: ");
        // int n = sc.nextInt();
        // int i, j = 1;

        // for (i = 1; i <= n; i++) {
        // for (j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // for (j = 1; j <= 2 * (n - i); j++) {
        // System.out.print(" ");
        // }
        // for (j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }
        // for (i = n; i >= 1; i--) {
        // for (j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // for (j = 1; j <= 2 * (n - i); j++) {
        // System.out.print(" ");
        // }
        // for (j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // // 13

        // int n = 5;
        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= n; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // // 14

        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print(i + " ");
        // }
        // System.out.println();
        // }

        // // 15

        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = i; j >= 1; j--) {
        // System.out.print(j);
        // }
        // for (int j = 2; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // // 16

        // int n = 5;
        // int i, j = 1;

        // for (i = 1; i <= n; i++) {
        // for (j = n - i; j >= 1; j--) {
        // System.out.print(" ");
        // }
        // for (j = 1; j <= 2 * i - 1; j++) {
        // System.out.print("*");
        // }
        // for (j = n - i; j >= 1; j--) {
        // System.out.print(" ");
        // }
        // System.out.println();
        // }
        // for (i = n; i >= 1; i--) {
        // for (j = n - i; j >= 1; j--) {
        // System.out.print(" ");
        // }
        // for (j = 1; j <= 2 * i - 1; j++) {
        // System.out.print("*");
        // }
        // for (j = n - i; j >= 1; j--) {
        // System.out.print(" ");
        // }
        // System.out.println();
        // }

        // sc.close();
    }
}