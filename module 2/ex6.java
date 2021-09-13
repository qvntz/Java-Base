public static boolean isPowerOfTwo(int value) {
    value = Math.abs(value);
    return value != 0 && (value & (value - 1)) == 0;
}