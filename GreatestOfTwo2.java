import java.util.Scanner;

public class GreatestOfTwo2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the two numbers");
        int first = sc.nextInt();
        int second = sc.nextInt();

        int largest = 0;

        if (num1 == num2)
            System.out.println("Both numbers are equal");
        else
            largest = (num1 > num2) ? num1 : num2;

        System.out.println(largest + " is the largest");

        sc.close();
    }
}