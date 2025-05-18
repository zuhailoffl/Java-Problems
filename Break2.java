import java.util.Scanner;

class Break2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the numbers: ");
        int low = sc.nextInt();
        int high = sc.nextInt();

        for (int i = low; i <= high; i++) {
            System.out.print(i + " ");

            if (i % 13 == 0)
                break;
        }
    }
}