public class isPrimeProduct {
    public static void main(String[] args) {
        System.out.println("This is Prime Product of 22: " + is_prime_product(22));
        System.out.println("This is Prime Product of 33: " + is_prime_product(33));
        System.out.println("This is Prime Product of 33: " + is_prime_product(11));
    }

    static boolean is_prime_product(int num) {
        int count = 0;
        for (int i = 2; count < 2 && i * i <= num; ++i) {
            while (num % i == 0) {
                num = num / i;
                ++count;
            }
        }
        if (num > 1) {
            ++count;
        }

        return count == 2;
    }
}
