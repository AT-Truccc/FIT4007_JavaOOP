public class Main {
    public static void main(String[] args) {
        //Variable

        //Input
        int sum = 0;

        //Process
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        
        //Output
        System.out.println(+sum);
    }
}