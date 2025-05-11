import java.util.Scanner;
public class Multiplication_Table 
{
    public static void main(String[]args)
    {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n=sc.nextInt();

        for(int i=0;i<=10;i++)
        {
            System.out.println(n+"x"+i+"="+i*n);
        }
    }
}