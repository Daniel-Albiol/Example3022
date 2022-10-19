import java.util.Scanner;

public class Example3022 {
    public static void main(String[] argv) {
        int n, f;
        System.out.println("Enter a number:");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        n = inputValue.nextInt();
        f = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
