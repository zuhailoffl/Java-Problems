import java.util.Scanner;

public class EvenOdd2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int numb = sc.nextInt();

        if (numb % 2 == 1)
            System.out.print("Odd");
        else
            System.out.print("Even");
        sc.close();
    }
}