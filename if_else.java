import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // If , Else , Else if

        System.out.print("Enter the years of experience you have obtained: ");
        int y = sc.nextInt();
        if (y >= 20) {
            System.out.println("You are Expert!");
        } else if (y >= 10) {
            System.out.println("You are Experienced!");
        } else {
            System.out.println("You need to obtain more experience!\n#LowExperience");
        }

        // Ternary Operator

        int a = 2;
        int b = 3;
        if (a > b) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        // this is the normal method which involves multiple lines of code

        // here we used ternary operation to compress code in a line
        boolean bl = (a > b) ? true : false;
        System.out.println(bl);
        // remember we cannot use "True" with a capital "T" as a variable as it is
        // already defined as a boolean

        // Switch Case

        System.out.println(
                "Hello User!\nIn which language would you like to talk?\n# press: 1:English  2:Hindi  3:Punjabi");
        Integer lan = sc.nextInt();
        switch (lan) {
            case 1:
                System.out.println("English Activated");
                break;
            case 2:
                System.out.println("Hindi Activated");
                break;
            case 3:
                System.out.println("Punjabi Activated");
                break;
            default:
                System.out.println("Wrong Input");
        }

        sc.close();
    }
}
