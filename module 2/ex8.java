public static BigInteger factorial(int value) {
        BigInteger A = BigInteger.ONE;
        for (int i = 2; i <= value; i++) {
            A = A.multiply(BigInteger.valueOf(i));
        }
        return A;
    }

public static BigInteger factorial(int value) {
        if (value == 1 || value == 0) {
            return BigInteger.ONE;
        } else {
            return BigInteger.valueOf(value).multiply(factorial(value - 1));
        }
    }
