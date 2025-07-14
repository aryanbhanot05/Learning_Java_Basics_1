import java.util.*;

public class StringAlter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "Aryan Bhanot";
        String name2 = "Aryan Bhanot";
        String name1 = "   Aryan     ";
        int len = name.length();
        System.out.println("The lenght of your name is " + len);

        System.out.print("The given name in upper case ");
        System.out.println(name.toUpperCase());

        System.out.print("The given name in lower case ");
        System.out.println(name.toLowerCase());

        System.out.println("|" + name1 + "|");

        System.out.print("The given name1 trimmed from both sides ");
        System.out.println(name1.trim());

        System.out.print("Here is a string starting from 4nd position in name: ");
        System.out.println(name.substring(3));

        System.out.print("Here is a string starting from 4nd position and ending at 10th position in name: ");
        System.out.println(name.substring(3, 10));

        System.out.print("Letter a is replace by 1 and n by 2 in the name: ");
        System.out.println(name.toLowerCase().replace("a", "1")
                .replace("n", "2"));

        System.out.println("Does the name starts with Ary and ends with not?");
        System.out.println(name.startsWith("Ary"));
        System.out.println(name.endsWith("not"));

        System.out.println("What is the chracter at 7th position in the name?");
        System.out.println(name.charAt(6));

        System.out.println("At what index do the letter \"ha\" occur in the name?");
        System.out.println(name.indexOf("ha"));

        System.out.println("At what index do the letter \"a\" occur in the name?");
        System.out.println(name.toLowerCase().indexOf("a"));
        System.out.println(name.toLowerCase().indexOf("a", 1));
        System.out.println(name.toLowerCase().indexOf("a", 4));
        System.out
                .println(name.toLowerCase().indexOf("a", 9) + "(that means letter \"a\" does not exist after index 8)");

        System.out.println("Is the name given 'Aryan Bhanot'?");
        System.out.println(name.equals("Aryan Bhanot"));

        System.out.println("Is the name given 'AryAN BhanOT'? (Case Insensitive)");
        System.out.println(name.equalsIgnoreCase("AryAN BhanOT"));

        System.out.print("Enter you name: ");
        String name10 = sc.nextLine();
        System.out.println(name10);

        System.out.print("Again, Enter you name: ");
        String name11 = sc.next();
        System.out.println(name11);
        System.out.println(" This is the difference between nextLine() nad next() function.");

        System.out.println("To find weather the given two strings are equal or not: ");
        System.out.print(name + " and ");
        System.out.println(name2);
        System.out.println("the given two strings are equal.");
        if (name.compareToIgnoreCase(name2) == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        // this line of code would make the int stored as a string to work as a int again
        String num = "21";
        int num1 = Integer.parseInt(num);
        System.out.println(num1 * 2);

        // Count number of words present in a line
        String words = "This is a test line for counting words.";
        int countWords = words.split("\\s").length;
        System.out.println(countWords);

        // Reverse a String
        String originalStr = "Hello";
        String reversedStr = "";

        for (int i = 0; i < originalStr.length(); i++) {
            reversedStr = originalStr.charAt(i) + reversedStr;
        }
        
        System.out.println("Reversed string: "+ reversedStr);

        sc.close();
    }
}