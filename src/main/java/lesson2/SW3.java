package lesson2;

public class SW3 {
    public static void main(String[] args) {
        maxInt(1,2,3);
    }
        public static void maxInt(int a, int b, int c) {
            int max = a;

            if (b > max) {
                max = b;
            }

            if (c > max) {
                max = c;
            }
            System.out.println(max);
    }
}
