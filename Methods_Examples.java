public class Methods_Examples {
    // 1 - Sum
    static int sum(int a, int b) {
        int c = a + b;
        return c;
    }

    // 2 - Amstrong Number Checker

    public static void Arms(int num) {
        int temp = num;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum = sum + (digit * digit * digit);
            num = num / 10;
        }

        if (temp == sum) {
            System.out.println(temp + " is an Armstrong Number");
        } // else {
          // System.out.println("Not an armstrong number !!");
          // }
    }

    // 3 - Factorial using Methods

    static int fac(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fac(n - 1);
        }
    }

    // 4 - Fibonacci Series

    static int fab(int n) {
        int a = 0;
        int b = 1;

        for (int i = 0; i < n - 1; i++) {
            System.out.print(a + ", ");
            int c = a + b;
            a = b;
            b = c;
        }
        return a;
    }

    public static void printFib(int a, int b, int n) {
        if (n == 0)
            return;

        int c = a + b;
        System.out.print(c);
        printFib(b, c, n - 1);
    }

    // 5 - Power of any number

    public static int power1(int a, int b) {
        // this is the memory efficient method with max stack height 2
        if (a == 0) {
            return 0;
        }
        if (b == 0) {
            return 1;
        }
        if (b % 2 == 0) {
            return power1(a, b / 2) * power1(a, b / 2);
        } else {
            return power1(a, b / 2) * power1(a, b / 2) * a;
        }
    }

    public static int power2(int a, int b) {
        // the is memory inefficient method
        if (a == 0) {
            return 0;
        }
        if (b == 0) {
            return 1;
        }
        return a * power2(a, b - 1);
    }

    // 6 - Sum of many num using methods

    static int sum(int... arr) {
        int r = 0;
        for (int a : arr) {
            r = r + a;
        }
        return r;
    }

    static int sum1(int b, int... arr) {
        // atleast 1 int is required
        int r = b;
        for (int a : arr) {
            r = r + a;
        }
        return r;
    }

    public static void main(String[] args) {
        // 1 - Sum
        int x = 2;
        int y = 3;
        int z = sum(x, y);
        System.out.println(z);
        System.out.println(sum(5, 6));

        // 2 - Amstrong Number Checker

        int num = 500;
        for (int i = 1; i <= num; i++) {
            Arms(i);
        }

        // 3 - Factorial using Methods

        System.out.println("here is the factorial of 5.");
        System.out.println(fac(5));

        // 4 - Fibonacci Series

        // using recurssion
        int a = 0, b = 1;
        System.out.print(a);
        System.out.print(b);
        int n = 7;
        printFib(a, b, n - 2);

        System.out.println("\n\n_____Next_____\n\n");
        // using iteration
        int ab = 5;
        System.out.println(fab(ab));

        // 5 - Power of any number

        int base = 2;
        int power = 5;
        System.out.println(power1(base, power)); // this is the memory efficient method with max stack height 2
        System.out.println(power2(base, power)); // the is memory inefficient method

        // we can use maths formula too
        System.out.println(Math.pow(2, 5));

        // 6 - Sum of many num using methods

        System.out.println("Sum of nothing is " + sum());
        System.out.println("Sum of 1 is " + sum(1));
        System.out.println("Sum of 1 and 2 is " + sum(1, 2));
        System.out.println("Sum of 1, 2 and 3 is " + sum(1, 2, 3));
        System.out.println("Sum of 1, 2, 3 and 4 is " + sum(1, 2, 3, 4));
        System.out.println("Sum of 1, 2, 3, 4 and 5 is " + sum(1, 2, 3, 4, 5));
        System.out.println("Sum of nothing using sum1 is " + sum1(0)); // atleast 1 int is required
    }
}