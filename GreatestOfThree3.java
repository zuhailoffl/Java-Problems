import java.util.Scanner;

public class GreatestOfThree3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int first = sc.nextInt();
        System.out.print("Enter the second number : ");
        int second = sc.nextInt();
        System.out.print("Enter the third number : ");
        int third = sc.nextInt();
        System.out.println();
        int temp, result;

        result = Math.max(first, Math.max(second, third));

        System.out.println(result + " is the largest");

        sc.close();
    }
}