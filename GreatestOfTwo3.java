import java.util.Scanner;

public class GreatestOfTwo3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        r
        System.out.print("Enter the first number : ");
        int first = sc.nextInt();
    
        System.out.print("Enter the second number : ");
        int second = sc.nextInt();

        int largest = 0;

        
        if(first == second)
            System.out.println("Both numbers are equal");
        else
            System.out.println(Math.max(first, second));

        
        sc.close();
    }
}