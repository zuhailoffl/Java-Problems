import java.util.Scanner;

public class VotingUisngString 
{
    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        String result = age >=18 ? "Vote" : "Can not Vote";

        System.out.println(result);
    }
    // int temp = age >=18 ? System.out.println("Vote") : System.out.println("Can not Vote"); if wanted    }
}