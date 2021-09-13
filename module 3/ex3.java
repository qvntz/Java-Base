public static double integrate(DoubleUnaryOperator f, double a, double b) {
    double step = 1e-7;
    double sum = 0;
    for (double x = a; x < b; x += step)
        sum += step * f.applyAsDouble(x);
    
    return sum;
}