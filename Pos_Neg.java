import java.util.Scanner;
public class Pos_Neg {
    public static void main(String[]args)
    {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        if(n>0)
            System.out.println("Positive number");
        else if(n<0)
            System.out.println("Negative number");
        else
            System.out.println("Zero");
    }    
}
