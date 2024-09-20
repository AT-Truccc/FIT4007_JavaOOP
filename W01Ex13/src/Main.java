import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Variable
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("Nhập: ");
        int n = sc.nextInt();
        //Input

        // Process
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        //Output
        System.out.println( + sum);
    }
}