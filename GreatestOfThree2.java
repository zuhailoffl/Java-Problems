import java.util.Scanner;

public class GreatestOfThree2 {
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

        temp = first > second ? first : second;

        result = temp > third ? temp : third;

        System.out.println(result + " is the largest");

        sc.close();
    }
}