import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int numb = sc.nextInt();

        if (numb % 2 == 0)
            System.out.print("Even");
        else
            System.out.print("Odd");
        sc.close();
    }
}