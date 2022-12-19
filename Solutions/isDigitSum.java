public class isDigitSum {
    public static void main(String[] args) {
        System.out.println("isDigitSum: " + isDigitNum(32121, 10));
        System.out.println("isDigitSum: " + isDigitNum(13, 6));
        System.out.println("isDigitSum: " + isDigitNum(3, 3));
    }

    static boolean isDigitNum(int n, int numCompare) {
        int r = sum(n);
        return r < numCompare;
    }

    static int sum(int n) {
        int sum = 0;
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }

}
