public class Main {
    public static void main(String[] args) {
        int n = 11;
        int sum = 0;

        if (n % 2 == 0) {
            for (int i = 1; i <= n; i += 2) {
                sum += i;
            }
        }
        else {
            for (int i = 2; i <= n; i += 2) {
                sum += i;
            }
        }

        System.out.println( + sum );
    }
}