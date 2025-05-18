import java.util.Scanner;

class Break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the numbers: ");
        int low = sc.nextInt();
        int high = sc.nextInt();

        int i = low;
        while (i <= high) {
            System.out.print(i + " ");

            if (i % 13 == 0)
                break;
            i++;
        }
    }
}