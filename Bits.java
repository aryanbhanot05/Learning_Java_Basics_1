public class Bits {
    public static void main(String[] args) {

        // And (Get Bit)
        int n = 5;
        int pos = 1;
        int BitMask = 1 << pos;

        int a = BitMask & n;
        System.out.println(a);
        if (a == 0) {
            System.out.println("Bits includes 0");
        } else {
            System.out.println("Bits includes 1");
        }

        // or (Set Bit)

        int b = BitMask | n;
        System.out.println(b);
        if (b == 0) {
            System.out.println("Bits includes 0");
        } else {
            System.out.println("Bits includes 1");
        }

        // and not (Clear Bit)

        int c = BitMask ^ n;
        System.out.println(c);
        if (c == 0) {
            System.out.println("Bits includes 0");
        } else {
            System.out.println("Bits includes 1");
        }

        // update 1 at any position

        int d = BitMask | n;
        System.out.println(d);

        // update 0 at any position

        int e = ~(BitMask);
        int f = e & n;
        System.out.println(f);
    }
}