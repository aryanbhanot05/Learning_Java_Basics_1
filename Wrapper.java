public class Wrapper {
    public static void main(String[] args) {
        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';
        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);

        Integer myInt2 = 5;
        Double myDouble2 = 5.99;
        Character myChar2 = 'A';
        System.out.println(myInt2.intValue());
        System.out.println(myDouble2.doubleValue());
        System.out.println(myChar2.charValue());

        Integer myInt3 = 100;
        String myString = myInt3.toString();
        System.out.println(myString.length());

        int num = 7;
        Integer num1 = num;
        System.out.println(num1);
        int num2 = num1.intValue() + 5;
        System.out.println(num2);

        String numb = "12";
        // System.out.println(numb*2); -> error
        Integer nu = Integer.parseInt(numb);
        System.out.println(nu * 10);
    }
}
