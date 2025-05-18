import java.util.Scanner;

public class PowerN2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of base : ");
        double base = sc.nextDouble();
        System.out.print("Enter the value of exponent : ");
        int exp = sc.nextInt();

        double result = 1;

        while (exp != 0) {
            result = result * base;
            --exp;
        }

        System.out.println("Answer = " + result);

        sc.close();

    }
}