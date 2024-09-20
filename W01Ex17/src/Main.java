import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Variable
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập: ");
        int a=sc.nextInt();

        //Input

        //Process
        if (a == 0) {
            //Output
            System.out.println("Zero");
        }
        else if (a % 2 == 0) {
            //Output
            System.out.println("Chan");
        }
        else {
            //Output
            System.out.println("le");
        }
    }
}