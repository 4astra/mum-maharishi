public class isPerfectSquare {
    public static void main(String[] args) {
        System.out.println("is perfect square with 8" + is_perfect_square(8));
    }

    static boolean is_perfect_square(int num) {
        double squareRoot = Math.sqrt(num);
        System.out.println("squareRoot: " + squareRoot);
        System.out.println("squareRoot floor:" + Math.floor(squareRoot));
        return squareRoot - Math.floor(squareRoot) == 0;
    }
}
