package lesson5.homework;

public class MyMath {

    private static double result = 1;

    public static double power(double val, int power) {
        if (power == 0) {
            try {
                return result;
            } finally {
                result = 1;
            }
        }
        if (power > 0) {
            result *= val;
            return power(val, --power);
        } else {
            result /= val;
            return power(val, ++power);
        }
    }

    public static void main(String[] args) {
        System.out.println(power(2, 3));
        System.out.println(power(2, 7));
    }
}