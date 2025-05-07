import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int n,i;
        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
    }
}