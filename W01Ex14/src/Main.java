import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Variable
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("Nhập: ");
        int n = sc.nextInt();

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