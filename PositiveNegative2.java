import java.util.Scanner;
public class PositiveNegativeMark
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the mark : ");
        int mark = sc.nextInt();
        
        if(mark==0)
        {
        System.out.print("zero");
            
        }
        else
        {
        String result = mark > 0 ? "Positive" : "Negative";
        System.out.print(result);
        }
        sc.close();
    }
}