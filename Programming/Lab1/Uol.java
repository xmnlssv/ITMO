public class Uol {
    public static void main(String[] args) {
        long[] a = new long[] {4, 6, 8, 10, 12, 14, 16, 18};
        double[] x = new double[12];
        for (int i = 0; i < 12; i++) {
            x[i] = Math.random() * 10 - 4;
        }
        double[][] y = new double[8][12];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 12; j ++) {
                if (a[i] == 12) {
                    y[i][j] = Math.pow(Math.pow((3.0 / 4 * (2 * x[j] - 2)), 3), Math.sin(Math.pow(x[j], 1.0 / 3)));
                } else if ((a[i] == 6) || (a[i] == 8) || (a[i]== 16) || (a[i] == 18)) {
                    y[i][j] = Math.pow(0.25 - (Math.pow(Math.pow(x[j] / 0.25, 3), 4 * Math.pow(x[j] / 6, 2)) / 3), Math.pow(1.0 / 3 / Math.pow(x[j], 1.0 / 3), 2));
                } else {
                    y[i][j] = Math.log(Math.pow(Math.tan(Math.tan(Math.pow(Math.E, Math.atan((x[j] + 1) * Math.E + 1)))), 2));
                }
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.printf("%.2f", y[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
