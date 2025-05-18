import java.util.Scanner;

class PowerN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of base : ");
        double base = sc.nextDouble();

        System.out.print("Enter the value of exponent : ");
        double exp = sc.nextDouble();

        System.out.println("Answer = " + Math.pow(base, exp));

        sc.close();
    }
}