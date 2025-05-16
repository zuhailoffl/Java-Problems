import java.util.Scanner;
public class PositiveNegative
{
   public static void main(String[]args)
   {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int numb = sc.nextInt();
    
    if(numb>0){
    System.out.print("Positive");}
    else if(numb<0){
    System.out.print("Negative");}
    else{
    System.out.print("zero");}
    
    sc.close();
   }
}