class IsBalanceArray {
    public static void main(String[] args) {
        System.out.println("Is balanced array: {-2, 2, 2, 2} :" + isBalanced(new int[] { -2, 2, 2, 2 }));

        System.out.println("Is balanced array: {-5, 2, 2} :" + isBalanced(new int[] { -5, 2, 2 }));

        System.out.println("Is balanced array: {-2, 3, 2, -3} :" + isBalanced(new int[] { -2, 3, 2, -3 }));

    }

    public static boolean isBalanced(int[] a) {
        boolean isBalanced = true;
        int len = a.length;

        for (int i = 0; i < len; i++) {
            boolean isValid = false;
            for (int j = 0; j < len; j++) {
                if (a[i] == -a[j]) {
                    isValid = true;
                    break;
                }
            }
            if (!isValid)
                isBalanced = false;
        }
        return isBalanced;
    }
}