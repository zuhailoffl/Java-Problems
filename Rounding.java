import java.util.Scanner;

public class Rounding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        double numb = sc.nextDouble();

        System.out.println(Math.round(numb));
        System.out.println(Math.floor(numb));
        System.out.println(Math.ceil(numb));
        sc.close();
    }
}