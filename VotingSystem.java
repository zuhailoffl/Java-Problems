import java.util.Scanner;

public class VotingSystem {
    public static void main(String[] args)
    {
       
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        if(age >= 18)
            System.out.println("Vote");
        else
            System.out.println("Can not Vote");
        sc.close();
    }
}