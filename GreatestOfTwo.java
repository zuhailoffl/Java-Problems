import java.util.Scanner;

public class GreatestOfTwo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number : ");
        int num2 = sc.nextInt();

        if (num1 > num2)
            System.out.println(num1 + " is greater than " + num2);
        else if (num2 > num1)
            System.out.println(num2 + " is greater than " + num1);
        else
            System.out.println("Both numbers are Equal");

        sc.close();
    }
}