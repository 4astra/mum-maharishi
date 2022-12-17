public class nextPerfectSquareV2 {
    public static void main(String[] args) {
        System.out.println("Next perect square to 6 is: " + findNextPerfectSquare(6));
        System.out.println("Next perfect square to 36 is: " + findNextPerfectSquare(36));
        System.out.println("Next perfect square to 0 is: " + findNextPerfectSquare(0));
        System.out.println("Next perfect square to -5 is: " + findNextPerfectSquare(-5));
    }

    static int findNextPerfectSquare(int num) {
        if (num < 0)
            return 0;

        for (int i = num + 1;; i++) {
            if (isPerfectSquare(i)) {
                return i;
            }
        }
    }

    static boolean isPerfectSquare(int num) {
        double squareRoot = Math.sqrt(num);
        return squareRoot - Math.floor(squareRoot) == 0;
    }
}
