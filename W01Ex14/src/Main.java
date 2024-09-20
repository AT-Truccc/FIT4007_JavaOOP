public class Main {
    public static void main(String[] args) {
        //Variable
        int n = 11;
        int sum = 0;

        //Input

        //Process
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

        //Output
        System.out.println( + sum );
    }
}