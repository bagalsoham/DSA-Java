public class Power {
    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        int pnm1 = power(base, exponent - 1);
        int pn = base * pnm1;
        return pn;
    }
    public static void main(String[] args) {
        System.out.println(power(2, 5));
    }
}
