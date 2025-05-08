import java.util.Scanner;
public class Largest_Number
{
    public static void main(String[]args)
    {
        int i,n,max,num;
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers you want to compare? = ");
        n=sc.nextInt();

        max=Integer.MIN_VALUE;

        for(i=1;i<=n;i++)
        {
            System.out.print("Enter your number: ");
            num=sc.nextInt();

            if(num>max)
                max=num;
        }
        System.out.print("The largest number is: "+max);
    }   
}