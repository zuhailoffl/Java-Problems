import java.util.Scanner;
public class NaturalUsingDowhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int i = 1;

        do{
            System.out.print(i + " ");
            i++;
        }while (i<=num);
    }
}