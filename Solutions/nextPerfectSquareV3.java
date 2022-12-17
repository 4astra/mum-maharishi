public class nextPerfectSquareV3 {
    public static void main(String[] args) {
        System.out.println("Next perfect square to 6 is: " + nextPerfectSquare(6));
        System.out.println("Next perfect square to 36 is: " + nextPerfectSquare(36));
        System.out.println("Next perfect square to 0 is: " + nextPerfectSquare(0));
        System.out.println("Next perfect square to -5 is: " + nextPerfectSquare(-5));
    }

    static int nextPerfectSquare(int num) {
        int nxt = (int) Math.floor(Math.sqrt(num)) + 1;
        return nxt * nxt;
    }
}
