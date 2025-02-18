public class LinearRegression {
    public static void main(String[] args) {
        double[] x = {14.2, 16.4, 11.9, 15.2, 18.5, 22.1, 19.4, 25.1, 23.4, 18.1, 22.6, 17.2};
        double[] y = {215, 325, 185, 332, 406, 522, 412, 614, 544, 421, 445, 408};

        System.out.println(calcM(x, y));
        System.out.println(calcB(x, y));
    }

    public static double calcM(double[] x, double[] y) {
        double m = 0;
        double[] vars = calcSums(x, y);
    
        m = (x.length * vars[2] - vars[0] * vars[1]) / (x.length * vars[3] - vars[0] * vars[0]);
        return m;
    }

    public static double calcB(double[] x, double[] y) {
        double b = 0;
        double [] vars = calcSums(x, y);
        b = (vars[1] - calcM(x, y) * vars[0]) / x.length;
        return b;
        }

    public static double[] calcSums(double[] x, double[] y) {
        double sumX = 0;
        double sumY = 0;
        double sumXY = 0;
        double sumX2 = 0;

        for (int i = 0; i < x.length; i++) {
            sumX += x[i];
            sumY += y[i];
            sumXY += x[i] * y[i];
            sumX2 += x[i] * x[i];
        }

        return new double[] {sumX, sumY, sumXY, sumX2};
    }
}