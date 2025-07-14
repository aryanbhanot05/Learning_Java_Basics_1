// import java.util.Scanner;

public class Maths_exercises {
    public static void main(String[] args) {
        // // Addition of 3 numbers

        // int num1 = 10;
        // int num2 = 12;
        // int num3 = 14;
        // System.out.println("The sum of three numbers is: ");
        // System.out.print(num1 + num2 + num3);

        // // Float and Doubles

        // float f1 = 35e3f;
        // double d1 = 12E4d;
        // System.out.println(f1);
        // System.out.println(d1);
        // float fl = 12.24f;
        // System.out.printf("%.4f\n", fl);
        // System.out.printf("Sepcified Width %10.4f\n", fl);

        // // Digits Breaker

        // int num = 123;
        // int rev = 0;
        // while (num > 0) {
        // int rem = num % 10;
        // System.out.println(rem);
        // num = num / 10;
        // System.out.println("the updated num: " + num);
        // rev = rev * 10 + rem;
        // }

        // // if we want to reverse the number
        // System.out.println("Number reversed: " + rev);

        // // Integer or not

        // System.out.print("Enter the number: ");
        // Scanner sc = new Scanner(System.in);
        // System.out.print(sc.hasNextInt());

        // // Math Functions

        // System.out.println(Math.min(1, 2));
        // System.out.println(Math.max(1, 2));
        // System.out.println(Math.abs(-3));
        // System.out.println(Math.sqrt(16));
        // System.out.println(Math.pow(2, 5));
        // System.out.println(Math.cbrt(8));
        // System.out.println(Math.round(12.5));
        // System.out.println(Math.round(12.49));
        // System.out.println(Math.random()); // Range [0,1)
        // System.out.println(Math.log10(10));
        // System.out.println(Math.log(10));

        // // Multiplication Tables

        // System.out.println("Here are the tables of 2 and 3.");
        // int a = 2;
        // int b = 3;
        // int i = 1;
        // while (i <= 10) {
        // System.out.printf("%d x %d = %d\n", a, i, a * i);
        // i++;
        // }
        // System.out.println("\n\n");
        // int j = 1;
        // while (j <= 10) {
        // System.out.printf("%d x %d = %d\n", b, j, b * j);
        // j++;
        // }

        // // Numbers Input Addition

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter First Number: ");
        // int n1 = sc.nextInt();
        // System.out.print("Enter First Number: ");
        // int n2 = sc.nextInt();
        // System.out.print("The sum of the given numbers is ");
        // System.out.print(n1 + n2);

        // // Percentage Calculator

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your name ");
        // String name = sc.nextLine();
        // System.out.print("How many marks was the exam of: ");
        // Float total = sc.nextFloat();
        // System.out.print("How many marks did you obtain in Physics: ");
        // Float m1 = sc.nextFloat();
        // System.out.print("How many marks did you obtain in Chemistry: ");
        // float m2 = sc.nextFloat();
        // System.out.print("How many marks did you obtain in Maths: ");
        // float m3 = sc.nextFloat();
        // System.out.print("How many marks did you obtain in English: ");
        // float m4 = sc.nextFloat();
        // System.out.print("How many marks did you obtain in Computer Science: ");
        // float m5 = sc.nextFloat();
        // System.out.print("Congratulations " + name + "\nYou secured ");
        // System.out.printf("%.2f", (m1 + m2 + m3 + m4 + m5) / (total * 5) * 100);
        // System.out.print("% percent marks in your exams!");

        // // Percentage Calculator 2

        // Scanner sc = new Scanner(System.in);
        // System.out.print("What is your name: ");
        // String name = sc.nextLine();
        // System.out.print("What are the total number of marks the exams were of: ");
        // float total_marks = sc.nextFloat();
        // System.out.print("How much marks do you obtain in Physics: ");
        // float phy = sc.nextFloat();
        // System.out.print("How much marks do you obtain in Chemistry: ");
        // float chem = sc.nextFloat();
        // System.out.print("How much marks do you obtain in Maths: ");
        // Float maths = sc.nextFloat();
        // Float total_percentage = ((phy + chem + maths) * 100 / total_marks / 3);
        // Float ind_phy = (phy * 100 / total_marks);
        // Float ind_chem = (chem * 100 / total_marks);
        // Float ind_maths = (maths * 100 / total_marks);
        // if (total_percentage > 40 && ind_chem > 33 && ind_maths > 33 && ind_phy > 33)
        // {
        // System.out.print("You passed in your exam and your percentage is ");
        // System.out.println(total_percentage);
        // System.out.println("And you passed in all the three subjects by
        // obtaining:-");
        // System.out.println(ind_phy + "% in Physics");
        // System.out.println(ind_chem + "% in Chemistry");
        // System.out.println(ind_maths + "% in Maths");
        // } else {
        // System.out.print("You failed in your exam because ");
        // if (total_percentage < 40) {
        // System.out.println("your total percentage was less than required that is " +
        // total_percentage);
        // } else if (ind_phy < 33) {
        // System.out.println("your percentage in physics was less than required that is
        // " + ind_phy);
        // } else if (ind_chem < 33) {
        // System.out.println("your percentage in chemistry was less than required that
        // is " + ind_chem);
        // } else {
        // System.out.println("your percentage in maths was less than required that is "
        // + ind_maths);
        // }
        // }

        // // Sum of odd numbers using while loop

        // int i = 1;
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Sum of how many odd numbers do you want: ");
        // int j = sc.nextInt();
        // int num = 0;
        // while (i < j + 1) {
        // num = num + (2 * i - 1);
        // i++;
        // }
        // System.out.println("Sum of first " + j + " Odd Numbers is " + num + ".");

        // sc.close();
    }
}
