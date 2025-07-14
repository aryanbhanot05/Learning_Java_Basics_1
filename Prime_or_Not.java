public class Prime_or_Not {
    public static void main(String[] args) {
        long num = 1323921891;
        boolean checker = false;

        // slowest method
        System.out.println(num);
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                checker = true;
            } else {
                System.out.println("It's a prime number.");
                break;
            }
            if (checker) {
                System.out.println("It's a composite number.");
                break;
            }
        }

        // Moderate method
        System.out.println(num / 2);
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                checker = true;
            } else {
                System.out.println("It's a prime number.");
                break;
            }
            if (checker) {
                System.out.println("It's a composite number.");
                break;
            }
        }

        // fastest method
        System.out.println(Math.sqrt(num));
        for (int i = 2; i <= (Math.sqrt(num)); i++) {
            if (num % i == 0) {
                checker = true;
            } else {
                System.out.println("It's a prime number.");
                break;
            }
            if (checker) {
                System.out.println("It's a composite number.");
                break;
            }
        }
    }
}