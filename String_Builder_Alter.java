public class String_Builder_Alter {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        System.out.println("The chracter available at 3rd position is: " + sb.charAt(2));

        System.out.println("Replace \"T\" by \"P\" : " + sb.replace(0, 0, "P"));
        // if we do not select any index then the string will be added in front of the
        // original string, change the start and end int

        // we can insert too
        System.out.println(sb.insert(0, sb));

        System.out.print("Replace the 2nd char by \"u\" using setCharAt function: ");
        sb.setCharAt(1, 'u');
        System.out.println(sb);

        // now, we will delete the chracter Puony from the front
        System.out.println(sb.delete(0, 5));

        // Add character to a string
        StringBuilder a = new StringBuilder("h");
        System.out.println(a);
        System.out.println(a.append("e"));
        a.append("l");
        a.append("l");
        a.append("o");
        System.out.println(a);

        // reverse a string

        StringBuilder b = new StringBuilder("");

        for (int i = a.length() - 1; i >= 0; i--) {
            b.append(a.charAt(i));
        }
        System.out.println(b);
    }
}